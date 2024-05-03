package org.lesson.brenga;

public class Rettangolo {//in questo esercizio ho solo modificato la 
	//visibilità delle variabili in moda da poterci accedere per incapsulamento
	private int base;
	private int altezza;

	protected Rettangolo(int b, int h) {
		 this.base = b;
		 this.altezza = h;
	}

	public int area() {
		int area = this.base * this.altezza;
		return area;
	}

	public int perimetro() {
		int perimetro = (2 * this.base) + (2 * this.altezza);
		return perimetro;
	}

	public void disegna() {
		for (int i = 1; i <= this.altezza; i++) {

			for (int y = 1; y <= this.base; y++) {

				if (i == 1 || i == this.altezza) {
					System.out.print("0 ");

				} else if (y == 1 || y == this.base) {
					System.out.print("0 ");

				} else {
					System.out.print("  ");

				}

				if (y == this.base) {
					System.out.print("\n");
				}

			}

		}
	}
}