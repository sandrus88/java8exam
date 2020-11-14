package exam.test1;

/**
 What will happen when the above code is compiled and run?
 1) It will give an error at compile time at line //1;
 2) It will give an error at compile time at line //2;
 3) It will give an error at compile time at line //3;
 4) It will give an error at compile time at line //4;
 5) It will compile and run without any problem;
 */

public class Sample35 implements IInt {
	public static void main(String[] args) {
		Sample35 s = new Sample35(); // 1
		int j = s.thevalue; // 2
		int k = IInt.thevalue; // 3
		int l = thevalue; // 4
	}
}