package exam.test1;

/**
 Which is the earliest line in the following code after which the object created on line // 1 
 can be garbage collected, assuming no compiler optimizations are done?
 1) Line 1;
 2) Line 2;
 3) Line 3;
 4) Line 4;
 5) Line 5;
 6) Line 6;
 
 */

public class NewClass54 {
	private Object o;

	void doSomething(Object s) {
		o = s;
	}

	public static void main(String args[]) {
		Object obj = new Object(); // 1
		NewClass54 tc = new NewClass54(); // 2
		tc.doSomething(obj); // 3
		obj = new Object(); // 4
		obj = null; // 5
		tc.doSomething(obj); // 6
	}
}
