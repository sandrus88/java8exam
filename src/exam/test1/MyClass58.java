package exam.test1;

/**
 Which of the following statements will correctly create and initialize 
 an array of Strings to non null elements? Please select 4 options
 1) String[] sA = new String[1] { "aaa"};
 2) String[] sA = new String[] { "aaa"};
 3) String[] sA = new String[1] ; sA[0] = "aaa";
 4) String[] sA = {new String( "aaa")};
 5) String[] sA = { "aaa"};
 */

import java.util.Arrays;

public class MyClass58 {

	// creare un metodo che stampa un array di stringhe
	// input: array di stringhe.
	// output: niente.
	// what it does: scandisce gli elementi dell'array e li stampa uno ad uno.
	public static void printArray(String[] arrStr) {
		for (int i = 0; i < arrStr.length; i++) {
			System.out.print(arrStr[i] + ", ");
		}
		System.out.println();
	}

	// creare un metodo che dato un array si stringhe ritorna tutti gli elementi
	// come un unica stringa
	// input: array di stringhe.
	// output: una stringa con la concatenazione di tutti gli elementi.
	// what it does: costruisce la stringa con la concatenazione degli elementi, poi
	// ritorna il valore
	public static String getArrayAsString(String[] arrStr) {
		String rv = "";
		for (int i = 0; i < arrStr.length; i++) {
			rv = rv + arrStr[i] + ", " ;
		}
		return rv;
	}

	public static void main(String args[]) {
		// String[] sA1 = new String[1] { "aaa" };
		String[] sA2 = new String[] { "aaa", "sss", "s" };
		String[] sA3 = new String[1];
		sA3[0] = "aaa";
		String[] sA4 = { new String("aaa") };
		String[] sA5 = { "aaa" };

		System.out.println(Arrays.toString(sA2));
		printArray(sA2);
		System.out.println(getArrayAsString(sA2));
		
		String s = "";
		s = s + "a";
		s = s + "b";
		System.out.println(s);
	}
}
