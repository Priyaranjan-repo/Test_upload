package interview1;

	public class ReplaceVowels {
	    public static void main(String[] args) {
	        String input = "tomorrow";
	        StringBuilder result = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (isVowel(ch)) {
	                result.append('$');
	            } else {
	                result.append(ch);
	            }
	        }

	        System.out.println("Output: " + result.toString());  // t$m$rr$w
	    }

	    public static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}

