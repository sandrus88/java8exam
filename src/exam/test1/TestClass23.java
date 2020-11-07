package exam.test1;

/**
 * What will the following code print when compiled and run? 1) 10, 40; 2) 30,
 * 20; 3) 10, 20; 4) 30, 40; 5) 20, 30; 6) Compilation error.
 */

class ABCD {
	int x = 10;
	static int y = 20;
}

class MNOP extends ABCD {
	int x = 30;
	static int y = 40;
}

public class TestClass23 {
	public static void main(String[] args) {
		System.out.println(new MNOP().x + ", " + new MNOP().y);
	}
}
