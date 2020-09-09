package exam.test1;

/**
<<<<<<< HEAD
 * Consider the following method... public int setVar(int a, int b, float
 * c){...} Which of the following methods correctly overload the above method?
 * 
 * 1) public int setVar(int a, float b, int c){    return (int)(a + b + c); };
 * 2) public int setVar(int a, float b, int c){    return this(a, c, b); }; 3)
 * public int setVar(int x, int y, float z){    return x+y; }; 4) public float
 * setVar(int a, int b, float c){    return c*a; }; 5) public float setVar(int
 * a){    return a; };
=======
 * Consider the following method... public int setVar(int a, int b, float c){...}
 * Which of the following methods correctly overload the above method?
 * <p>
 * 1) public int setVar(int a, float b, int c){ ï¿½ï¿½
 * return (int)(a + b + c);
 * };
 * 2) public int setVar(int a, float b, int c){ ï¿½ï¿½
 * return this(a, c, b);
 * };
 * 3) public int setVar(int x, int y, float z){ ï¿½ï¿½
 * return x+y;
 * };
 * 4) public float setVar(int a, int b, float c){ ï¿½ï¿½
 * return c*a;
 * };
 * 5) public float setVar(int a){ ï¿½ï¿½
 * return a;
 * };
>>>>>>> refs/remotes/origin/master
 */
public class Ex17 {

<<<<<<< HEAD
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
=======
    //who from the followings overloads the original methods?
    // https://www.programiz.com/java-programming/method-overloading
    public int setVar(int a, float b, int c) { //different argument sequence, same return type
        return (int) (a + b + c);
    }
    public int setVar(int a, float b, int c) {  //different argument sequence, same return type
        return this(a, c, b); //when this is used?  is this correct?
    }
    public int setVar(int x, int y, float z) { //this has the same argument sequence, same return type. can we say is an overloading case?
        return x + y;
    }
    public float setVar(int a, int b, float c) { //this has same argument sequence, but different return type. is the case of overloading?
        return c * a;
    }
    public float setVar(int a) { //different argument, but different return type too. is teh case of overloading?
        return a;
    }
>>>>>>> refs/remotes/origin/master

<<<<<<< HEAD
	public static void main(String[] args) {
		Ex17 ex = new Ex17();
		System.out.println(ex.setVar(1, 2, (float)2.5));
		System.out.println(ex.setVar(1, (float)4.5, 5));
		System.out.println(ex.setVar(1, (float)3.5, 2));
		System.out.println(ex.setVar(1, 7, (float)1.5));
		System.out.println(ex.setVar(1, 3, (float)5.5));
		System.out.println(ex.setVar(1));
	}
=======
    //original methods
    public int setVar(int a, int b, float c) {
        return a;
    }

    public static void main(String[] args) {
        Ex17 ex = new Ex17();
        System.out.println(ex.setVar());
    }
>>>>>>> refs/remotes/origin/master
}