package org.lessons.polimorfismo;

public class Mammifero {

	private int numeroZampe;
	
	private CaratteristichePelo caratteristichePelo;
	
	private String dieta;
	
	private boolean castrato;
	
	private double velocita;
	
	private String habitat;
	
	private boolean domestico;
	
	private String riproduzione;
	
	private int etaMassima;
	
	private String verso;
	
	private String razza;
	
	private String sesso;
	
	private String capacitaRaggiungereGazzella;
	
	private DimensioniMammifero dimensioni;
	
	public Mammifero() {
		this.numeroZampe = 4;
		this.dieta = "carnivoro";
		this.castrato = false;
		this.capacitaRaggiungereGazzella = "nulla";
		this.riproduzione = "mammifero";
	}
	
	public void vivo() {
		System.out.println("Vivo in " + habitat);
	}
	
	public void schedaDimensioni() {
		System.out.println("Le mie dimensioni: " + dimensioni);
	}
	
	public void faiVerso() {
		System.out.println("Il mio verso è " + verso);
	}
	
	public void corri() {
		System.out.println("La mia velocità massima è di " + velocita);
	}

	public void mangia() {
		System.out.println("Sono un " + dieta);
	}
 	
	//===========================================
	//========== GETTER AND SETTER ==============
	//===========================================
	public int getNumeroZampe() {
		return this.numeroZampe;
	}
	public void setNumeroZampe(int numeroZampeInput) {
		this.numeroZampe = numeroZampeInput;
	}
	
	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public boolean isCastrato() {
		return castrato;
	}

	public void setCastrato(boolean castrato) {
		this.castrato = castrato;
	}

	public double getVelocita() {
		return velocita;
	}

	public void setVelocita(double velocita) {
		this.velocita = velocita;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}

	public String getRiproduzione() {
		return riproduzione;
	}

	public void setRiproduzione(String riproduzione) {
		this.riproduzione = riproduzione;
	}

	public int getEtaMassima() {
		return etaMassima;
	}

	public void setEtaMassima(int etaMassima) {
		this.etaMassima = etaMassima;
	}

	public DimensioniMammifero getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(DimensioniMammifero dimensioni) {
		this.dimensioni = dimensioni;
	}

	public String getVerso() {
		return verso;
	}

	public void setVerso(String verso) {
		this.verso = verso;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getCapacitaRaggiungereGazzella() {
		return capacitaRaggiungereGazzella;
	}

	public void setCapacitaRaggiungereGazzella(String capacitaRaggiungereGazzella) {
		this.capacitaRaggiungereGazzella = capacitaRaggiungereGazzella;
	}

	public CaratteristichePelo getCaratteristichePelo() {
		return caratteristichePelo;
	}

	public void setCaratteristichePelo(CaratteristichePelo caratteristichePelo) {
		this.caratteristichePelo = caratteristichePelo;
	}

	@Override
	public String toString() {
		return " numeroZampe=" + numeroZampe + 
				", caratteristichePelo=" + caratteristichePelo +
				", dieta=" + dieta + ", castrato=" + castrato + 
				", velocita=" + velocita + ", habitat=" + habitat + 
				", domestico=" + domestico + ", riproduzione=" + riproduzione + 
				", etaMassima=" + etaMassima + ", verso=" + verso
				+ ", razza=" + razza + ", sesso=" + sesso + 
				", capacitaRaggiungereGazzella="
				+ capacitaRaggiungereGazzella + ", dimensioni=" + dimensioni;
	}
	
}

