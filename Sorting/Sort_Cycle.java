package Sorting;

import java.util.Arrays;

public class Sort_Cycle {
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,5,2,1,4};
        cyclic(array);
        System.out.println(Arrays.toString(array));
    }
}
