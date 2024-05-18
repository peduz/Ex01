package org.lessons.abstraction.interfacce;

public class Concessionario {

	public static void main(String[] args) {
		String nomeProprietario = "Gabriele";
		Toyota macchinaDiGabriele = new Toyota(nomeProprietario);

		macchinaDiGabriele.getProprietario();
		macchinaDiGabriele.startMotore();
		macchinaDiGabriele.accelera();
		macchinaDiGabriele.frena();
		System.out.println(String.format("Ho %s porte", macchinaDiGabriele.getNumeroPorte()));
		macchinaDiGabriele.stopMotore();
		
		AbstractAutomobile macchinaMia = new Dacia();
		macchinaMia.startMotore();
		macchinaMia.accelera();
		macchinaMia.frena();
		macchinaMia.stopMotore();
		
		
		stampaVeicolo(macchinaDiGabriele);
		stampaVeicolo(macchinaMia);
	}
	
	
	public static void stampaVeicolo(Veicolo auto) {
		System.out.println(auto.toString());
	}
}
