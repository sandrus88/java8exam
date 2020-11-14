package exam.test1;

/**
 What will be the result of attempting to compile and run the following program?
 1) The program will fail to compile;
 2) Class cast exception at runtime;
 3) It will print 30, 20;
 4) It will print 30, 30;
 5) It will print 20, 20;
 */

public class TestClass29 {
	public static void main(String args[]) {
		A o1 = new C();
		B o2 = (B) o1;
		System.out.println(o1.m1());
		System.out.println(o2.i);
	}
}

class A {
	int i = 10;

	int m1() {
		return i;
	}
}

class B extends A {
	int i = 20;

	int m1() {
		return i;
	}
}

class C extends B {
	int i = 30;

	int m1() {
		return i;
	}
}
