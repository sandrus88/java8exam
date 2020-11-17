package exam.test1;

/**
 Which line(s) will cause a compilation error?
 1) 1;
 2) 2;
 3) 3;
 4) 4;
 5) 5;
 6) 6;
 7) 7;
 8) 8;
 9) None of them will cause any error;
 */

public interface ConstTest70 {
	public int A = 1; //1
	int B = 1;          //2
	static int C = 1;  //3
	final int D = 1; 	 //4
	public static int E = 1; //5
	public final int F = 1;  //6
	static final int G = 1;    //7
	public static final int H = 1; //8
}
