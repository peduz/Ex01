package org.lessons.abstraction.interfacce;

public class Dacia extends AbstractAutomobile {
	
	private String motoreRenault;
	
	public Dacia() {
	}
	
	@Override
	public void frena() {
		System.out.println("Dischi davanti, tamburo dietro");
	}
	
	@Override
	public void startMotore() {
		System.out.println("Start con Start&Stop Dacia");
	}

	@Override
	public void stopMotore() {
		System.out.println("Stop con Start&Stop Dacia");
	}

	@Override
	public void accelera() {
		System.out.println("Consumo gpl");
	}

	@Override
	public void stampaVelocitaMassima() {
		System.out.println("Sto andando a 180km/h");
	}

	@Override
	public int getNumeroPorte() {
		return 5;
	}

	public String getMotoreRenault() {
		return motoreRenault;
	}
	
	public void setMotoreRenault(String motoreRenault) {
		this.motoreRenault = motoreRenault;
	}
	
	@Override
	public String toString() {
		return "Motore renault " + motoreRenault;
	}
}
