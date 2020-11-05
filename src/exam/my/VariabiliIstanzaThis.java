package exam.my;

// 1 creare una classe che abbia 2 variabili d'istanza di tipi intero x e y
// 2 creare un costruttore per inizializzare entrambe le variabili con quello ricevuto in input
// 3 creare un costruttore di default, che non riceve niente in input e inizializza i valori x e y a 0 
// 4 crea metodo somma che somma le due variabili d'istanza, ritorna il risultato e azzera i due interi
// 5 creare get e set per le variabili d'istanza
// 6 crea main per testare il tutto
public class VariabiliIstanzaThis {
	private int x;
	private int y;

	public VariabiliIstanzaThis(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public VariabiliIstanzaThis() {
//		x = 0;
//		y = 0;
		// oppure
		this(0, 0);
	}

	public int somma() {
		int sum = x + y;
		x = 0;
		y = 0;
		return sum;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x1) {
		x = x1;
	}

	public void setY(int y1) {
		y = y1;
	}

	public static void main(String[] args) {
// crea un oggetto con i parametri 4 e 2
// somma e stampa il risultato
// somma e stampa il risultato
// set x a 6 e set y a 3 e fai la somma 
// crea un altro oggetto con il costruttore di default
// somma e stampa il risultato
// set x a 24 e set y a 13 
// somma e stampa il risultato
		VariabiliIstanzaThis o1 = new VariabiliIstanzaThis(4, 2);
		int result = o1.somma();
		System.out.println("result1: " + result);
		
	    result = o1.somma();
		System.out.println("result2: " + result);
		
		o1.setX(6);
		o1.setY(3); 
		result = o1.somma();
		System.out.println("result3: " + result);
		System.out.println("x: " + o1.getX() + ", y: " + o1.getY());
		
		VariabiliIstanzaThis o2 = new VariabiliIstanzaThis();
		result = o2.somma();
		System.out.println("result4: " + result);
		
		o2.setX(24);
		o2.setY(13); 
		System.out.println("result5: " + o2.somma());
	}
}
