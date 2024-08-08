package com.ajwalker.week07.generic_data_types.example3;

import java.util.Collections;
import java.util.List;

public class Sirala {
	public static  <T extends Comparable<T>> void sirala(List<T> liste){
		Collections.sort(liste);
		liste.forEach(System.out::println);
	}
}