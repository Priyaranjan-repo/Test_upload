package Interview;

public class Main {
    public static void main(String[] args) {

        String s = "a2b2c1a1f3c2b1";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // check if next character is a digit
            if (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                int count = s.charAt(i + 1) - '0';

                for (int j = 0; j < count; j++) {
                    result.append(ch);
                }

                i++; // skip digit
            }
        }

        System.out.println(result.toString());
    }
}