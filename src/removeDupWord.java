import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDupWord {

	public static void main(String[] args) {

		String str = "Big black bug bit a big black dog on his big black nose";

		String dup = "";

		Set<String> set = new LinkedHashSet<String>(List.of(str.split(" ")));
		System.out.println(set);

		for (String ss : set) {
			dup = dup + " " + ss;
		}
		System.out.println(dup);

	}
}
