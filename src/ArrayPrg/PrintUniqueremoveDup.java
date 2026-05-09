package ArrayPrg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUniqueremoveDup {
	
	public static void main(String[] args) {

	 List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4);
	 
	List<Integer> uniqueli= list.stream().distinct().collect(Collectors.toList());
	
	System.out.println(uniqueli);
	}

}
