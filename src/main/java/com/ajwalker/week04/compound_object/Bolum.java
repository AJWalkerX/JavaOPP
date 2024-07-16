package com.ajwalker.week04.compound_object;

public class Bolum {
	String kod;
	String ad;
	
	Hoca bolumBaskani;
	Ders[] dersler;
	Ogrenci[] ogrenciler;
	
	public Bolum(String ad, String kod){
		this.ad=ad;
		this.kod = kod;
		
		dersler = new Ders[50];
		ogrenciler = new Ogrenci[200];
	}
}