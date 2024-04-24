package it.gpedulla;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {

		// creare e inizializzare l’array contenente i nomi degli invitati
		// chiedere all’utente come si chiama e verificare che il nome sia presente
		// nella lista;
		// lasciarlo entrare o rispedirlo cortesemente da dove è venuto
		// Lista invitati: Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco
		// Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel
		// Zeilic

		// dichiaro un array stringa e lo inizializzo

		String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		System.out.println(invitati);
		// System.out.println(Arrays.toString(invitati));

		// metodo Scanner permette di prendere un input dalla tastiera
		Scanner input = new Scanner(System.in);
		// apre il field per inserimento dati utente
		System.out.println("Ciao e benvenuto alla festa Ferragnez!");
		System.out.println("Inserisci il tuo nome e cognome");

		// attribuisce alla variabile nome l'input inserito dall'utente
		String nomeGuest = input.nextLine();

		// se il nome inserito è tra i partecipanti il guest è true

		boolean trovato = false;

//		for (int i = 0; i < invitati.length; i++) {
//
//			String currentName = invitati[i];
//			if(nomeGuest.equals(invitati[i])) {
//				trovato = true;
//				break;
//			}
//		}
		int i = 0;
		while(!trovato && i < invitati.length) {
			String currentName = invitati[i];
			if(nomeGuest.equals(currentName)) {
				trovato = true;
//				break;
			}
			System.out.println("iterazione numero " + i);
			i++;
		}
		
		if (trovato) {

			System.out.println("Benvenuto! Puoi accedere");
		}

		else {

			System.out.println("Spiacente non sei tra i partecipanti! Non puoi entrare");

		}

		/*
		 * switch (invitati) { case 1: System.out.println("Benvenuto! Puoi accedere");
		 * break default:
		 * System.out.println("Spiacente non sei tra i partecipanti! Non puoi entrare");
		 * }
		 */

	}

}
