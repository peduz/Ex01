package org.lessons.abstraction;

public abstract class Animale {

	protected String nome;
	
	public abstract void faiVerso();
	
	public void saluto() {
		System.out.println("Ciao " + nome);
	}
	
	public abstract void setNome(String nome);
}
