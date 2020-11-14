package exam.test1;

/**
 * What will be printed by the above code if it is run with command line: 
 * java TestClass --0.50 (There are two minuses before 0.)?
 * 1) Hello;
 * 2) World;
 * 3) Hello World;
 * 4) Hello World Good Bye;
 * 5) Good Bye;
 */

public class TestClass27 {
	public static int getSwitch(String str) {
		return (int) Math.round(Double.parseDouble(str.substring(1, str.length() - 1)));
	}

	public static void main(String args[]) {
		switch (getSwitch(args[0])) {
		case 0:
			System.out.print("Hello ");
		case 1:
			System.out.print("World");
			break;
		default:
			System.out.print("Good Bye");
		}
	}
}
