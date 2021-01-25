package exam.my;

public class StaticNonStatic {
	String nome;
	static String indirizzo = "Firenze";
	
	StaticNonStatic(String input) {
		nome = input;
	}
	
	public String toString() {
		String objectString = "il mio nome è " + nome + " e abito a " + indirizzo;
		return objectString;
	}
	
	public static void main(String[] args) {
		StaticNonStatic o1 = new StaticNonStatic("Ermal");
		StaticNonStatic o2 = new StaticNonStatic("Sandro");
		StaticNonStatic o3 = new StaticNonStatic("Armela");
	
		System.out.println("o1: " + o1);
		System.out.println("o2: " + o2);
		System.out.println("o3: " + o3);
	}
}
