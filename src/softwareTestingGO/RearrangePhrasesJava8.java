package softwareTestingGO;

import java.util.Arrays;
import java.util.stream.Collectors;




		// Input: Hello world,welcome to my world,my world
		// Output: world Hello ,world my to welcome ,world my

		

		


		public class RearrangePhrasesJava8 {

		    public static void main(String[] args) {
		        String input = "Hello world,welcome to my world,my world";
		        String output = rearrangePhrases(input);
		        System.out.println("Output: " + output);
		    }

		    public static String rearrangePhrases(String input) {
		        return Arrays.stream(input.split(","))
		                .map(String::trim)
		                .map(phrase -> {
		                    String[] words = phrase.split(" ");
		                    if (words.length > 0 && words[words.length - 1].equals("world")) {
		                        // Collect the phrase as "world" followed by the other words in reverse order
		                        return "world " + 
		                               Arrays.stream(words, 0, words.length - 1)
		                                     .collect(Collectors.collectingAndThen(
		                                         Collectors.toList(),
		                                         list -> {
		                                             // Reverse the list and join with spaces
		                                             java.util.Collections.reverse(list);
		                                             return String.join(" ", list);
		                                         }));
		                    }
		                    return phrase; // If "world" is not the last word, return as-is
		                })
		                .collect(Collectors.joining(", "));
		    }
		
	}


