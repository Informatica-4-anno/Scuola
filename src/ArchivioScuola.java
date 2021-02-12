
public class ArchivioScuola {
	private Persona[] personale = new Persona[20];
	private int ultimo=0;   // contiene la prima pos. libera nel vettore
	
	public boolean addPersona(Persona p) { // aggiunge una persona all'archivio 
		                                  // restituisce false in caso di errore
		 if (ultimo < personale.length) {
	    	 personale[ultimo++]=p;
	    	 return true;
	     } else {
	    	 System.err.println("** la lista è piena");
	    	 return false;
	     }
	}
	
	
	public Persona getYounger() { // restituisce la persona più giovane
		Persona p;
		if (ultimo==0) {
			p=null;
		} else {
			p=personale[0];
			for (int i=1;i<ultimo;i++) {
				if (p.getEta()>personale[i].getEta()) {
					p=personale[i];
				}
			}
		}
		return p;
	}
	
	public Docente getOlder() { // restituisce il docente più vecchio
		Persona p=null;
		if (ultimo==0) {
			p=null;
		} else {
			for (int i=0;i<ultimo;i++) {
				if (personale[i] instanceof Docente) {
//					if ( p == null ) {
//						p=personale[i];
//					} else if (p.getEta()<personale[i].getEta()) {
//						p=personale[i];
//					}
					
					if ( p == null || p.getEta()<personale[i].getEta()) {
						p=personale[i];
					}
				}
			}
		}
		return (Docente)p; // Downcast
	}
	
    public void listaDocenti(String materia) { // produce elenco docenti per materia
    	for (int i=0;i<ultimo;i++) {
    		if (personale[i] instanceof Docente  &&
    				((Docente)personale[i]).getMateria().equalsIgnoreCase(materia)) {
    					System.out.println(personale[i]);
    		}
    	}	
    }

    public void listaNonDocenti(String mansione) { // produce elenco non docenti per mansione
    	for (int i=0;i<ultimo;i++) {
    		if (personale[i] instanceof PersonaleNonDocente  &&
    				((PersonaleNonDocente)personale[i]).getMansione().equalsIgnoreCase(mansione)) {
    					System.out.println(personale[i]);
    		}
    	}	
    }
}
