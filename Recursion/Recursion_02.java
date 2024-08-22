package Recursion;

import java.util.ArrayList;

public class Recursion_02 {
    public static void main(String[] args) {

        // Array is sorted or not   // check the 25th line
//            int[] arr = {1, 3, 5, 7, 7, 9};
//            int i = 0;
//            if (isSorted(arr, i)) {
//                System.out.println("Array is sorted");
//            } else {
//                System.out.println("Array is not sorted");
//            }

        // Finding key in an Array
//            int[] brr = {1,3,5,7,9};
//            int index = getIndexOfKey(brr, 7, 0);
//            System.out.println(index);

        // Putting the indexes which are holding the same value in an ArrayList
//            int[] arr = {1,9,3,5,7,4,2,5,6,8,7,4,2,4,5,8,9,6,4,2,7};
//            getIndex1(arr,7,0);
//            System.out.println(list);

//            int[] arr = {1,9,3,5,7,4,2,5,6,8,7,4,2,4,5,8,9,6,4,2,7};
//            ArrayList<Integer> list = new ArrayList<>();
//            getIndex2(arr,4,0, list);
//            System.out.println(list);

//            int[] arr = {1,9,3,5,7,4,2,5,6,8,7,4,2,4,5,8,9,6,4,2,7};
//            ArrayList<Integer> ans = getIndex3(arr,7,0,new ArrayList<Integer>());
//            System.out.println(ans);
    }


    static boolean isSorted(int[] arr, int curr) {
        if(curr == arr.length-1) {
            return true;
        }
        return (arr[curr] <= arr[curr+1]) && (isSorted(arr, curr+1));
    }

    static int getIndexOfKey(int[] arr, int k, int i) {
        if(i == arr.length) {
            return -1;
        }
        return (arr[i] == k) ? i : (getIndexOfKey(arr, k, i+1));
    }

    static ArrayList<Integer> list = new ArrayList<>();     // Method 01
    static int getIndex1(int[] arr, int k, int i) {
        if(i == arr.length) {
            return -1;
        }

        if (arr[i] == k)
            list.add(i);
        return getIndex1(arr, k, i + 1);
    }

    static int getIndex2(int[] arr, int k, int i,  ArrayList<Integer> l) {
        if(i == arr.length) {
            return -1;
        }

        if (arr[i] == k)
            l.add(i);
        return getIndex2(arr, k, i + 1, l);
    }       // Method 02

    static ArrayList<Integer> getIndex3(int[] arr, int k, int i, ArrayList<Integer> l) {
        if(i == arr.length) {
            return l;
        }

        if (arr[i] == k)
            l.add(i);
        return getIndex3(arr, k, i + 1, l);
    }       //Method 03

}


