package ArrayPrg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class ThirdHigest {

	public static void main(String[] args) {
		
		int z[]= {2,3,45,67,76,98,112,543};
		
	Optional<Integer> thirdHigest =Arrays
			 .stream(z)
			 .boxed()
			 .distinct()
			 .sorted(Comparator.reverseOrder())
			 .skip(2)
			 .findFirst();
	
	
	System.out.println(thirdHigest.get());
			
			 
	}

}
