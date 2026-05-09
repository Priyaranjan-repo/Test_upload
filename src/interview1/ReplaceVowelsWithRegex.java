package interview1;
public class ReplaceVowelsWithRegex {
    public static void main(String[] args) {
        String in = "tomorrow";
        String output = in.replaceAll("o", "\\$");

        System.out.println("Output: " + output);  // t$m$rr$w
        
        
      //  🔍 Explanation:
        //	[aeiouAEIOU] — regex to match any vowel (both lowercase and uppercase).

        	//   \\$ — we escape the dollar sign \$ in Java string literal with another backslash, so it becomes \\$.
    }
}
