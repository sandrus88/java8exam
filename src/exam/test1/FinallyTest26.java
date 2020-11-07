package exam.test1;

/**
 What letters, and in what order, 
 will be printed when the following program is compiled and run?
 1) It will print C and B, in that order.
 2) It will print A and B, in that order.
 3) It will print B and throw Exception.
 4) It will print A, B and C in that order.
 5) Compile time error.
 */

public class FinallyTest26 {
	public static void main(String args[]) throws Exception {
		try {
			m1();
			System.out.println("A");
		} finally {
			System.out.println("B");
		}
		System.out.println("C");
	}

	public static void m1() throws Exception {
		throw new Exception();
	}
}
