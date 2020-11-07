package exam.test1;

/**
 1) a 
    a again 
    c 
    c again;
 2) a 
    a again 
    b;
 3) a 
    a again 
    b 
    b again;
 4) c 
    c again;       
 */

public class TestClass25 {
	public static void main(String[] args) throws Exception {
		String[] sa = { "a", "b", "c" };
		for (String s : sa) {
			if ("b".equals(s))
				continue;
			System.out.println(s);
			if ("b".equals(s))
				break;
			System.out.println(s + " again");
		}
	}
}
