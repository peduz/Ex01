package org.lessons.inheritance;

/**
 * Creare la struttura delle classi per l’architettura 
 * di una piattaforma di streaming tipo Netflix, 
 * che permette di riprodurre diversi contenuti: 
 * - Film 
 * - Serie 
 * - Documentari, ecc. 
 * 
 * La classe Contenuto contiene gli attributi e i metodi base 
 * di ogni contenuto, mentre i contenuti più specifici 
 * ereditano dalla classe Contenuto e aggiungono 
 * i propri attributi e metodi.
 */
public class Platform {

	public static void main(String[] args) {
//		Contenuto c = new Contenuto("Squid games", 360);
//		c.riproduci();
//		System.out.println("Info sul contenuto \n" + c.toString());
//		
//		
//		Documentario d = new Documentario("Trattori", "Regista");
//		d.riproduci();
//		System.out.println("Info sul documentario \n" + d.toString());
//		
//		
//		Serie s = new Serie("One piece", 45, 20);
//		s.riproduci();
//		System.out.println("Info sulla serie \n" + s.toString());
		
		
		DocumentarioAnimali docAnim = 
				new DocumentarioAnimali("I leoni", 56, "Regista");
		docAnim.setTipoAnimali("leoni");
		
		docAnim.riproduci();
		
		System.out.println("Info sui doc animali: \n" +docAnim.toString() );
	}
}
