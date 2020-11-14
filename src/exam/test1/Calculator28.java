package exam.test1;

/**
 What will the following code print when compiled and run? 
 1) It will not compile;
 2) It will not print anything and will throw NullPointerException;
 3) It will print calculating and then throw NullPointerException;
 4) It will print calculating and then throw NoSuchMethodError;
 5) It will print calculating and then throw MethodNotImplementedException;
 */

abstract class Calculator28 {
	abstract void calculate();

	public static void main(String[] args) {
		System.out.println("calculating");
		Calculator28 x = null;
		x.calculate();
	}
}
