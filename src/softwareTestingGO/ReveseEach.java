package softwareTestingGO;

public class ReveseEach {

	public static void main(String[] args) {

		String ip = "reverse me without split";

		String op[] = ip.split(" ");// {"reverse","me","without","split"}

		String op1 = "";

		for (int i = 0; i < op.length; i++) {

			op1 = op1 + new StringBuffer(op[i]).reverse().toString() + " ";
		}
		System.out.println(op1.trim());
	}

}
