package StringChallange;

public class SumOfDigitInString {

    public static void main(String[] args) {

        String str = "ammd565jvR";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
}
