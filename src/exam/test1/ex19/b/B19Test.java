package exam.test1.ex19.b;

import exam.test1.ex19.a.A19;

public class B19Test {
	public static void main(String[] args) {
		// new B19();
		A19 a19 = new A19();
		a19.print();
//        a19.printPrivateVisibility();

		B20 b20 = new B20();
		b20.printVisibilityPackage();

		B19 b19 = new B19();
		b19.print();

	}
}
