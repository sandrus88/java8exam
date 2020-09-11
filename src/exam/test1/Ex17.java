package exam.test1;

<<<<<<< HEAD
=======
/**
 * Consider the following method... public int setVar(int a, int b, float c){...}
 * Which of the following methods correctly overload the above method?
 * <p>
 * 1) public int setVar(int a, float b, int c){ ��
 * return (int)(a + b + c);
 * };
 * 2) public int setVar(int a, float b, int c){ ��
 * return this(a, c, b);
 * };
 * 3) public int setVar(int x, int y, float z){ ��
 * return x+y;
 * };
 * 4) public float setVar(int a, int b, float c){ ��
 * return c*a;
 * };
 * 5) public float setVar(int a){ ��
 * return a;
 * };
 */
>>>>>>> branch 'master' of https://github.com/sandrus88/java8exam.git
public class Ex17 {
<<<<<<< HEAD

	public int setVar(int a, int b, float c) { //original method
		return a;
	} 
	//who from the followings overloads the original methods?
    // https://www.programiz.com/java-programming/method-overloading
    
	public int setVar(int a, float b, int c) { //different argument sequence, same return type (Si)
        return (int) (a + b + c);
    }
    public int setVar(int a, float b, int c) {  //different argument sequence, same return type (No)
        return this(a, c, b); //when this is used?  is this correct?
    }
    public int setVar(int x, int y, float z) { //this has the same argument sequence, same return type. can we say is an overloading case? (Si)
        return x + y;
    }
    public float setVar(int a, int b, float c) { //this has same argument sequence, but different return type. is the case of overloading? (No)
        return c * a;
    }
    public float setVar(int a) { //different argument, but different return type too. is teh case of overloading? (No)
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
>>>>>>> branch 'master' of https://github.com/sandrus88/java8exam.git
        return a;
    }

<<<<<<< HEAD
	public static void main(String[] args) {
=======
    //original methods
    public int setVar(int a, int b, float c) {
        return a;
    }

    public static void main(String[] args) {
>>>>>>> branch 'master' of https://github.com/sandrus88/java8exam.git
		Ex17 ex = new Ex17();
		System.out.println(ex.setVar(1, 2, (float)2.5));
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> branch 'master' of https://github.com/sandrus88/java8exam.git
