package org.lesson.jsnack.oop;

/** 
 * Scrivi una classe Studente con i seguenti attributi:
 * nome, cognome, età. 
 * Implementa un costruttore che accetta tre parametri per 
 * inizializzare questi attributi. 
 * Aggiungi un metodo che restituisca una stringa concatenata dei valori 
 * (es. *Anselmo Bitta, 24 anni*).
 * 
 */
public class Studente {

	private String name;
	
	private String surname;
	
	private int age;
	
	public final String VIVO = "VIVO";
	
	public static String nazione = "Italia";
	
	public Studente(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String studenteStringified() {
		return name + " " + surname + ", " + age + " anni";
	}
	
	
	public boolean isStudenteOk() {
		if(this.name != null && this.name != "" && this.surname != null && this.surname != "") {
			return true;
 		} else {
 			return false;
 		}
//		return this.name == null ? false :
//			this.name == "" ? false :
//				this.surname == null ? false :
//					this.surname == "" ? false :
//						true;
	}
}
