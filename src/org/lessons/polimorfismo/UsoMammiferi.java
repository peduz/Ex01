package org.lessons.polimorfismo;

import java.util.Scanner;

public class UsoMammiferi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Che mammifero hai di fronte?\n"
				+ "Scegliere tra :\n"
				+ "- tigre\n"
				+ "- ornitorinco\n"
				+ "- gatto");
		
		String tipoMammifero = input.nextLine();
		
		Mammifero m = null;
		
		switch(tipoMammifero) {
			case "tigre":
				m = new Tigre();
				m.setHabitat("foresta");
				m.setVerso("ROAR");
				break;
			case "ornitorinco":
				m = new Ornitorinco();
				break;
			case "gatto":
				m = new Gatto();
				m.setHabitat("domestico");
				m.setVerso("Miao");
				break;
			default:
				System.out.println("Inserimento non corretto");
				
		}
		
		if(m != null) {
			m.vivo();
			m.faiVerso();
			System.out.println(m);
		}
		
	}
	
	
	private static void tests() {
		Mammifero m1 = new Mammifero();
		m1.setVerso("verso");
		m1.setHabitat("generico");

		System.out.println("=========================");
		System.out.println(" STAMPO IL MAMMIFERO ");
		System.out.println("=========================");
		m1.vivo();
		m1.faiVerso();
		System.out.println(m1);

		System.out.println("\n=========================");
		System.out.println(" STAMPO LA TIGRE ");
		System.out.println("=========================");
		
		Mammifero tigre = new Tigre();
		tigre.setHabitat("foresta");
		tigre.setVerso("ROAR!!");
		
		tigre.vivo();
		tigre.faiVerso();
		System.out.println(tigre);

		System.out.println("\n=========================");
		System.out.println(" STAMPO L'ORNITORINCO ");
		System.out.println("=========================");
		
		Mammifero ornitorinco = new Ornitorinco();
		
		ornitorinco.vivo();
		ornitorinco.faiVerso();
		System.out.println(ornitorinco);
	}
}
