package interview1;
public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "rahul sharma  das  fgy";
        String[] words = input.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";

            // Reverse current word using for loop
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }

            result += reversedWord;

            // Add space if not last word
            if (i < words.length - 1) {
                result += " ";
            }
        }

        System.out.println("Output: " + result);
    }
}
