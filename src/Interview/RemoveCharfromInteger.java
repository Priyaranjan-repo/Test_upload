package Interview;

public class RemoveCharfromInteger {

	public static void main(String[] args) {

		String str = "324chhdjf5475";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				sb.append(ch);
//			}else if(Character.isAlphabetic(ch)) {
//				sb.append(ch);
			
			}
		}

		
		System.out.println(sb);

	}

}
