package exam.test1;

/**
 What will be the output of the following program?
 1) equal;
 2) not equal;
 3) Compile time error at //1;
 4) Runtime error at //1;
 5) None of the above;
 */

public class EqualTest67 {
	public static void main(String args[]) {
		Integer i = new Integer(1);
		Long m = new Long(1);
		if (i.equals(m))
			System.out.println("equal"); // 1
		else
			System.out.println("not equal");
	}
}
