public class String_Builder {

    static boolean isPalindrome(String str) {
        if(str == null || str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        for(int i=0; i<str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch).append(" ");
        }
        System.out.println(builder.toString());

        String str = "AbcdCBa";
        System.out.println(isPalindrome(str));
    }
}
