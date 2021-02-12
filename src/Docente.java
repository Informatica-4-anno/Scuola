
public class Docente extends Persona {
	private String materia;

	public Docente(String nome, String cognome, int eta, String materia) {
		super(nome, cognome, eta);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}
