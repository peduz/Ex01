package org.lesson.jsnack.oop;

/**
 * Crea una classe ContoBancario con attributi per 
 * numero di conto e saldo. 
 * Implementa un costruttore che accetta 
 * il numero di conto e inizializza il saldo a zero. 
 * Aggiungi metodi pubblici per 
 * - depositare denaro sul conto	V
 * - prelevare denaro dal conto		V
 * - ottenere il saldo corrente		V
 */ 
public class ContoBancario {
	
	private String iban;
	
	private double saldo;
	
	public ContoBancario(String iban) {
		this.iban = iban;
		this.saldo = 0;
	}
	
	public double aggiungiDenaro(double denaro) {
		if(denaro >= 0) {
			double denaroAggiunto = this.saldo + denaro;
			this.saldo = denaroAggiunto;
//		this.saldo += denaro;
		}
		
		return this.saldo;
	}
	
	public double sottraiDenaro(double denaro) {
		if(denaro >= 0) {
			double denaroSottratto = this.saldo - denaro;
			this.saldo = denaroSottratto;
		}
		
		return this.saldo;
	}
	
	/**
	 * @return il saldo
	 */
	public double getSaldo() {
		return this.saldo;
	}
}
