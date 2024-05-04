package org.lessons.calcolatrice;

/**
 * Nel progetto java.calcolatrice, nel package 
 * org.lessons.java.utils, creare una classe di helper CalcoliHelper.
Come visto a lezione, strutturare la classe in modo che non 
possa essere istanziata e che presenti i seguenti metodi static:
- Somma di due numeri interi
- Somma di due numeri double
- Differenza tra due numeri interi
- Differenza tra due numeri double
- Moltiplicazione di due numeri interi
- Moltiplicazione di due numeri double
- Valore assoluto di un numero intero
- Valore assoluto di un numero double
- Minimo tra due numeri interi
- Minimo tra due numeri double
- Massimo tra due numeri interi
- Massimo tra due numeri double
 */
public class CalcoliHelper {

	public static void allOperazioni(int a, int b) {
		System.out.println("La somma è " + sum(a, b));
		System.out.println("Il prodotto è " + multiply(a, b));
		System.out.println("La differenza è " + diff(a, b)); 

		System.out.println("Il minimo tra i due è: " + min(a, b)); 
		System.out.println("Il massimo tra i due è: " + max(a, b)); 
	}
	
	public static void allOperazioni(double a, double b) {
		System.out.println("La somma è " + sum(a, b));
		System.out.println("Il prodotto è " + multiply(a, b));
		System.out.println("La differenza è " + diff(a, b)); 
		
		System.out.println("Il minimo tra i due è: " + min(a, b)); 
		System.out.println("Il massimo tra i due è: " + max(a, b)); 
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	public static int diff(int a, int b) {
		return a - b;
	}
	
	public static double diff(double a, double b) {
		return a - b;
	}
	
	public static long multiply(int a, int b) {
		return a * b;
	}
	
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static int abs(int a) {
		if(a >= 0) {
			return a;
		} else {
			return -a;
		}
	}
	
	public static double abs(double a) {
		if(a >= 0) {
			return a;
		} else {
			return -a;
		}
	}
	
	public static int min(int a, int b) {
//		if(a < b) {
//			return a;
//		} else {			
//			return b;
//		}
		return a < b ? a : b;
	}
	
	public static double min(double a, double b) {
		if(a < b) {
			return a;
		} else {			
			return b;
		}
	}
	
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		} else {			
			return b;
		}
	}
	
	public static double max(double a, double b) {
		if(a > b) {
			return a;
		} else {			
			return b;
		}
	}
	
}
