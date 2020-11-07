package exam.test1;

/**
 What will be the result of compiling and running the following code?
 1) It will print the hash code of the object.
 2) It will print hello.
 3) Compile time error at //1.
 4) Compile time error at //2.
 5) Compile time error at //3.
 */

class Base {
	public Object getValue() {
		return new Object();
	} // 1
}

class Base2 extends Base {
	public String getValue() {
		return "hello";
	} // 2
}

public class TestClass21{    
	public static void main(String[] args){       
		Base b = new Base2();       
		System.out.println(b.getValue()); //3    
		
	} 
}
