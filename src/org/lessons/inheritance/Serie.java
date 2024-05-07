package org.lessons.inheritance;

public class Serie extends Contenuto {

	private int numeroEpisodi;
	
	public Serie(String titoloSerie, double durataSerie, 
			int numeroEpisodiSerie) {
		super(titoloSerie, durataSerie);
		this.numeroEpisodi = numeroEpisodiSerie;
	}
	
	public String toString() {
		return super.toString() + " numeroEpisodi " + numeroEpisodi;
	}
}
