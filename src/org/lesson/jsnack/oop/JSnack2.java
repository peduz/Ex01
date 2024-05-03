package org.lesson.jsnack.oop;

/**
 * Crea una classe ContoBancario con attributi per 
 * numero di conto e saldo. 
 * Implementa un costruttore che accetta 
 * il numero di conto e inizializza il saldo a zero. 
 * Aggiungi metodi pubblici per depositare denaro sul conto, 
 * prelevare denaro dal conto e ottenere il saldo corrente.
 */
public class JSnack2 {

	public static void main(String[] args) {
		ContoBancario input = new ContoBancario("IT 02340293423094i");
		
		input.aggiungiDenaro(1000);
		
		System.out.println("Il tuo saldo è " + input.getSaldo());
		
		input.sottraiDenaro(500);
		
		System.out.println("Il tuo saldo è: " + input.getSaldo());
		
		input.aggiungiDenaro(200);
		
		System.out.println("Il tuo saldo è " + input.getSaldo());
		
		input.sottraiDenaro(100);
		
		System.out.println("Il tuo saldo è " + input.getSaldo());
		
	}
}
