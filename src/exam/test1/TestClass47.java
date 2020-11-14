package exam.test1;

/**
 What will be the output of the following program?
 1) It will print 1;
 2) It will print 2;
 3) It will print 3;
 4) It will print 4;
 5) It will print 0;
 */

public class TestClass47 {
	public static void main(String args[]) {

		int i = 0;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool = false;
		bool = (bool2 &

				method1(i++)); // 1
		bool = (bool2 && method1(i++)); // 2
		bool = (bool1 | method1(i++)); // 3
		bool = (bool1 || method1(i++)); // 4
		System.out.println(i);
	}

	public static boolean method1(int i) {
		return i > 0 ? true : false;
	}
}
