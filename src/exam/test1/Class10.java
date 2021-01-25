package exam.test1;

/**
 * 
 * Which of the following are valid at line 1? String s; ( ok ) String s =
 * 'asdf'; String s = 'a'; String s = this.toString(); ( ok in un metodo non
 * statico ) String s = asdf;
 * 
 */

public class Class10 {
	int x = 1;
	static int xStatic = 2;

	void metodo1() {
		int y = this.x;
		int y1 = x;
		String s = this.toString();
	}

	public static void main(String args[]) {
		Class10 obj = new Class10();
		obj.toString();
		
		String s;
		// String s1 = 'asdf';
		// String s2 = 'a';
		//String s3 = this.toString();
		//int s3a = x;
		// String s4 = asdf;
		//int y = x;
		int y1 = xStatic;
		
	}
}
