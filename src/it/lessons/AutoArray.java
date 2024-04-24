package it.lessons;

import java.util.Scanner;

import it.prove.Auto;

public class AutoArray {
	
	public static void main(String[] args) {
		Auto [] autoArr = new Auto[3];
		Scanner scan = new Scanner(System.in);
		
		//...
		String marca1 = scan.nextLine();
		int anno1 = scan.nextInt();
		Auto auto1 = new Auto(marca1, anno1);
		Auto auto2 = new Auto("nero", "Ford", 2021);
		Auto auto3 = new Auto(120, "BMW", 2024);
		
		autoArr[0] = auto1;
		autoArr[1] = auto2;
		autoArr[2] = auto3;
	}
}
