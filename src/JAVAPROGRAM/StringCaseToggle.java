package JAVAPROGRAM;


	
	public class StringCaseToggle {
	    public static void main(String[] args) {
	        String s = "Hello-LOL";
	        char[] chars = s.toCharArray(); // Convert string to character array

	        // Toggle the case of each character
	        for (int i = 0; i < chars.length; i++) {
	        	char ch = chars[i];
	            if (Character.isUpperCase(ch)) {
	                chars[i] = Character.toLowerCase(ch);
	            } else if (Character.isLowerCase(ch)) {
	                chars[i] = Character.toUpperCase(ch);
	            }
	            // Non-alphabet characters remain unchanged
	        }

	        // Convert character array back to string
	        String result = new String(chars);

	        // Output the results
	        System.out.println("Original String: " + s);
	        System.out.println("Modified String: " + result);
	    }
	}


