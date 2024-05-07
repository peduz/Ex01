package org.lessons.inheritance;

public class DocumentarioAnimali extends Documentario {

	private String tipoAnimali;
	
	public DocumentarioAnimali(String titoloDoc, 
			double durataDoc, String regista) {
		super(titoloDoc, durataDoc, regista);
		
	}
	
	public String getTipoAnimali() {
		return this.tipoAnimali;
	}
	
	public void setTipoAnimali(String animaliDoc) {
		this.tipoAnimali = animaliDoc;
	}
	
	
	public String toString() {
		return super.toString() + " il tipo di animali è " + tipoAnimali;
	}
}
