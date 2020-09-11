package exam.test1;

public class Ex17 {

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
        return a;
    }

	public static void main(String[] args) {
		Ex17 ex = new Ex17();
		System.out.println(ex.setVar(1, 2, (float)2.5));
	}
}
