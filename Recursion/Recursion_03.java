package Recursion;

public class Recursion_03 {
    public static void main(String[] args) {

        // printing pattern
//            pattern_01(4,0);

        // skip character 'a' and return the string
            // using .substring()
//            skip("", "abracadabra");
//
//            String s = skip("abracadabra");
//            System.out.println(s);

        // skip the string "apple"
            // using .startsWith()
//            System.out.println(skipS("daddasdaapplefsdss"));

        // skip the string "app" only if "apple" is not a part of string
//            System.out.println(skipApp("daddasdaapplefsdss")); // app will not be removed
//            System.out.println(skipApp("daddasdaappfsdss"));    // app removed

        // possible subsets
//            subsets("", "abc");

        // Permutation
//            permutation("", "abc");


    }

    static void pattern_01(int r, int c) {
        if(r == 0) {
            return;
        }

        if(c < r) {
            System.out.print("* ");
            pattern_01(r, c+1);
        }
        else {
            System.out.println();
            pattern_01(r-1, 0);
        }
    }

    static void skip(String ans, String que) {
        if(que.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = que.charAt(0);

        if(ch == 'a') {
            skip(ans, que.substring(1));
        }
        else {
            skip(ans+ch, que.substring(1));
        }
    }

    static String skip(String que) {
        if(que.isEmpty()) {
            return "";
        }

        char ch = que.charAt(0);

        if(ch == 'a') {
            return skip(que.substring(1));
        }
        else {
            return (ch + skip(que.substring(1)));
        }
    }

    static String skipS(String que) {
        if(que.isEmpty()) {
            return "";
        }

        if(que.startsWith("apple")) {
            return skipS(que.substring(5));
        }
        else {
            return que.charAt(0) + skipS(que.substring(1));
        }
    }

    static String skipApp(String que) {
        if(que.isEmpty()) {
            return "";
        }

        if(que.startsWith("app") && !que.startsWith("apple")) {
            return skipS(que.substring(3));
        }
        else {
            return que.charAt(0) + skipApp(que.substring(1));
        }
    }

    static void subsets(String p, String q) {
        if(q.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = q.charAt(0);

        subsets(p+ch, q.substring(1));
        subsets(p, q.substring(1));
    }

    static void permutation(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }



    
}
