import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removeDupStrin {

	public static void main(String[] args) {

		String str = "Big black bug bit a big black dog on his big black nose";
		// String dup[] = str.split("");
		String reverse = "";

		Set<String> set = new HashSet<String>(List.of(str.split(" ")));
		System.out.println(set);

		for (String ss : set) {
			reverse = reverse + " " + ss;
		}
		System.out.println(reverse);

	}
}

//String str = "Big black bug bit a big black dog on his big black nose";