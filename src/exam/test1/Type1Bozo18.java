package exam.test1;

/**
 What will the program print when compiled and run?
  1) jumping...0;
  2) jumping...1;
  3) This program will not compile;
  4) It will throw an exception at runtime;
**/

public class Type1Bozo18 implements Bozo {
	public Type1Bozo18() {
		//type = 1;
	}

	public void jump() {
		System.out.println("jumping..." + type);
	}

	public static void main(String[] args) {
		Bozo b = new Type1Bozo18();
		b.jump();
	}
}
