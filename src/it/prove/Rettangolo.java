package it.prove;

/*
 * 1. Creare una classe Rettangolo con due attributi interi: base e altezza. 
 * 	Aggiungere un opportuno costruttore con parametri. 
 * 	Aggiungere due metodi: calcolaArea e calcolaPerimetro 
 * che calcolano e restituiscono, rispettivamente, 
 * l’area e il perimetro del rettangolo.
	2. Creare una classe Main contenente il metodo main(), 
		nel quale chiedete all’utente di inserire, da console, 
		i valori di base e di altezza con cui istanziare un nuovo Rettangolo. 
		Dopo averlo istanziato, stampate a video il perimetro e l’area.
BONUS Aggiungere alla classe Rettangolo un metodo disegna che disegna 
in console il rettangolo con le sue dimensioni, come nell’immagine allegata
 */
public class Rettangolo {

	int base;

	int altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public int calcolaPerimetro() {
		return 2 * (base + altezza);
	}

	public int calcolaArea() {
		return base * altezza;
	}
	
	
//	public String disegna() {
//		String basePainted = "";
//		String altezzaPainted = "";
//		
//		//Disegno la base
//		for(int i = 0; i < base; i++) {
//			basePainted += "o ";
//		}
//		
//		//Disegno l'altezza
//		for(int i = 0; i < altezza-2; i++) {
//			String spaceCalcolator = "";
//			// Calcolo lo spazio da inserire fra le due righe di altezza
//			for(int j = 1; j < basePainted.length()-2; j++) {
//				spaceCalcolator += " ";
//			}
//			altezzaPainted += "o" + spaceCalcolator + "o\n";
//		}
//		// restituisco il disegno sottoforma di stringa
//		return basePainted + "\n" + altezzaPainted + basePainted;
//	}
	
	public void disegna() {
		for(int i = 0; i < altezza; i++) {
			System.out.print("0");
			for(int j = 1; j < base - 1; j++) {
				if(i == 0 || i == altezza - 1) {					
					System.out.print("O");
				} else {
					System.out.print(" ");					
				}
				
			}
			System.out.println("0");
		}
	}
	
}
