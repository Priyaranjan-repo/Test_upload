package interview1;
public class ReverseLastWord {
    public static void main(String[] args) {
        String input = "rahul sharma";
        //luhar  amrahs
        
        String[] words = input.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        // Append all words except last
        for (int i = 0; i < words.length - 1; i++) {
            result.append(words[i]).append(" ");
        }

        // Reverse the last word
        String lastWord = words[words.length - 1];
        String reversedLast = new StringBuilder(lastWord).reverse().toString();
        
        result.append(reversedLast);
        System.out.println("Output: " + result.toString());
    }
}
