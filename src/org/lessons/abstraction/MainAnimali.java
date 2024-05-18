package org.lessons.abstraction;

public class MainAnimali {

	public static void main(String[] args) {
		Animale vacca = new Vacca();
		vacca.setNome("Carolina");
		vacca.faiVerso();
		vacca.saluto();
		
		Animale gatto = new Gatto();
		gatto.setNome("Tekila");
		gatto.faiVerso();
		gatto.saluto();
		
		Gatto g2 = new Gatto();
		g2.setNome("Fuffi");
		g2.faiVerso();
		g2.saluto();
		g2.salutoDaGatti();
	}
}
