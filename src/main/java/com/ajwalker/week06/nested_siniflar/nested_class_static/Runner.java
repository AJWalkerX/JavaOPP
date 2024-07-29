package com.ajwalker.week06.nested_siniflar.nested_class_static;

public class Runner {
	public static void main(String[] args) {
//		Kitaplik kitaplik = new Kitaplik("BilgeAdam");
		
		Kitaplik.Kitap kitap1 = new Kitaplik.Kitap("A kitabı", 50);
		Kitaplik.Kitap kitap2 = new Kitaplik.Kitap("B kitabı", 150);
		System.out.println(kitap1);
		System.out.println(kitap2);
		
		for (Kitaplik.Kitap item : Kitaplik.getKitapArrayList()){
			System.out.println(item);
		}
	}
}