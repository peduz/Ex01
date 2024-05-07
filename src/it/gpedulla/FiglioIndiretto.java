package it.gpedulla;

import it.gpedulla.example.Padre;

public class FiglioIndiretto extends Padre {

	protected String attributoFiglio;
	
	public static void main(String[] args) {
		FiglioIndiretto f = new FiglioIndiretto();
		System.out.println(f.toString());
	}
}
