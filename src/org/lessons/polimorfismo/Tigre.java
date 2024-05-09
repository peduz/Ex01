package org.lessons.polimorfismo;

public class Tigre extends Mammifero {
	
	private double lunghezzaDenti;
	
	private double lunghezzaCoda;
	
	private String prede;

	@Override
	public void vivo() {
		System.out.println("Sono il più grosso predatore "
				+ "del mio habitat: " + super.getHabitat()); 
	}
	
	@Override
	public void faiVerso() {
		System.out.println("Io ruggisco " + getVerso());
	}

	public double getLunghezzaDenti() {
		return lunghezzaDenti;
	}

	public void setLunghezzaDenti(double lunghezzaDenti) {
		this.lunghezzaDenti = lunghezzaDenti;
	}

	public double getLunghezzaCoda() {
		return lunghezzaCoda;
	}

	public void setLunghezzaCoda(double lunghezzaCoda) {
		this.lunghezzaCoda = lunghezzaCoda;
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
				" Tigre lunghezzaDenti=" + lunghezzaDenti + 
				", lunghezzaCoda=" + lunghezzaCoda + ", prede=" + prede;
	}
	
	
}
