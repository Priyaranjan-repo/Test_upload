import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "listen", str2 = "silenryt";
		System.out.println(isAnagram(str1, str2));
	}

	static boolean isAnagram(String str1, String str2) {
		    char [] c1 =str1.toLowerCase().toCharArray();
            char [] c2 = str2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

return  Arrays.equals(c1,c2);

	}

}
