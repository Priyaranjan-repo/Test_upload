package JavaQuiz;

public class Continuetest {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println("value of :" + i);
		}

	}

}

//skip the print of 3 and coninue resr of execution