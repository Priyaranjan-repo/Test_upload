 package softwareTestingGO;
public class ReverseNumbersInString {

    public static void main(String[] args) {
        String s = "st123ss459";
        String result = reverseNumbersInString(s);
        System.out.println("Output: " + result);
    }

    public static String reverseNumbersInString(String s) {
        char[] result = new char[s.length()];
        int resultIndex = 0;

        int i = 0;
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                // Start of a number sequence, so we find its end
                int start = i;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    i++;
                }
                int end = i - 1;

                // Reverse the digits manually
                while (end >= start) {
                    result[resultIndex++] = s.charAt(end);
                    end--;
                }
            } else {
                // Non-digit character, add directly to result
                result[resultIndex++] = s.charAt(i);
                i++;
            }
        }

        return new String(result);
    }
}
