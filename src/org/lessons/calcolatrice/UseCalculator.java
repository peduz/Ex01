package org.lessons.calcolatrice;

import java.util.Scanner;

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


BONUS:
Aggiungete il metodo per l’elevamento a potenza che prende come parametri due numeri interi (base ed esponente) e ritorna la base elevata all’esponente. Occhio che sia la base che l’esponente potrebbero essere uguali a zero oppure numeri negativi!
(caso esponente = 0 e base = 0 anche se in matematica sarebbe un numero indefinito usiamo l’approccio informatico che lo calcola come 1)
Buon lavoro!
 */
public class UseCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Inserisci due numeri per fare le operazioni");
//		int a = input.nextInt();
//		int b = input.nextInt();
//		
//		System.out.println("Coi numeri interi: ");
//		CalcoliHelper.allOperazioni(a, b);

		System.out.println("Inserisci due numeri per fare le operazioni");
		double x = input.nextDouble();
		double y  = input.nextDouble();
		
		System.out.println("Coi numeri decimali: ");
		CalcoliHelper.allOperazioni(x, y);
		
	}
	
}
