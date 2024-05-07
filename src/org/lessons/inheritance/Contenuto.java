package org.lessons.inheritance;

public class Contenuto {

	private String titolo;
	
	private double durata;
	
	public Contenuto(String titoloContenuto) {
		this.titolo = titoloContenuto;
	}
	
	public Contenuto(String titoloContenuto, 
			double durataContenuto) {
		this.titolo = titoloContenuto;
		this.durata = durataContenuto;
	}
	
	public void riproduci() {
		System.out.println("Stai guardando " + titolo + 
				", della durata di " + durata + " minuti.");
	}
	
	public String toString() {
		return "Titolo " + titolo + 
				" durata " + durata;
	}
}
