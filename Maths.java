import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prime numbers    (Good practice!)
//            System.out.print("Enter the number up to which you want to print Prime nos: ");
//            int num = in.nextInt();
//            for(int i=2; i<num; i++) {
//                if(isPrime(i)) {
//                    System.out.print(i + " ");
//                }
//            }

            // Better Approach
//              System.out.print("Enter the number up to which you want to print Prime nos: ");
//              int num = in.nextInt();
//              boolean[] prime = new boolean[num+1];   // initially all elements will be false.
//
//              checkPrime(num, prime);

        // Finding square root of a number using binary search
//            System.out.print("Enter the number: ");
//            int num = in.nextInt();
//            double ans = getSqrt(num);
//            System.out.println("The square root of " + num + " is: " + String.format("%.2f", ans));

        // Better approach to find the factors
//            int n = 20;
//            for(int i=1; i<Math.sqrt(n); i++) {
//                if(n%i == 0) {
//                    if(n/i == i) {
//                        System.out.print(i + " ");
//                    }
//                    else {
//                        System.out.print(i + " " + n/i + " ");
//                    }
//                }
//            }

        in.close();
    }


    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int c = 2; c * c <= n; c++) {  // !important
            if (n % c == 0) {
                return false;
            }
        }
        return true;
    }

    static void checkPrime(int n, boolean[] p) {
        for(int i=2; i*i <= n; i++) {
            if(!p[i]) {
                for(int j=i*2; j<=n; j+=i) {    // !important
                    p[j] = true;    // eliminating multiples.
                }
            }
        }
        for(int i=2; i<=n; i++) {
            if(!p[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static double getSqrt(int n) {
        int s = 0;
        int e = n;
        double sqrt = 0.0;

        // Binary search to find the integer part of the square root
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        // At this point, e is the largest integer such that e*e <= n
        sqrt = e;

        // To calculate the precise value up to two decimal digits
        double inc = 0.1;
        for (int i = 0; i < 2; i++) {
            while (sqrt * sqrt <= n) {
                sqrt += inc;
            }
            sqrt -= inc; // Step back one increment
            inc /= 10;   // Decrease the increment
        }

        return sqrt;
    }



}
