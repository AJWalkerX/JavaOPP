package com.ajwalker.week06.nested_siniflar;

public class Runner {
	public static void main(String[] args) {
		Uni uni1 = new Uni("BilgeAdam");
		Uni.Ogrenci ogrenci1 = uni1.new Ogrenci("Selin",101);
		Uni.Ogrenci ogrenci2 = uni1.new Ogrenci("Sami",102);
	}
}