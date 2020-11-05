package exam.my;

public class OverloadingCall {
	// 1 elenca tutti i costruttori della classe java.String
	// 2 chiama ogni costruttore della classe java.String e stampa il risultato
	// 3 usa i seguenti costruttori della classe java
	//	String()
	//	String(String)
	//	String(char[])
	//	String(char[], int, int)
	//	String(int[], int, int)
	//	String(byte[], int, int, int)
	//	String(byte[], int)
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1: " + s1);

		String s2 = new String("Hello World as string!");
		System.out.println("s2: " + s2);

        char[] charArr = new char[4];
		charArr[0] = 'c';
		charArr[1] = 'i';
		charArr[2] = 'a';
		charArr[3] = 'o';
		Array.printArray(charArr);

		String s3 = new String(charArr);
		System.out.println("s3: " + s3);

		String s4 = new String(charArr, 1, 2);
		System.out.println("s4: " + s4);
	}
}
