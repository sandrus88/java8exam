package exam.test1;

/**
 What will the following program print?
 The program will not compile;
 It will print : a b c 2 3 4 1;
 It will print : 2 3 4 1 a b c;
 It will print : 1 a 2 3 b c 4;
 It will print : 1 a b c 2 3 4;
 */

public class InitTest3 {
	public InitTest3() {
		s1 = sM1("1");
	}

	static String s1 = sM1("a");
	String s3 = sM1("2");
	{
		s1 = sM1("3");
	}
	static {
		s1 = sM1("b");
	}
	static String s2 = sM1("c");
	String s4 = sM1("4");

	public static void main(String args[]) {
		InitTest3 it = new InitTest3();
	}

	private static String sM1(String s) {
		System.out.println(s);
		return s;
	}
}
