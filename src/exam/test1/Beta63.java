package exam.test1;

/**
 What will the following code print when run?
 1) Beta 44 
    4 44 
    Baap 44 
    44 44;
 2) Baap 44 
    4 44 
    Beta 44 
    44 44;
 3) Beta 44 
    4 44 
    Beta 44 
    4 44;
 1) Beta 44 
    4 44 
    Beta 44 
    44 44;   
 */

class Baap {
	public int h = 4;

	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}
}

public class Beta63 extends Baap {
	public int h = 44;

	public int getH() {
		System.out.println("Beta " + h);
		return h;
	}

	public static void main(String[] args) {
		Baap b = new Beta63();
		System.out.println(b.h + " " + b.getH());
		Beta63 bb = (Beta63) b;
		System.out.println(bb.h + " " + bb.getH());
	}
}
