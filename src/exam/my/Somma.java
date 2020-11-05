package exam.my;

// 1 crea un costruttore della classe OverloadConstructor, che stampa a video "oggetto creato"
// 2 crea un metodo che prende due int e ritorna la somma dei due 
// 3 dal main crear l'oggetto e chiamare il metodo del punto 2, e stampa a video il risultato ottenuto

public class Somma {

	public Somma() {
		System.out.println("oggetto creato");
	}

	public int somma(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		// call create String using all available constructors
		Somma o1;
		o1 = new Somma();
		int result = o1.somma(45, 20);
		System.out.println("result: " + result);
		
	}
}
