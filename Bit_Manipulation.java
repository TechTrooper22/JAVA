import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Formulae :-
//            1] (a << 1) = 2a
//            2] (a << b) = a + 2^b
//            3] (a>>1) = a/2
//            4] (a >> b) = a / 2^b

        // Notes :-
//            1] ANDing (&) of 1 with any number (0 or 1) return that number.
//            2] 0Ring (|) of 0 with any number (0 or 1) return that number.

        // Even or Odd
            // here we will input n=5 (0101)
            // as we already know that, the unit placed digit (LSB- Least Significant Bit) which decides whether the number is odd or even.
            // if unit placed number is '1' then the number is odd.
            // by performing (n&1) i.e. (0101 & 0001), we will get the unit placed digit.
//            System.out.print("Enter a number: ");
//            int n = in.nextInt();
//
//            if((n&1) == 1) {
//                System.out.println("Odd number");
//            }
//            else {
//                System.out.println("Even number");
//            }

        // Unique value in array
//            int[] arr = {2,3,2,4,5,4};
//            int unique = 0;
//            for(int n: arr) {
//                unique ^= n; // This will effectively cancel out any number that appears twice, leaving only the number that appears once in unique.
//            }
//            System.out.println(unique);

        // i-th bit of a number
//            int n = 5;  // (0101)
//            System.out.print("Enter the index: ");
//            int i = in.nextInt();
//            int bitMask = 1<<i;     // creates a bitmask where only the i-th bit is set to 1.
//            if((bitMask & n) == 0 ){
//                // performs a bitwise AND between num and mask. This operation results in a number where only the i-th bit is retained from num, and all other bits are set to 0.
//                System.out.println("Bit is zero");
//            }
//            else{
//                System.out.println("Bit is one");
//            }

        // Set i-th 0-bit to 1-bit
//            System.out.println("Enter the number and index :-");
//            int num = in.nextInt();
//            int i = in.nextInt();
//            int bitMask = 1 << i;
//            int newNum = num | bitMask;   // 1 | 0 = 1, hence 0 will be replaced by 1
//            System.out.println(newNum);   // newNum = 0111 = 7

        // First appearance of bit '1'
//            System.out.print("Enter number: ");
//            int num = in.nextInt();
//            int pos = 1;
//
//            if (num == 0) {
//                System.out.println("No bits are set in zero");
//            }
//            else {
//                while ((num & 1) == 0) {
//                    // checking LSB == 0
//                    // loop will run till the LSB is set to 1.
//                    num >>= 1;
//                    // Shifts the bits of num one position to the right.
//                    // This effectively divides num by 2 and discards the LSB.
//                    // new value of num = 5 (0101)
//                    // new value LSB is set to 1, hence loop will break.
//                    pos++;
//                }
//                System.out.println(pos);
//            }

        // Magic Number
//            System.out.print("Enter number: ");
//            int num = in.nextInt();
//            int base = 5;
//            int ans = 0;
//            while(num > 0) {
//                int lsb = num & 1;
//                ans += lsb * base;
//                base *= 5;
//                num >>= 1;
//            }
//            System.out.println(ans);

        // Power of 2 or not
//            System.out.print("Enter number: ");
//            int n = in.nextInt();
//            boolean ans = (n & (n-1)) == 0;
//            System.out.println(ans);

        // Calculating a**b;
//            int a = 3;   // base
//            int b = 6;   // power
//            int ans = 1;
//
//            while(b > 0) {
//                if((b&1) == 1) {
//                    ans *= a;
//                }
//                a *= a;
//                b >>= 1;
//            }
//            System.out.println(ans);

        // Clear Bit.
//            int n = 5;
//            int pos = 2;
//            int bitMask = 1 << pos;
//            int notBitMask = ~ (bitMask);
//            int newNumber = notBitMask & n;
//            System.out.println(newNumber);

        // Update Bit.
//            int oper = scan.nextInt();
//            int n = 5;
//            int pos = 1;
//            int bitMask = 1 << pos;
//            if(oper == 1){
//                int newNumber = bitMask | n;
//                System.out.println(newNumber);
//            }
//            else{
//                int notBitMask = ~ (bitMask);
//                int newNumber = notBitMask & n;
//                System.out.println(newNumber);
//            }

        in.close();
    }
}
