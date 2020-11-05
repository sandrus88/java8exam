package exam.my;

public class Array {
// 1 elenca tutti i costruttori della classe java.String
// 2 chiama ogni costruttore della classe java.String e stampa il risultato

	public static void main(String[] args) {
		int x = 0;
		int[] arr = new int[5];
		// chiama printArray
		System.out.println("Array1 : ");
		printArray(arr);

		arr[0] = 7;
		arr[1] = 8;
		arr[2] = 9;
		arr[3] = 10;
		arr[4] = 11;
		// chiama printArray
		System.out.println("Array2 : ");
		printArray(arr);

	}
	// crea metodo che dato un array stampa i suoi elementi

	public static void printArray(int[] arr) {
		// costruisci un for che va da 0 a lunghezza array e
		// per ogni i stampa elemento i-esimo
		System.out.println("lunghezza array : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=" + arr[i] + ", ");
		}
		System.out.println();

	}

	public static void printArray(char[] arr) {
		// costruisci un for che va da 0 a lunghezza array e
		// per ogni i stampa elemento i-esimo
		System.out.println("lunghezza array : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]=" + arr[i] + ", ");
		}
		System.out.println();
	}
}
