package programs;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class duplicateString {

	
	public static void main(String[] args) {
		
		String str=
				"TODO TODO Auto-generated method stub  Auto-generated method ";
		
		String op ="";
		
		Set<String> dup= new LinkedHashSet<String>(List.of(str.split(" ")));
		
		for(String ss:dup) {
			op = dup+" "+ss;
			
			
			
		}
		
		System.out.println(op);
		
		
	}
	
}
