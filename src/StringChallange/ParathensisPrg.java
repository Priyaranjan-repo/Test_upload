package StringChallange;

import java.util.Stack;

public class ParathensisPrg {

	public static void main(String[] args) {

		String parenthesis = "{[()]}";
		// String parenthesis = "}]()]}";

		char[] chars = parenthesis.toCharArray();

		Stack<Character> st = new Stack<Character>();

		boolean isBalanced = true;

		for (char ch : chars) {

			if (ch == '{' || ch == '(' || ch == '[') {
				st.push(ch);

			} else {

				if (!st.isEmpty() && (ch == '}' && st.peek() == '{' || ch == ']' && st.peek() == '['
						|| ch == ')' && st.peek() == '(')) {
					st.pop();
				} else {
					isBalanced = false;
					break;
				}
			}

		}
		if (st.isEmpty() && isBalanced) {
			System.out.println("Balanced parathensis");
		} else {
			System.out.println(" not Balanced parathensis");
		}

	}
}

//this string   "{[()]}" has balanced parenthesis
//
//while this string "}]()]}" has not balanced parenthesis as it is starting with closing parenthesis
//
//𝐇𝐨𝐰 𝐭𝐨 𝐬𝐨𝐥𝐯𝐞 𝐢𝐭 𝐩𝐫𝐨𝐠𝐫𝐚𝐦𝐦𝐚𝐭𝐢𝐜𝐚𝐥𝐥𝐲?
//
//
//We will have to use 𝐒𝐭𝐚𝐜𝐤/𝐀𝐫𝐫𝐚𝐲𝐃𝐞𝐪𝐮𝐞 to solve this.
//
//Let us understand step by step:
//𝐏𝐫𝐞-𝐑𝐞𝐪𝐮𝐢𝐬𝐢𝐭𝐞: we will convert string in to char array and process 𝐬𝐭𝐞𝐩 𝐛𝐲 𝐬𝐭𝐞𝐩
//Define one boolean flag as true
//
//𝐒𝐭𝐞𝐩𝟏: first we need to look for opening parenthesis.
//𝐒𝐭𝐞𝐩𝟐: As soon as we encounter such opening parenthesis we need to put that to on top of stack
//𝐒𝐭𝐞𝐩𝟑: Now we will look for closing parenthesis
//There could be two cases:
//𝟏𝐬𝐭 𝐜𝐚𝐬𝐞: we may encounter closing parenthesis in the starting. we will mark boolean flag false
//
//𝟐𝐧𝐝 𝐜𝐚𝐬𝐞: we may encounter closing parenthesis after encountering opening parenthesis as per step 1
//
//𝐒𝐭𝐞𝐩𝟒: If we encounter closing brace as per Case1, we will simply say parenthesis are not balanced
//
//While for second case, we will look for respective opening parenthesis from stack top and will clean this opening parenthesis from stack
//
//𝐒𝐭𝐞𝐩𝟓: we will repeat step 
//
//𝐒𝐭𝐞𝐩𝟔: At last we will check if stack is empty and boolean flag is true