package JAVAPROGRAM;

public class ExecutionOfBlock {

	void test1() {
		System.out.println("i am IIB");

	}

	static void test2() {
		System.out.println("i am  SIB");

	}

	void test3() {
		System.out.println("i am in constructor");

	}

	void add() {
		System.out.println("I am in static method");
	}

	public static void main(String[] args) {

		ExecutionOfBlock eb = new ExecutionOfBlock();
		eb.test1();
		eb.test3();
		eb.add();
		eb.test2();

	}
}
