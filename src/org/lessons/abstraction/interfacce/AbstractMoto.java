package org.lessons.abstraction.interfacce;

public abstract class AbstractMoto implements Veicolo {

	public abstract int getNumeroTempi();
	
	@Override
	public void frena() {
		System.out.println("Sto frenando in moto");
	}
}
