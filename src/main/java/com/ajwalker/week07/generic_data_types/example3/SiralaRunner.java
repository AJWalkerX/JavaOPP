package com.ajwalker.week07.generic_data_types.example3;

import com.ajwalker.week07.generic_data_types.example2.Kopek;

import java.util.ArrayList;
import java.util.List;

public class SiralaRunner {
	
	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<>();
		liste.add(1);
		liste.add(20);
		liste.add(12);
		liste.add(14);
		Sirala.sirala(liste);
		
		List<String> listeString = new ArrayList<>();
		listeString.add("Bursa");
		listeString.add("Ankara");
		listeString.add("Sinop");
		listeString.add("Mardin");
		Sirala.sirala(listeString);
		
		List<Kopek> kopeks = new ArrayList<>();
		kopeks.add(new Kopek("Karabas",10,5));
		kopeks.add(new Kopek("Z",10,5));
		kopeks.add(new Kopek("S",10,5));
//		Sirala.sirala(kopeks); // Comparable interface'i imlimente olmadığı için hata verir.
	}
}