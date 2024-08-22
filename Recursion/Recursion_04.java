package Recursion;

public class Recursion_04 {
    public static void main(String[] args) {

        // Letter Combinations of a Phone Number
//            1: "abc", 2: "def", 3: "ghi", 4: "jkl", 5: "mno", 6: "pqr", 7: "stu", 8: "vwx", 9: "yz"
//            let's assign an index to each letter such as a:0, b:1, c:2,....., y:24, z:25
//            '1' is ranging from (0, 3) i.e ((digit-1)*3 [included], (digit*3) [excluded i.e. 3 is excluded and 2 will be included only])
//                letterCombination("", "12");

        // Possible sum of values by rolling the dice to get the target
//            dice("", 4);

    }

    static void letterCombination(String p, String up) {
        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        int digit = up.charAt(0) - '0'; // converts char to int

        for (int i = (digit-1)*3; i < (digit*3); i++) {
            char ch = (char) ('a' + i);
            letterCombination(p+ch, up.substring(1));
        }
    }

    static void dice(String p, int target) {
        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i=1; i<7 && i<=target; i++) {
            dice(p+i, target-i);
        }
    }

}
