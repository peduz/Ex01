package org.lessons.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UseMap {

	public static void main(String[] args) {
//		mappaStringInteger();	
//		listaInteri();
		
		Boolean bool = null;
		bool = false;
		bool = true;
		
		boolean bool2 = true;
		bool2 = false;
		
		boolean b = bool;
		
		Boolean b2 = bool2;
		
		int a = 10;
		Integer a2 = a;
		
		List<Integer> box = new ArrayList<>();
		box.add(a2);
		box.add(a);
		
		double d = 10.2;
		Double d2 = d;
		
	}

	private static void listaInteri() {
		List<Integer> listaInteri = new ArrayList<>();
		listaInteri.add(1);
		listaInteri.add(2);
		listaInteri.add(3);
		listaInteri.add(4);
		listaInteri.add(5);
		listaInteri.add(6);
		
		for(int i = 0; i < listaInteri.size(); i++) {
			System.out.println(
					"Indice: " + i +
					", valore: " + listaInteri.get(i));
		}
		
		for(Integer intero : listaInteri) {
			System.out.println(intero);
		}
		
		for(int i = listaInteri.size() - 1; i >= 0; i --) {
			System.out.println(
					"Indice: " + i +
					", valore: " + listaInteri.get(i));
		}
		
		
		List<String> listaStringhe = new ArrayList<>();
		listaStringhe.add("Uno");
		listaStringhe.add("Due");
		listaStringhe.add("Tre");
		
		for(int i = 0; i < listaStringhe.size(); i++) {
			System.out.println(
					"Indice: " + i +
					", valore: " + listaStringhe.get(i));
		}
		
		for(String stringa : listaStringhe) {
			System.out.println(stringa);
		}
	}

	private static void mappaStringInteger() {
		Map<String, Integer> mappa = new HashMap<>();
		
		mappa.put("due", 2);
		mappa.put("uno", 1);
		mappa.put("dieci", 10);
		mappa.put("meno uno", -1);
		
		mappa.put("due", -2);
		mappa.put("DUE", -2);
		mappa.put("meno DUE", -2);
		
		Set<String> chiavi = mappa.keySet();
		
		
		mappa.get("due");
		System.out.println(mappa.get("due"));
		System.out.println(mappa.get("DUE"));
		System.out.println(mappa.get("meno DUE"));
		
		Map<String, Integer> mappa2 = new HashMap<>();
		mappa2.put("primo", getList().get(0));
		mappa2.put("secondo", getList().get(1));
		//...
		
		for(String chiave: mappa.keySet()) {
			System.out.println("Chiave " + chiave +
					" valore " + mappa.get(chiave));
		}

		Collection<Integer> valori = mappa.values();
		
		for (Iterator<Integer> iterator = valori.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			System.out.println("valore " + integer);
		}
		
		for(Map.Entry<String, Integer> item : mappa.entrySet()) {
			System.out.println("chiave " + item.getKey() + " valore " + item.getValue());
		}
	}
	
	private static List<Integer> getList() {
		List<Integer> result = new ArrayList<>();
		result.add(1);
		result.add(2);
		return result;
	}
}
