package it.lessons;

import it.prove.Auto;

public class Ex01 {
	public static void main(String[] args) {
		Auto auto = new Auto("Audi", 2010);
		
		auto.parti();
		
		auto.cambiaColore("bianco");
		
		auto.parti();
		
		Auto auto2 = new Auto("bianco", "Ford", 2020);
		
		auto2.parti();
		
		auto.anno = 2010;
		auto.marca = "Volkswagen";
		auto.colore = "grigio";
		
		System.out.println(auto.colore);
		
		auto.cambiaColore("bianco");
		
		System.out.println(auto.colore);
		
		System.out.println(auto.marca);
		
		String pippo = auto.getMarca();
//		System.out.println(pippo.toUpperCase());
//		System.out.println(auto.getMarca());
//		System.out.println(auto.marca.toUpperCase());
//		System.out.println(auto.marca);
		long kmPercorsi = auto.aggiungiKm(200000);
		System.out.println(kmPercorsi);
		
//		System.xout.print();
//		auto.cambiaColore();
		
//		long area = calcolaAreaRettangolo();
//		System.out.println(area);
		
	}

	
//	public static long calcolaAreaRettangolo() {
//		Scanner scan = new Scanner(System.in);
//		long base = scan.nextLong();
//		long altezza = scan.nextLong();
//		return base*altezza;
//	}
}
