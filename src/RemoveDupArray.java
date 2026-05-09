import java.util.Arrays;

public class RemoveDupArray {
	

//	4.	Remove duplicates from an array or list
//	5.	Check if a string is a palindrome


	
	public static void main(String[] args) {
		
		int arr []= {3,5,6,3,5,7,8,9,2,3,2,5};
		
		int b[]= Arrays.stream(arr).distinct().toArray();
		
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println(Arrays.toString(b));
		
	}

}
