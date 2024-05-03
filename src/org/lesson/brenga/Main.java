package org.lesson.brenga;

public class Main {
	public static void main(String[] args) {
		InitRettangolo init = new InitRettangolo();
		
		Rettangolo rettangolo = init.init();
		System.out.println("l'area del rettangolo calcolato è:  "+rettangolo.area());
		System.out.println("il perimetro del rettangolo calcolato è:  "+rettangolo.perimetro());
		rettangolo.disegna();
		
	}
}
