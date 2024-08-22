package Sorting;

import java.util.Arrays;

public class Sort_Selection {
    static void selection(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }


    public static void main(String[] args) {
        int[] array = {5,3,4,1,2};
        selection(array);
    }

}
