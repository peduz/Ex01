package it.prove;

public class Auto {
	private String colore;
	private String marca;
	private int anno;
	private long kmPercorsi;

	public Auto() {
		this.colore	= "blu elettrico";
		this.marca	= "prius";
		this.anno	= 2024;
		this.kmPercorsi = 0;
	}
	
	public Auto(String colore, String marca) {
		this.marca = marca;
		this.colore = colore;
		this.anno = setAnno();
		kmPercorsi = 0;
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
		if(anno != 0) {			
			this.anno = anno;
		} else {
			this.anno = setAnno();
		}
		this.kmPercorsi = kmPercorsi;
	}

	public Auto(String marca, int anno) {
		this.marca = marca;
		this.anno = anno;
		kmPercorsi = 0;
	}

	public void cambiaColore(String nuovoColore) {
		if(nuovoColore != null) {
			this.colore = nuovoColore;
		}
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	private int setAnno() {
		return 2024;
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
