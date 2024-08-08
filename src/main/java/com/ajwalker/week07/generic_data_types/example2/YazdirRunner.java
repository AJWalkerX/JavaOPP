package com.ajwalker.week07.generic_data_types.example2;

import java.util.List;

public class YazdirRunner {
	public static void main(String[] args) {
		Integer[] sayilar = {10,20,30,40};
		String[] kelimeler = {"loren", "ipsun", "dolr", "sit", "amet"};
		IntegerYazdir iy = new IntegerYazdir();
		iy.yazdir(sayilar);
		//!Hatalı
		//iy.yazdir(kelimeler);
		System.out.println("-------------------------------");
		DiziYazdir<Integer> idy = new DiziYazdir<>();
		idy.yazdir(sayilar);
		
		DiziYazdir<String> sd = new DiziYazdir<>();
		sd.yazdir(kelimeler);
		
		System.out.println("-------------------------------");
		DiziYazdirV2 diziYazdirV2 = new DiziYazdirV2();
//		diziYazdirV2.yazdir(sayilar);
//		diziYazdirV2.yazdir(kelimeler);
		//! extends Hayvan yaptığımız için bu kod artık çalışmayacak
		
		Kopek kopek1 = new Kopek("Karabas", 50, 4);
		Kopek kopek2 = new Kopek("Pitt", 23, 5);
		Kopek kopek3 = new Kopek("Bull", 60, 10);
		
		Kopek[] kopeks = {kopek1,kopek2,kopek3};
		diziYazdirV2.yazdir(kopeks);
		
		Kedi kedi1 = new Kedi("Boncuk", 50, 4);
		Kedi kedi2 = new Kedi("Gece", 23, 5);
		Kedi kedi3 = new Kedi("Yün", 60, 10);
		Kedi[] kedis = {kedi1,kedi2,kedi3};
//		diziYazdirV2.yazdir(kedis); //!Hata verir
		
		System.out.println("-------------------------------");
		List<String> sehirler = List.of("adas","dlkş","uqye");
		diziYazdirV2.listeYazdir(sehirler);
		List<Integer> sayilarListe = List.of(1,3,56,2);
		diziYazdirV2.listeYazdir(sayilarListe);
		
		System.out.println("-------------------------------");
		List<Double> doubleList = List.of(4.23,34.321,5.312);
		double toplam = diziYazdirV2.listeTopla(doubleList);
		System.out.println(toplam);
		toplam = diziYazdirV2.listeTopla(sayilarListe);
		System.out.println(toplam);
//		toplam = diziYazdirV2.listeTopla(sehirler); //!Hatali kod!
	
	}
}