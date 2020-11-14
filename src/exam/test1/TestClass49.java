package exam.test1;

/**
 Which line will print the string "MUM"?
 1) 1;
 2) 2;
 3) 3;
 4) 4;
 5) None of these;
 */

public class TestClass49 {
	public static void main(String args[]) {
		String s = "MINIMUM";
		System.out.println(s.substring(4, 7)); // 1
		System.out.println(s.substring(5)); // 2
		System.out.println(s.substring(s.indexOf('I', 3))); // 3
		System.out.println(s.substring(s.indexOf('I', 4))); // 4
	}
}
