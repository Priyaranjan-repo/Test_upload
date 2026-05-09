package Interview;

class ConvertUpper {

	public static void main(String[] args) {

		String str = "i am reaDy ";

		String word[] = str.split(" ");
		for (String s : word) {

		

			System.out.print(s.toUpperCase() + " ");
		
		}

	}

}
