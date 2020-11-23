package exam.test1;

/**
Which of the following can be valid declarations of an integer variable? 
Please select 2 options
1) global int x = 10;
2) final int x = 10;
3) public Int x = 10;
4) Int x = 10;
5) static int x = 10;
 */

public class MyClass62 {
	// global int x = 10;
	final int y = 10;
	// public Int z = 10;
	// Int v = 10;
	static int p = 10;
	int variabileNonStatica = 2;

	public static void main(String args[]) {

		MyClass62 myClass62 = new MyClass62();
		System.out.println("this is y: " + myClass62.y);
		System.out.println("this is p: " + p);
		System.out.println("this is variabileNonStatica: " + myClass62.variabileNonStatica);

	}
}
