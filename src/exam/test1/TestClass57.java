package exam.test1;

/**
 Which digits and in what order will be printed when the following program is run?
 1) The program will print 5;
 2) The program will print 1 and 4, in that order;
 3) The program will print 1, 2 and 4, in that order;
 4) The program will print 1, 4 and 5, in that order;
 5) The program will print 1, 2, 4  and 5, in that order;
 */

public class TestClass57 {
	public static void main(String args[]) {
		int k = 0;
		try {
			int i = 5 / k;
		} catch (ArithmeticException e) {
			System.out.println("1");
		} catch (RuntimeException e) {
			System.out.println("2");
			return;
		} catch (Exception e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
	}
}
