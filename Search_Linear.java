import java.util.Arrays;
import java.util.Scanner;

public class Search_Linear {

    static void intArrayLinearSearch(int[] array, int target) {
        for (int i=0; i<array.length; i++) {
            if (i == array.length-1)
                System.out.println("Key not found");

            if (target == array[i]) {
                System.out.println("Key found at index " + i);
                break;
            }
        }
    }

    static void stringArrayLinearSearch(String[] s, String S) {
        for (int i=0; i<s.length; i++) {
            if (i == s.length-1)
                System.out.println("String not found");

            if (s[i].equals(S)) {
                System.out.println("String found at index " + i);
                break;
            }
        }
    }

    static void charLinearSearch1(String str, char c) {
        for (int i=0; i<str.length(); i++) {
            if (i == str.length()-1)
                System.out.println("Character not found");

            if (c == str.charAt(i)) {
                System.out.println("Character found at index " + i);
                break;
            }
        }
    }

    static void charLinearSearch2(String str, char c) {
        if (str.isEmpty()) {
            System.out.println("Not found");
        }

        for (char ch : str.toCharArray()) {
            if (ch == c)
                System.out.println("Found");
        }
    }

    static void minNumber(int[] brr) {
        int min = brr[0];
        for(int i=1; i<brr.length; i++) {
            if(brr[i] < min) {
                min = brr[i];
            }
        }
        System.out.println("Minimum number: " + min);
    }

    static void search2D(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    int[] ans = {row, col};
                    System.out.println(Arrays.toString(ans));
                }
            }
        }
    }       // !important


    static void rangeLinearSearch(int[] brr, int k, int s, int e) {
        for (int i = s; i <= e; i++) {
            if(s < 0 && e > brr.length) {
                System.out.println("Key not found in range");
            }

            if (k == brr[i]) {
                System.out.println("Key found in range");;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1,3,5,2,7,9,4,8,6};
        String[] str = {"tejas", "prashant", "shrikhande"};
        String s = "tejas";

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
        System.out.println(s);

        // Finding key in an int[]
//            System.out.print("Enter the key: ");
//            int key = input.nextInt();
//            intArrayLinearSearch(arr, key);

        // Finding string in String[]
//            System.out.print("Enter the string: ");
//            String st = input.next();
//            stringArrayLinearSearch(str, st);

        // Finding character in a String
//            System.out.print("Enter the character: ");
//            String ch = input.next();  // Read the character as a string
//            char c = ch.charAt(0);     // Convert the string to a char
//            charLinearSearch1(s, c);

        // Finding character in a String
//            System.out.print("Enter the character: ");
//            String ch1 = input.next();
//            char c1 = ch1.charAt(0);
//            charLinearSearch2(s, c1);

        // Finding key in range
//            System.out.print("Enter the key and range: ");
//            int k = input.nextInt();
//            int start = input.nextInt();
//            int end = input.nextInt();
//            rangeLinearSearch(arr, k, start, end);

        // Finding minimum element in an int[]
//            minNumber(arr);

        // Searching in int[][]     !important
              // Here no. of column are different for every row.
//            int[][] brr = {
//                    {1,2,3,4},
//                    {5,6,7,8,9},
//                    {10,11,12,13,14,15}
//            };
//            System.out.print("Enter the key: ");
//            int k = input.nextInt();
//            search2D(brr, k);






        input.close(); // Closing the scanner to avoid resource leak

    }
}
