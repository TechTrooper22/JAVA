import java.util.ArrayList;
import java.util.Scanner;

public class Basic {

    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array
/*
        System.out.println("Enter any 5 nos.: ");

        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
*/



        // Multi-Level Array
/*
        int[][] arr = new int[3][3]; // initializing array

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
*/


        // ArrayList
/*
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);

        // forEach()

        ArrayList<Integer> list = new ArrayList<>(5);
        for(int i=1; i<6; i++) {
            list.add(i);
        }

        list.forEach((item) -> {
            System.out.println(item * 2);
        }) ;

 */

        // Multi-Level ArrayList
/*
        <ArrayList<Integer>> ls = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            ls.add(new ArrayList<Integer>());
        } // Initialize 3 ArrayLists inside the main ArrayList
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ls.get(i).add(input.nextInt()); // mug up the syntax
            }
        } // Adding elements to each of the 3 ArrayLists

        System.out.println(ls);

*/


        // Switch Case
/*
        int a, b;
        char op;
        System.out.print("Enter the value of a: ");
        a = input.nextInt();
        System.out.print("Enter the value of b: ");
        b = input.nextInt();
        System.out.print("Select operation to perform on a & b (+, -, *, /, %): ");
        op = input.next().charAt(0);

        switch(op) {
          case '+' -> System.out.print("The Sum is " + (a+b));
          case '-' -> System.out.print("The difference is " + (a-b));
          case '*' -> System.out.print("The Product is " + (a*b));
          case '/' -> System.out.print("The Quotient is " + (a/b));
          case '%' -> System.out.print("The Remainder is " + (a%b));
        }; // normal way of writing can also be done.
           // It's a good practice
*/


        // for-each loo[
/*
        String[] str =  {"Tejas", "Yadnyesh", "Prashant"};
        for(String s : str) {
            System.out.println(s);
        }
*/


        // Ternary Operator
/*
        int x = 1;
        System.out.println(x == 1 ? "True" : "False");
*/




        input.close(); // Closing the scanner to avoid resource leak
    }
}