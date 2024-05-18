package org.lessons.abstraction;

public class Vacca extends Animale {

	@Override
	public void faiVerso() {
		System.out.println("MUUUUUUU");
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
}
