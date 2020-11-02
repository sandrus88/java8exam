package exam.test1;

/**
 * Consider the following method... public int setVar(int a, int b, float c){...}
 * Which of the following methods correctly overload the above method?
 * <p>
 *   1) public int setVar(int a, float b, int c){
 *          return (int)(a + b + c);
 *      };
 *   2) public int setVar(int a, float b, int c){
 *          return this(a, c, b);
 *      };
 *   3) public int setVar(int x, int y, float z){
 *          return x+y;
 *      };
 *   4) public float setVar(int a, int b, float c){
 *          return c*a;
 *      };
 *   5) public float setVar(int a){
 *          return a;
 *      };
 */
public class Ex17 {
    
    //1. //different argument sequence, same return type
    public int setVar(int a, float b, int c) {
        return (int) (a + b + c);
    }
    
    //2  //different argument sequence, same return type. The signature is a case overload, BUT the method do not complie.
    // this() is used only in constructor
//    public int setVar(int a, float b, int c) {
//        return this(a, c, b);
//        return  0;//when this is used?  is this correct?
//    }
    //3 //this has the same argument sequence, same return type. can we say is an overloading case?
    public int setVar(int x, int y, float z) {
        return x + y;
    }
//    //4. //this has same argument sequence, but different return type. is the case of overloading?
//    public float setVar(int a, int b, float c) {
//        return c * a;
//    }
//    // 5
//    public float setVar(int a) { //different argument, but different return type  too. is teh case of overloading?
//        return a;
//    }

    //who from the followings overloads the original methods?
    // https://www.programiz.com/java-programming/method-overloading
    public static void main(String[] args) {
		Ex17 ex = new Ex17();
//		System.out.println(ex.setVar(1, 2, (float)2.5));
	}
}
