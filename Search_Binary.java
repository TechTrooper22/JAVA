import java.util.Scanner;

public class Search_Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {2,6,12,23,38,47,55,57,89,98};
        int[] brr = {98,89,57,55,47,38,23,12,6,2};
        int key = 54;

        char[] ch = {'c', 'f', 'l', 'p', 't', 'x'};
        char c = 'i';

        // Searching in int[]
//            int ans = intBinarySearch(arr, key);
//            System.out.println("Element found at an index " + ans);

        // Searching in Ascending & Descending Array
//            int asc = AscDscBinarySearch(arr, key);
//            System.out.println("Element found at an index " + asc);
//            int dsc = AscDscBinarySearch(brr, key);
//            System.out.println("Element found at an index " + dsc);

        // Ceiling of the Number - Searching x (x >= key, greater than or nearest to x)
//            int ans = xBinarySearch(arr, key);
//            System.out.println("Element found : " + ans);

        // Floor of the Number - Searching y (y <= key, smaller than or nearest to y)
//            int ans = yBinarySearch(arr, key);
//            System.out.println("Element found: " + ans);

        // Ceiling of the Character
//            char ans = charBinarySearch(ch, c);
//            System.out.println("Element found: " + ans);

        // First & Last Occurrence of the Element.
//            int[] orr = {3,5,7,7,7,7,9,9};
//            int ele = 7;
//
//            int first = occurrenceFirstLast(orr, ele, true);
//            System.out.println("First occurrence found at index " + first);
//
//            int last = occurrenceFirstLast(orr, ele, false);
//            System.out.println("Last occurrence found at index " + last);

        // Setting range to search in an infinite array.
//            int[] irr = {
//                    1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39,
//                    41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79,
//                    81, 83, 85, 87, 89, 91, 93, 95, 97, 99, 101, 103, 105, 107, 109, 111, 113, 115, 117, 119,
//                    121, 123, 125, 127, 129, 131, 133, 135, 137, 139, 141, 143, 145, 147, 149, 151, 153, 155, 157, 159,
//                    161, 163, 165, 167, 169, 171, 173, 175, 177, 179, 181, 183, 185, 187, 189, 191, 193, 195, 197, 199,
//                    201, 203, 205, 207, 209, 211, 213, 215, 217, 219, 221, 223, 225, 227, 229, 231, 233, 235, 237, 239,
//                    241, 243, 245, 247, 249, 251, 253, 255, 257, 259, 261, 263, 265, 267, 269, 271, 273, 275, 277, 279,
//                    281, 283, 285, 287, 289, 291, 293, 295, 297, 299, 301, 303, 305, 307, 309, 311, 313, 315, 317, 319,
//                    321, 323, 325, 327, 329, 331, 333, 335, 337, 339, 341, 343, 345, 347, 349, 351, 353, 355, 357, 359,
//                    361, 363, 365, 367, 369, 371, 373, 375, 377, 379, 381, 383, 385, 387, 389, 391, 393, 395, 397, 399, 400
//            };
//            int target = 207;
//            int ans = setRangeSearch(irr, target);
//            System.out.println(ans);

        // Finding peak element in a mountain array
//            int[] mrr = {2,4,6,8,7,5,3,1};
//            int[] ans = peakEle(mrr);
//            System.out.println(ans[0]); // prints element
//            System.out.println(ans[1]); // prints index

        // Searching an element in a mountain array
//        int[] mountainArray = {1, 3, 8, 12, 4, 2};
//        int target = 4;
//        int index = findInMountainArray(mountainArray, target);
//        System.out.println("Element " + target + " is found at index: " + index);

        // Searching the Pivot in rotated / circular array.
//            int[] prr = {4,5,6,7,0,1,2,3};
//            int p = findPivot(prr);
//            System.out.println(p);

        // Number of times the sorted array is rotated.
//            int[] crr = {4,5,6,7,8,0,1,2,3};
//            int co = countRotate(crr);
//            System.out.println(co+1);

        // Binary Search using Recursion
//            int[] arr1 = {1,3,5,7,9,11,13,15,17,19};
//            int key1 = 7;
//
//            int index = searchBinary(arr1, key1, 0, arr.length-1);
//            System.out.println(index);


        in.close(); // Closing the scanner to avoid resource leak
    }

    static int intBinarySearch(int[] arr, int key) {
        int start=0;
        int end=arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int AscDscBinarySearch(int[] crr, int k) {
        int s=0, e=crr.length-1;
        boolean Asc = crr[s] < crr[e];

        while(s <= e) {
            int mid = s + (e-s)/2;

            if(crr[mid] == k)
                return mid;

            if (Asc) {
                if (k > crr[mid]) {
                    s = mid + 1;
                }
                else {
                    e = mid - 1;
                }
            }
            else {
                if (k > crr[mid]) {
                    e = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            }
        }
        return -1;
    }

    static int xBinarySearch(int[] arr, int key) {
        int start=0;
        int end=arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
    }

    static int yBinarySearch(int[] arr, int key) {
        int start=0;
        int end=arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];
    }

    static char charBinarySearch(char[] ch, char c) {
        int start=0;
        int end=ch.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (c > ch[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ch[start]; // by returning ch[end] we will get the floor of the character.
    }

    static int occurrenceFirstLast(int[] arr, int key, boolean first) {
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            else {
                ans = mid;
                if (first) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    static int setRangeSearch(int[] arr, int key) {
        int start = 0;
        int end = 1;

        while (key > arr[end]) {
            int temp = end;
            end = end + (end - start + 1) * 2; // !important
            start = temp;
        }
        return getRangeSearch( arr, key, start, end);
    }
    static int getRangeSearch(int[] arr, int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (key > arr[mid]) {
                start = mid + 1;
            }
            else if (key < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int[] peakEle(int[] arr) {
        int s = 0, e = arr.length-1;
        while (s<e) {
            int mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1]) {
                e = mid;
            }
            else {
                s = mid + 1;
            }
        }
        return new int[]{arr[s], s}; // return an array
    }

    static int findInMountainArray(int[] arr, int target) {
        int peak = findPeak(arr);
        int index = binarySearch(arr, target, 0, peak);
        if (index != -1) {
            return index;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1, false);
    }
    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        return binarySearch(arr, target, start, end, true);
    }
    static int binarySearch(int[] arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (ascending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int s=0;
        int e=arr.length-1;

        while(s <= e) {
            int mid = s + (e-s) / 2;
            if(e > mid && arr[mid] > arr[mid+1]) {
                return mid;
            }                                                                                   // int[] prr = {4,5,6,7,0,1,2,3};
            if(s < mid && arr[mid] < arr[mid+1]) {
                return mid + 1;
            }
            if(arr[mid] <= arr[s]) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return -1;
    }

    static int countRotate(int[] arr) {
        int s=0;
        int e=arr.length-1;

        while(s <= e) {
            int mid = s + (e-s) / 2;
            if(e > mid && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(s < mid && arr[mid] < arr[mid+1]) {
                return mid + 1;
            }
            if(arr[mid] <= arr[s]) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        return -1;
    }

    static int searchBinary(int[] arr, int k, int s, int e) {
        if(s>e) {
            return -1;
        }

        int m = s+(e-s)/2;

        if(arr[m] == k) {
            return m;
        }

        if(k > arr[m]) {
            return searchBinary(arr, k, m+1, e);
        }
        else {
            return searchBinary(arr, k, s, m-1);
        }
    }

}
