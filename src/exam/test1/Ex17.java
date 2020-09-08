package exam.test1;

/**
 * Consider the following method... public int setVar(int a, int b, float
 * c){...} Which of the following methods correctly overload the above method?
 * 
 * 1) public int setVar(int a, float b, int c){    return (int)(a + b + c); };
 * 2) public int setVar(int a, float b, int c){    return this(a, c, b); }; 3)
 * public int setVar(int x, int y, float z){    return x+y; }; 4) public float
 * setVar(int a, int b, float c){    return c*a; }; 5) public float setVar(int
 * a){    return a; };
 */
public class Ex17 {
	public int setVar(int a, int b, float c) {
		return a;
	}

	public int setVar(int a, float b, int c) {
		return (int) (a + b + c);
	}

	public int setVar(int a, float b, int c) {    
		return this(a, c, b); 
    }

	public int setVar(int x, int y, float z) {    
		return x+y; 
	}

	public float setVar(int a, int b, float c) {    
		return c*a; 
	}
	
	public float setVar(int a) {    
		return a; 
	}

	public static void main(String[] args) {
		Ex17 ex = new Ex17();
		System.out.println(ex.setVar(1, 2, (float)2.5));
		System.out.println(ex.setVar(1, (float)4.5, 5));
		System.out.println(ex.setVar(1, (float)3.5, 2));
		System.out.println(ex.setVar(1, 7, (float)1.5));
		System.out.println(ex.setVar(1, 3, (float)5.5));
		System.out.println(ex.setVar(1));
	}
}