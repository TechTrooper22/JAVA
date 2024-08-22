package Sorting;

import java.util.Arrays;

public class Sort_Bubble {
    static void  bubble(int[] arr) {
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // In a particular step, if swapping does not occur, means all elements are sorted.
            // Hence, we don't need to check for further steps, we can break the loop.
            boolean swapped = false;
            // for each step, max item will come at the last respective index,
            // hence we don't need to include it in the array that's why we are ranging 'j' up to 'arr.length-i' which will not include the max number.
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) { // swapping does not occur.
                break;
            }

            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Sorted array --> " + Arrays.toString(arr) + "\n");
    }


    public static void main(String[] args) {
        int[] array = {3,1,5,4,2};
        int[] array1 = {1,2,3,4,5}; // the array is already sorted hence the loop will be break in the first iteration
        bubble(array);
        bubble(array1);
    }
}
