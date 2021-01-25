package exam.my;

public class StringEqual {

	public static void main(String[] args) {
		String a = "Hello World!";
		String a1 = "Sandro";
		String a1a = "Sandro";
		String a1b = new String("Sandro");
		String a2 = "Ermal";
		String a3 = "Armela";
		String a4 = "Aida";

		String x = a1;
		
		if (a1 == a1a) {
			System.out.println("a1 == a1a: sono uguali");
		} else {
			System.out.println("a1 == a1a: non sono uguali");
		}
		
		if (a1 == a1b) {
			System.out.println("a1 == a1b: sono uguali");
		} else {
			System.out.println("a1 == a1b: non sono uguali");
		}
		
		if (a1.equals(a1b)) {
			System.out.println("a1 == a1b: sono uguali.equal");
		} else {
			System.out.println("a1 == a1b: non sono uguali.equal");
		}
		
		if (a1 == x) {
			System.out.println("a1 == x: sono uguali");
		} else {
			System.out.println("a1 == x: non sono uguali");
		}


		System.out.println("a1 = " + a1 + ", a1a = " + a1a + ", x = " + x);
	}
}
