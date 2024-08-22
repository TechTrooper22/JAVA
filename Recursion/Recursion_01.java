package Recursion;

import java.util.*;

public class Recursion_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print 5 to 1.
//         int n = 5;
//         printNum(n);

        // sum of first n natural numbers.
//         sum(1, 5, 0);

        // Factorial.
//         int ans = fact(10, 0);
//         System.out.println(ans);

        // Fibonacci Series.
//         int a = 0, b = 1;
//         System.out.print(a + " ");
//         System.out.print(b + " ");
//         int n = 7;
//         fib(a, b, n-2);

        // x^n (stack height : n)
//         int x = 2, n = 5;
//         int ans = calcPower(x, n);
//         System.out.println(ans);

        // x^n (stack height : log(n))
//         int x = 2, n = 5;
//         int ans = calcPower(x, n);
//         System.out.println(ans);

        // Reverse the integer
//            int num = 13579;
//            int a = reverse(num, 0);
//            System.out.println(a);

        // Palindrome or not
//            int n = 124321;
//            if(n == reverse(n, 0))
//                System.out.println("Palindrome");
//            else
//                System.out.println("Not Palindrome");



        //  Hanoi Tower.
//          int n = 3;
//          towerOfHanoi(n, "S", "H", "D");

        // Reverse String
//         String str = "abcd";
//         revStr(str, str.length()-1);

        // First and Last Occurrence.
//         String str = "abaacdaefaah";
//         occur(str, 0, 'a');

        // Array is sorted or not
//         int[] arr = {1,2,3,4,5,6};
//         System.out.println(isSorted(arr, 0));
//
//         int[] brr = {1,2,3,5,4,6};
//         System.out.println(isSorted(brr, 0));

        // Move all 'x' to the end of the string.
//          String str = "axbxxcxxx";
//          moveAllX(str, 0, 0, "" );

        // Remove duplicates char.
//          String str = "abbccda";
//          removeDuplicate(str, 0, "");


        // Permutation of a string
//         String str = "abc";
//         printPerm(str, "");

        // Total paths in maze from (0, 0) to (n, m).
//         int n = 3, m = 3;
//         int totalPaths = countPaths(0, 0, n, m);
//         System.out.println(totalPaths);

        // Place tiles of size 1*m in a floor of size n*m.
//         int n = 4, m = 2;
//         System.out.println(placeTiles(n, m));

        // Binary Search using Recursion
//            int[] arr = {1,3,5,7,9,11,13,15,17,19};
//            int key = 7;
//
//            int index = searchBinary(arr, key, 0, arr.length-1);
//            System.out.println(index);
    }

//    public static void printNum(int n) {
//        if(n != 0){
//            System.out.print(n + " ");
//            printNum(n-1);
//        }
//    }
//
//    public static void sum(int i, int n, int sum) {
//        if(i == n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        sum(i+1, n, sum);
//    }
//
//    public static int fact(int n, int factorial) {
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        factorial = n * fact(n-1, factorial);
//        return factorial;
//    }
//
//    public static void fib(int a,int b, int n) {
//        if(n == 0){
//            return;
//        }
//        int c = a+b;
//        System.out.print(c + " ");
//        fib(b, c, n-1);
//    }
//
//    public static int calcPower(int x, int n) {
//        if(n == 0){
//            return 1;
//        }
//        if(x == 0){
//            return 0;
//        }
//        int xPownm1 = calcPower(x, n-1);
//        int xPown = x * xPownm1;
//        return xPown;
//    }
//
//    public static int calcPower(int x, int n) {
//        if(n == 0){
//            return 1;
//        }
//        if(x == 0){
//            return 0;
//        }
//        if(n % 2 == 0){
//            return calcPower(x, n/2) * calcPower(x, n/2);
//        }
//        else{
//            return calcPower(x, n/2) * calcPower(x, n/2) * x;
//        }
//    }
//
//
//
//    public static void towerOfHanoi(int n, String src, String helper, String dest) {
//        if(n == 1){
//            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
//            return;
//        }
//        towerOfHanoi(n-1, src, dest, helper);
//        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
//        towerOfHanoi(n-1, helper, src, dest);
//    }
//
//    public static void printRev(String str, int idx) {
//        if(idx == 0){
//            System.out.print(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printRev(str, idx-1);
//    }
//
//    public static int first = -1;
//    public static int last = -1;
//    public static void occur(String str, int idx, char element) {
//        if(idx == str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(currChar == element){
//            if(first == -1){
//                first = idx;
//            }
//            else{
//                last = idx;
//            }
//        }
//        occur(str, idx+1, element);
//    }
//
//    public static boolean isSorted(int[] arr, int idx) {
//        if(idx == arr.length-1){
//            return true;
//        }
//        if(arr[idx] < arr[idx+1]){
//            return isSorted(arr, idx+1);
//        }
//        else{
//            return false;
//        }
//    }
//
//    public static void moveAllX(String str, int idx, int count, String newString) {
//        if(idx == str.length()){
//            for(int i=0; i<count; i++){
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(currChar == 'x'){
//            count ++;
//            moveAllX(str, idx+1, count, newString);
//        }
//        else{
//            newString += currChar;
//            moveAllX(str, idx+1, count, newString);
//        }
//    }
//
//    public static boolean[] map = new boolean[26];
//    public static void removeDuplicate(String str, int idx, String newString) {
//        if(idx == str.length()) {
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if(map[currChar - 'a']) {
//            removeDuplicate(str, idx+1, newString);
//        }
//        else{
//            newString += currChar;
//            map[currChar - 'a'] = true;
//            removeDuplicate(str, idx+1, newString);
//        }
//    }
//
//    public static void printPerm(String str, String permutation) {
//        if(str.length() == 0){
//            System.out.println(permutation);
//            return;
//        }
//        for(int i=0; i<str.length(); i++){
//            char currChar = str.charAt(i);
//            String newStr = str.substring(0, i) + str.substring(i+1);
//            printPerm(newStr, permutation + currChar);
//        }
//    }
//
//    public static int countPaths(int i, int j, int n, int m) {
//        if(i == n || j == m){
//            return 0;
//        }
//        if(i == n-1 && j == m-1){
//            return 1;
//        }
//        int downPath = countPaths(i+1, j, n, m);
//        int rightPath = countPaths(i, j+1, n, m);
//        return downPath + rightPath;
//    }
//
//
//
//    static int placeTiles(int n, int m) {
//        if(n == m){
//            return 2;
//        }
//        if(n < m){
//            return 1;
//        }
//        int vertPlacements = placeTiles(n-m, m);
//        int horPlacements = placeTiles(n-1, m);
//        return vertPlacements + horPlacements;
//    }
//
//    static int searchBinary(int[] arr, int k, int s, int e) {
//        if(s>e) {
//            return -1;
//        }
//
//        int m = s+(e-s)/2;
//
//        if(arr[m] == k) {
//            return m;
//        }
//
//        if(k > arr[m]) {
//            return searchBinary(arr, k, m+1, e);
//        }
//        else {
//            return searchBinary(arr, k, s, m-1);
//        }
//    }
//
//    static int reverse(int n, int ans) {
//        if(n <= 0) {
//            return ans ;
//        }
//        int r = n % 10;
//        ans = r + (ans * 10);
//        return reverse(n/10, ans);
//    }

}


