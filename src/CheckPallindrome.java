public class CheckPallindrome {


        public static void main(String[] args) {

            String s = "sore";
            reverse(s);
        }

        public static void reverse(String s) {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev+= s.charAt(i);
            }
            //  Check AFTER loop
            if (s.equals(rev)) {
                System.out.println(s + " is a palindrome.");
            } else {
                System.out.println(s + " is not a palindrome.");
            }
        }
    }