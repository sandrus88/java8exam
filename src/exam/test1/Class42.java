package exam.test1;

/**
 What will the following code snippet print?
 1) 11;
 2) 12;
 3) It will not compile;
 4) It will throw an exception at runtime;
 */

public class Class42 {
	public static void main(String[] args) {

		Object t = new Integer(107);
		int k = ((Integer)t).intValue() / 9;
		System.out.println(k);
	}
}