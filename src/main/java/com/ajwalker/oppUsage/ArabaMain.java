package com.ajwalker.oppUsage;

public class ArabaMain {
	public static void main(String[] args) {
		//Method üretildi.
		new Araba();
		//Ulaşabilmek için referanslarını tutacak değişkenlere atamak gereklidir.
		//Constructor methodlar geriye değer dönme ile ilgili bir tanımlama içermez.
		//Ancak geriye oluşturulan nesnenin bellek adresini dönerler.
		Araba araba1 = new Araba();
		araba1.marka = "Audi";
		araba1.model = "A3";
		araba1.yil = "2020";
		araba1.km = 10_000;
		araba1.hiz = 0;
		
		Araba araba2 = new Araba();
		araba2.marka = "Toyota";
		araba2.model = "Corolla";
		araba2.yil = "2022";
		araba2.km = 18_000;
		araba2.hiz = 50;
		
		System.out.println(araba1.toString());
		System.out.println(araba2.toString());
	}
}