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
public class RegistroStudenti {

	private Studente [] studenti;
	
	private int posizioneArray = 0;
	
	public RegistroStudenti() {
		this.studenti = new Studente[3];
	}
	
	public void aggiungiStudente(Studente input) {
		if(posizioneArray < studenti.length) {
			studenti[posizioneArray] = input;
			Studente.nazione = "Francia";
			posizioneArray++;
		} 
	}
	
	public static void saluta() {
		System.out.println("Ciao ");
	}
 	
	public void stampaRegistro() {
		for(int i = 0; i < studenti.length; i++) {
			System.out.println(
					studenti[i].studenteStringified() + 
					", " + 
					studenti[i].VIVO +
					", " +
					Studente.nazione);
		}
	}
}
