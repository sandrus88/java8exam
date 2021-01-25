package exam.my;

public class Officina {
	static String indirizzo = "Via Maragliano, 52, Firenze";
    String[] dipendenti = { "Meccanico1", "Meccanico2", "Motorista", "Elettrauto", "Segretaria" };
	String clienti;
	String veicoli;
	String interventi;

	Officina() {

	}

	Officina(String clienti, String veicoli, String interventi) {
		this.clienti = clienti;
		this.veicoli = veicoli;
		this.interventi = interventi;
	}

	public void singoloDipendente(int x) {
		System.out.println("Dipendente " + (x+1) + ": " + dipendenti[x]);
	}
	
	public String addClienti() {
		return clienti; 
	}

	public String addVehicles() {
		return veicoli; 
	}
	
	public String interventi() {
		return interventi; 
	}
	
	public String toString() {
		String objectString = "Nome Cliente : " + clienti + ", " + "Modello veicolo: " + veicoli + ", " + "Interventi effettuati: " + interventi;
		return objectString; 
	}
	
	public static void main(String[] args) {
		Officina dip = new Officina();
		Officina clients = new Officina("Ermal", "Mercedes", "");
		System.out.println("Primo Cliente:\n" + clients);
	}
}
