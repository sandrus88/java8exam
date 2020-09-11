package exam.my;

public class This {

	public int setVar(int a, float b, int c) {  
		return this(a, c, b); 
    }

	public static void main(String[] args) {
		This ex = new This();
		System.out.println(ex.setVar(1, (float)2.5, 5));
    }
}
