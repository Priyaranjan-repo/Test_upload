import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();

		st.push("one");
		st.push("two");
		st.push("egg");
		System.out.println(st);

		String topEle = st.peek();

		System.out.println(topEle);

		System.out.println("-----------------");
		
		String popEle = st.pop();
		
		System.out.println(popEle);
		System.out.println("-----------------");
		topEle = st.peek();
		System.out.println(topEle);

		int position = st.search("one");
		System.out.println(position);

	}

}
