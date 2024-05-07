package org.lessons.inheritance;

public class Documentario extends Contenuto {

	private String regista;
	
	public Documentario(String titoloContenuto, String registaDoc) {
		super(titoloContenuto);
		this.regista = registaDoc;
	}
	
	public Documentario(String titoloContenuto,
			double durataContenuto, String registaDoc) {
		super(titoloContenuto, durataContenuto);
		this.regista = registaDoc;
	}
	
	public String getRegista() {
		return this.regista;
	}
	
	public String toString() {
		return super.toString() + " il regista è " + regista;
	}
	
}
