package com.ajwalker.week05.okul;

public class RunnerOkul {
	public static void main(String[] args) {
		Ogrenci ogr1 = new Ogrenci("Ahmet", 100, 1,"Ak");
		Ogrenci ogr2 = new Ogrenci("Selin", 98, 2,"Kar");
		Ogrenci ogr3 = new Ogrenci("Gizem", 95, 12,"Can");
		Ogrenci ogr4 = new Ogrenci("Tarık", 75, 3,"Yen");
		
		Sinif sinif1 = new Sinif("1. kat 101 nolu derslik", "1A");
		Sinif sinif2 = new Sinif("2. kat 201 nolu derslik", "2A");
		
		
		sinif1.ogrenciEkle(ogr1);
		sinif1.ogrenciEkle(ogr2);
		sinif1.ogrenciEkle(ogr3);
		sinif1.ogrenciEkle(ogr4);
		
		sinif1.listOgrenci();
		
		sinif2.ogrenciEkle(ogr1);
		sinif2.ogrenciEkle(ogr2);
		sinif2.ogrenciEkle(ogr3);
		sinif2.ogrenciEkle(ogr4);
		
		sinif2.listOgrenci();
		
		Okul okul1 = new Okul("Gazi İlkokulu","Ankara");
		
		okul1.sinifEkle(sinif1);
		okul1.sinifEkle(sinif2);
		
		okul1.siniflariListele();
		okul1.okulOgrenciListele();
	}
}