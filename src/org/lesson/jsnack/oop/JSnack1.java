package org.lesson.jsnack.oop;

import java.util.Scanner;

/** 
 * Scrivi una classe Studente con i seguenti attributi:
 * nome, cognome, età. 
 * Implementa un costruttore che accetta tre parametri per 
 * inizializzare questi attributi. 
 * Aggiungi un metodo che restituisca una stringa concatenata dei valori 
 * (es. *Anselmo Bitta, 24 anni*).
 * 
 */
public class JSnack1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome: ");
		String name = input.nextLine();
		System.out.println("Inserisci il tuo cognome: ");
		String surname = input.nextLine();
		System.out.println("Inserisci la tua età: ");
		int age = input.nextInt();
		
		Studente datiUtente = new Studente(name, surname, age);
		
		System.out.println(datiUtente.studenteStringified());
	}
	
}
