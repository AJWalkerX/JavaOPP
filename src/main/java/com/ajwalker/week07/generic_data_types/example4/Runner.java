package com.ajwalker.week07.generic_data_types.example4;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List liste = new ArrayList<>();
		liste.add("Hello");
		liste.add(123);
		System.out.println(liste);
		String o = (String) liste.get(0);
		System.out.println(o);
	}
}