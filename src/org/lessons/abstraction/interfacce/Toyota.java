package org.lessons.abstraction.interfacce;

public class Toyota extends AbstractAutomobile {

	private String proprietario;
	
	private long kmPercorsi;
	
	public Toyota(String proprietarioAuto) {
		this.proprietario = proprietarioAuto;
		this.kmPercorsi = 0;
	}
	
	@Override
	public void startMotore() {
		String stringaPartenza = stringaPartenzaMotore();
		System.out.println(stringaPartenza);
	}

	private String stringaPartenzaMotore() {
		return "Start con Start&Stop";
	}
	
	@Override
	public void stopMotore() {
		System.out.println("Stop con Start&Stop");
	}

	@Override
	public void accelera() {
		System.out.println("Sto consumando olio");
		
	}
	
	@Override
	public void stampaVelocitaMassima() {
		System.out.println("STO VOLANDO 170 Martin Garrix");
	}

	@Override
	public int getNumeroPorte() {
		return 5;
	}

	
	public String getProprietario() {
		return proprietario;
	}
	
	public void setKmPercorsi(long kmPercorsi) {
		this.kmPercorsi = kmPercorsi;
	}
	
	public long getKmPercorsi() {
		return kmPercorsi;
	}
	
	@Override
	public String toString() {
		return "Proprietario: " + proprietario + ", kmPercorsi " + kmPercorsi;
	}
}
