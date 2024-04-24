package it.prove;

public class Auto {
	public String colore;
	public String marca;
	public int anno;
	public long kmPercorsi;

	public Auto() {
	}
	
	public Auto(String colore, String marca, int anno) {
		this(marca, anno);
		this.colore = colore;
		kmPercorsi = 0;
	}

	public Auto(String colore, String marca, int anno, long km) {
		this(colore, marca, anno);
		this.kmPercorsi = km;
	}

	public Auto(long kmPercorsi, String marca, int anno) {
		this.marca = marca;
		this.anno = anno;
		this.kmPercorsi = kmPercorsi;
	}

	public Auto(String marca, int anno) {
		this.marca = marca;
		this.anno = anno;
		kmPercorsi = 0;
	}

	public void cambiaColore(String nuovoColore) {
		this.colore = nuovoColore;
	}

	public String getMarca() {
		return "La marca è " + this.marca;
	}

	public long aggiungiKm(long km) {
		this.kmPercorsi += km;
		return this.kmPercorsi;
	}

	public void parti() {
		System.out.println("Accensione in corso...");
		System.out.println(
				"L'auto con marca " + this.marca + " e colore " + this.colore + " e anno " + this.anno + " è accesa.");
	}
}
