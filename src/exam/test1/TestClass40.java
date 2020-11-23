package exam.test1;

/** 
What will the following code print when run?
1) It will not compile;
2) It will throw ClassCastException at runtime;
3) a = class AA
   aa = class AA;
4) a = class A
   aa = class AA;  
 */

class A1 {
}

class AA extends A1 {
}

public class TestClass40 {
	public static void main(String[] args) throws Exception {
		A1 a = new A1();
		AA aa = new AA();
		a = aa;
		System.out.println("a = " + a.getClass());
		System.out.println("aa = " + aa.getClass());

	}
}