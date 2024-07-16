package com.ajwalker.week04.compound_object;

public class Ders {
	String kod;
	String ad;
	int kredi;
	
	Hoca hoca;
	Bolum bolum;
	Ogrenci[] ogrenciler;
	
	public Ders(String kod, String ad, int kredi) {
		this.kod = kod;
		this.ad = ad;
		this.kredi = kredi;
		
		ogrenciler = new Ogrenci[20];
	}
}