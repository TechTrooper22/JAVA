package Sorting;

import java.util.Arrays;

public class Sort_Insertion {

    static void insertion(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        insertion(array);
        System.out.println("Unsorted array: " + Arrays.toString(array));
    }
}
