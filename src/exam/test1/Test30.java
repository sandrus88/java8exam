package exam.test1;

/**
The following class will print 'index = 2' when compiled and run.
1) True;
2) False;
*/

class Test30 {
	public static int[] getArray() {
		return null;
	}

	public static void main(String[] args) {
		int index = 1;
		try {
			getArray()[index = 2]++;
		} catch (Exception e) {
		} // empty catch
		System.out.println("index = " + index);
	}
}
