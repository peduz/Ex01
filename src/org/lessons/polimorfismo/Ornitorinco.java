package org.lessons.polimorfismo;

public class Ornitorinco extends Mammifero {

	private String tipoCoda;
	
	private String prede;
	
	public Ornitorinco() {
		setRiproduzione("oviparo");
		setVerso("coccodè");
		setHabitat("lacustre");
	}
	
	@Override
	public void vivo() {
		System.out.println("Sono il mammifero più "
				+ "strano del mondo e vivo in habitat " + getHabitat());
	}

	@Override
	public void faiVerso() {
		System.out.println("Il mio verso è crocchiare " + getVerso());
	}
	
	public String getTipoCoda() {
		return tipoCoda;
	}

	public void setTipoCoda(String tipoCoda) {
		this.tipoCoda = tipoCoda;
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
				" Ornitorinco tipoCoda=" + tipoCoda + 
				", prede=" + prede;
	}
	
	
}
