package org.lesson.jsnack.oop;

/**
 * Crea una classe RegistroStudenti che rappresenti 
 * un registro di studenti. Utilizza un array privato 
 * per memorizzare oggetti Studente. 
 * Implementa un costruttore senza parametri per 
 * inizializzare il registro vuoto e 
 * un metodo pubblico per aggiungere studenti al registro. 
 * 
 * Aggiungi un metodo che stampi la lista degli studenti.
 */
public class JSnack3 {

	public static void main(String[] args) {
		RegistroStudenti registro = new RegistroStudenti();
		registro.aggiungiStudente(new Studente("Giuseppe", "Pedullà", 33));
		registro.aggiungiStudente(new Studente("Alessandro", "Leanza", 32));
		registro.aggiungiStudente(new Studente("Gabriele", "Tosto", 23));
		registro.aggiungiStudente(new Studente("Eleonora", "Mercado", 33));
		
		RegistroStudenti.saluta();
		
		System.out.println("Stampo il registro prima della modifica della variabile statica");
		
		registro.stampaRegistro();
		
		Studente s1 = new Studente("Pippo", "Baudo", 100);
		s1.nazione = "Germania";
		System.out.println("Stampo il registro DOPO la modifica della variabile statica");
		registro.stampaRegistro();
	}
}
