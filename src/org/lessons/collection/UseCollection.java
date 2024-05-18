package org.lessons.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.lessons.abstraction.Gatto;

public class UseCollection {

	public static void main(String[] args) {
//		listaStringhe();
//		listaInteri();
//		listaGatti();
		
		Object[] arr1 = {"Ciao", 12, new Gatto("micio")};
		
		List<Object> listObj = new ArrayList<>();
		
		listObj.add("Ciao");
		listObj.add(12);
		listObj.add(new Gatto("Micio"));
		
		System.out.println(listObj);
	}

	private static void listaGatti() {
		List<Gatto> gattiList = new ArrayList<>();
		Gatto g1 = new Gatto();
		g1.setNome("Fuffi");
		Gatto g2 = new Gatto();
		g2.setNome("Pippo");
		Gatto g3 = new Gatto();
		g3.setNome("Flaffi");
		
		gattiList.add(g2);
		gattiList.add(new Gatto("meow"));
		gattiList.add(g1);
		gattiList.add(g3);
		
		System.out.println("Lista non ordinata " + gattiList);
		
		Collections.sort(gattiList);
		
		System.out.println("Lista ordinata " + gattiList);
		
	}

	private static void listaInteri() {
		int [] arrInt = {1, 2, 3, 4, 5, 6};
		
		List<Integer> listaInteri = new ArrayList<>();
		listaInteri.add(1);
		
		List<Integer> listDaAggiungere =
				Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> list2 = 
				Arrays.asList(11, 12, 13, 14);
		
		
		listaInteri.addAll(listDaAggiungere);
		listaInteri.addAll(list2);
		System.out.println(listaInteri.size());
		
		Collections.shuffle(listaInteri);
		System.out.println("Lista incasinata " + listaInteri);
		
		Collections.sort(listaInteri);
		System.out.println("Lista ordinata " + listaInteri );
	}

	private static void listaStringhe() {
		List<String> listString = new ArrayList<>(1);
		
		listString.add("a");
		listString.add("b");
		listString.add("c");
		listString.add("a");
		listString.add("200");
		listString.add("1000");
		
		System.out.println("Stampo la lista " + listString);
		
		listString.set(0, "z");
		listString.add("s");
		
		System.out.println("Stampo la lista " + listString);
		
		listString.remove(0);
		
		boolean removeS = listString.remove("s");
		
		boolean removeK = listString.remove("k");
		
		System.out.println("Remove s: " + removeS);
		System.out.println("Remove k: " + removeK);
		
		System.out.println("Stampo la lista " + listString);
		
		
		System.out.println("Stampo l'elemento " + listString.get(3));
		
		Collections.sort(listString);
		
		System.out.println("Stampa della lista ordinata: " + listString);
	}
	
}
