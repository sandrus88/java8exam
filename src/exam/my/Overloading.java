package exam.my;

public class Overloading {
// 1 crea metodo somma che prende 2 interi e ritorna il risultato	 
// 2 crea metodo somma che prende 3 interi e ritorna il risultato
// 3 crea metodo somma che prende 2 double e ritorna il risultato
// 4 crea metodo somma che prende 2 float e ritorna il risultato 
// 5 chiamare tutti i metodi e stamparli

	public int somma(int x, int y) {
		return x + y;
	}

	public int somma(int x, int y, int z) {
		return x + y + z;
	}

	public double somma(double x, double y) {
		return x + y;
	}

	public float somma(float x, float y) {
		return x + y;
	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		int resultInt = o.somma(45, 20);
		System.out.println("result 2 int: " + resultInt);

		resultInt = o.somma(3, 5, 8);
		System.out.println("result 3 int: " + resultInt);

		double resultDouble = o.somma(3.3, 5.6);
		System.out.println("result 2 double: " + resultDouble);

		float resultFloat = o.somma(3.2f, 3f);
		System.out.println("result 2 float: " + resultFloat);
	}

}
