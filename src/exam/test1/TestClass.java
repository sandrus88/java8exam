package exam.test1;

import exam.exceptions.MyException;

public class TestClass {

	public static void main(String[] args) {
		try {
			hello();
		} catch (MyException me) {
			System.out.println(me);
		}
	}

	static void hello() throws MyException {
		int[] dear = new int[7];
		dear[0] = 747;
		foo();
	}

	/**
	 * This method throws an Exception
	 */
	static void foo() throws MyException {
		throw new MyException("Exception from foo");
	}
}