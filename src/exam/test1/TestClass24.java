package exam.test1;

/**
 The following code snippet will print true.
 1) true.
 2) false.
 */

public class TestClass24 {
	public static void main(String[] args) {
		String str1 = "one";
		String str2 = "two";
		System.out.println(str1.equals(str1 = str2));
	}
}