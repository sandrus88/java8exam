package exam.test1.b;

//In file B.java
/**
 What will be printed when you try to compile and run class B? 
 1) It will print A. 
 2) It will print B. 
 3) It will not compile. 
 4) It will compile but will not run. 
 5) None of the above.
 */

import exam.test1.a.*;

public class B19 extends A19 {
	B19() {
	}

	public void print() {
		System.out.println("B19");
	}

	public static void main(String[] args) {
		new B19();
	}
}
