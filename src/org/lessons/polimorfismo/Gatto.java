package org.lessons.polimorfismo;

public class Gatto extends Mammifero {

	private int numeroVite;
	
	private String prede;

	@Override
	public void vivo() {
		System.out.println("Sono un animale " + getHabitat());
	}
	
	@Override
	public void faiVerso() {
		System.out.println("Il mio verso è miagolare " + getVerso());
	}
	
	public int getNumeroVite() {
		return numeroVite;
	}

	public void setNumeroVite(int numeroVite) {
		this.numeroVite = numeroVite;
	}

	public String getPrede() {
		return prede;
	}

	public void setPrede(String prede) {
		this.prede = prede;
	}

	@Override
	public String toString() {
		return super.toString() + 
				" Gatto numeroVite=" + this.numeroVite + 
				", prede=" + this.prede;
	}
	
	
}
