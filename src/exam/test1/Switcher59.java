package exam.test1;

/**
 * What will the above program print if compiled and run using the following
 * command line: java Switcher 1 2 3. 1) It will print 1; 2) It will print 2; 3)
 * It will print 3; 4) It will not print anything; 5) It will not compile
 * because of //1; 6) It will not compile because of //2; 7) It will not compile
 * for some other reason;
 */

public class Switcher59 {

	public static void main(String[] args) {
		switch (Integer.parseInt(args[1])) // 1
		{
		case 0:
			boolean b = false;
			break;

		case 1:
			b = true; // 2
			break;
		}

		if (b)
			System.out.println(args[2]);
	}
}
