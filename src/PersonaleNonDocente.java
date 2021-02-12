
public class PersonaleNonDocente extends Persona {
	private String mansione;

	public PersonaleNonDocente(String nome, String cognome, int eta, String mansione) {
		super(nome, cognome, eta);
		this.mansione = mansione;
	}

	public String getMansione() {
		return mansione;
	}

	public void setMansione(String mansione) {
		this.mansione = mansione;
	}
	
}
