package softwareTestingGO;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class duplaicateString {

	public static void main(String[] args) {

		String str = "i read java read java i read java";
		String op = " ";
		Set<String> set = new LinkedHashSet<>(List.of(str.split(" ")));

		for (String s1 : set) {
			op = set + " " + s1;

		}
		System.out.println(op);
	}

}
