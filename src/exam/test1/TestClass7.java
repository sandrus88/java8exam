package exam.test1;

/**
 What will the following code print when run?
1) bat
   big bat
2) big bat
   none
3) big bat
4) bat
5) The code will not compile.
    
 */

public class TestClass7 {
	public void switchString(String input) {
		switch (input) {
		case "a":
			System.out.println("apple");
		case "b":
			System.out.println("bat");
			break;
		case "B":
			System.out.println("big bat");
		default:
			System.out.println("none");
		}
	}

	public static void main(String[] args) throws Exception {
		TestClass tc = new TestClass();
		tc.switchString("B");
	}
}
