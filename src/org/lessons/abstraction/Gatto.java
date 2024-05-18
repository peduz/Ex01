package org.lessons.abstraction;

public class Gatto extends Animale implements Comparable<Gatto> {

	public Gatto() {}
	
	public Gatto(String nomeGatto) {
		this.nome = nomeGatto;
	}
	
	@Override
	public void faiVerso() {
		System.out.println("Miao");
	}
	
	public void salutoDaGatti() {
		System.out.println("Ciao 2");
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Gatto gatto2) {
		if(this.nome.startsWith("F")) {
			return -1;
		} else if(gatto2.nome.startsWith("F")) {
			return +1;
		}
		
		return this.nome.compareTo(gatto2.nome);
	}
	
	@Override
	public String toString() {
		return "Nome " + nome;
	}
}
