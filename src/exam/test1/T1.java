package exam.test1;

/**
 What, if anything, is wrong with the following code?
 1) T3 cannot implement both T1 and T2 because it leads to ambiguity;
 2) There is nothing wrong with the code;
 3) The code will work fine only if VALUE is removed from T2 interface;
 4) The code will work fine only if m1() is removed from either T2 or T3;
 5) None of the above;
 */
interface T1 {
}

interface T2 {
	int VALUE = 10;

	void m1();
}

interface T3 extends T1, T2 {
	public void m1();

	public void m1(int x);
}