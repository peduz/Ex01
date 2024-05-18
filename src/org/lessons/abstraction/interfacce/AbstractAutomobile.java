package org.lessons.abstraction.interfacce;

public abstract class AbstractAutomobile implements Veicolo {

	public abstract void stampaVelocitaMassima();
	
	public abstract int getNumeroPorte();
	
	@Override
	public void frena() {
		System.out.println("Sto frenando");
	}
}
