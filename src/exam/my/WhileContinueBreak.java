package exam.my;

public class WhileContinueBreak {

	public static void main(String[] args) throws Exception {
		int i = 0;
		while (i < 10) {
			System.out.println("i=" + i);
			if (i++ < 5) {
				System.out.println("OK");
				continue;
			}
			if (i == 7) {
				System.out.println("fatale. esci assolutamente");
				break;
			}

			System.out.println("non OK. numero molto grande");
		}

		System.out.println("fuori while");
	}
}