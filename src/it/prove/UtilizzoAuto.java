package it.prove;

import java.util.Scanner;

public class UtilizzoAuto {
	public static void main(String[] args) {
		inizializzaAuto1();
		inizializzaAuto2();
	}
	
	
	public static void inizializzaAuto1() {
		Auto auto1 = new Auto();
//		auto1.marca = "Toyota";
//		auto1.colore = "bianco";
//		auto1.anno = 2018;
		
		auto1.parti();
	}
	
	public static void inizializzaAuto2() {
		Auto auto2 = new Auto();
//		auto2.marca = "Audi";
//		auto2.colore = "nero";
//		auto2.anno = 2020;
		System.out.println("Prima del cambio");
		auto2.parti();
		Scanner scan = new Scanner(System.in);
		System.out.println("Imposta il colore da cambiare");
		String a = scan.nextLine();
		auto2.cambiaColore(a);
		System.out.println("Dopo del cambio");
		auto2.parti();
	}
}
