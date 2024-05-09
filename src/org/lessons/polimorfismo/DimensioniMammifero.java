package org.lessons.polimorfismo;

public class DimensioniMammifero {

	private double altezza;
	
	private double peso;
	
	private double lunghezza;

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	
	@Override
	public String toString() {
		return "Lunghezza=" + lunghezza + 
				" altezza=" + altezza + 
				" peso=" + peso;
	}
}
