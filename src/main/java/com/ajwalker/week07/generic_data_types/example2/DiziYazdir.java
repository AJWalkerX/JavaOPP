package com.ajwalker.week07.generic_data_types.example2;
//Generic Sınıf
public class DiziYazdir <T>{
	public void yazdir(T[] dizi){
		for (T t : dizi) {
			System.out.println(t);
		}
	}
}