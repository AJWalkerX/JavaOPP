package com.ajwalker.week04.compound_object;

public class Runner {
	public static void main(String[] args) {
		Bolum bolum1 = new Bolum("Yazılım müh.","YM");
		Ogrenci ogrenci1 = new Ogrenci("1","Joseph Walker");
		Ders ders1 = new Ders("YM -101","Comp Science",5);
		Hoca hoca1 = new Hoca();
		
		bolum1.bolumBaskani=hoca1;
		bolum1.dersler[0] = ders1;
		bolum1.ogrenciler[0]=ogrenci1;
		
		
		ogrenci1.bolum = bolum1;
		ogrenci1.aldigiDersler[0] = ders1;
		ogrenci1.danisman=hoca1;
		
		
		ders1.hoca = hoca1;
		ders1.bolum = bolum1;
		ders1.ogrenciler[0] = ogrenci1;
		
		hoca1.ad = "Alexander Walker";
		hoca1.unvan = "Prof.";
		hoca1.bolum = bolum1;
		hoca1.danisanOgrenci = new Ogrenci[10];
		hoca1.danisanOgrenci[0] = ogrenci1;
		hoca1.dersler = new Ders[4];
		hoca1.dersler[0] = ders1;
		
		//Ogrenci1'in aldığı ilk ders?
		System.out.println(ogrenci1.aldigiDersler[0].ad);
		//ogrenci1'in ilk aldığı dersin hocası
		System.out.println(ogrenci1.aldigiDersler[0].hoca.ad);
		//ogrenci1'in ilk dersin hocasının bolumunun kodu
		System.out.println(ogrenci1.aldigiDersler[0].hoca.bolum.kod);
	}
}