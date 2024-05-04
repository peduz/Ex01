package it.prove;

public class Main {

	public static void main(String[] args) {
		Rettangolo r = new Rettangolo(10, 20);
		
		System.out.println("Base: " + r.base + "\nAltezza: " + r.altezza);
		
		int area = r.calcolaArea();
		System.out.println("Area: " + area);
		
		int perimetro = r.calcolaPerimetro();
		System.out.println("Perimetro: " + perimetro);
		
		r.disegna();
//		System.out.println(r.disegna());
	}
}
