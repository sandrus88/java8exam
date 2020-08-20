package exam.test1;

/**
 What will be the output when the following program is run?
 0 0 will be printed twice;
 0 0 will be printed once; (ok)
 It will keep on printing 0 0;
 It will not compile;
 It will print 0 0 and then 0 1;
 */

public class TestClass12 {
	public static void main(String args[]) {
		int i;
		int j;
		for (i = 0, j = 0; j < i; ++j, i++) {
			System.out.println(i + " " + j);
		}
		System.out.println(i + " " + j);
	}
}
