
public class Principale {

	public static void main(String[] args) {
		ArchivioScuola as=new ArchivioScuola();
		
		as.addPersona((Persona)new Docente("alfonso","bianchi",45,"lettere"));
		
//		Persona d=new Docente("mario","rossi",35,"lettere");
//		as.addPersona(d);
//		d=new PersonaleNonDocente("arturo","fanti", 65, "bidello");
//		as.addPersona(d);
		
		as.addPersona(new Docente("mario","rossi",35,"lettere"));  // upcast
		as.addPersona(new PersonaleNonDocente("arturo","fanti", 65, "bidello"));

		as.listaDocenti("lettere");
		
	}

}
