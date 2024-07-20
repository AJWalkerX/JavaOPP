package com.ajwalker.week04.kupuhane;

import java.time.LocalDate;

public class KutuphaneApp {
	public static void main(String[] args) {
		Kutuphane kutuphane1 = new Kutuphane();
		Kitap kitap1=new Kitap("The Little Prince","9786059681001",120,"Hikaye","KARBON KİTAPLAR","2016","Antoine De " +
				"Saint Exupery");
		kutuphane1.kitapEkle(kitap1);
		kutuphane1.kitapEkle(kitap1);
		kutuphane1.kitapEkle(kitap1);
		kutuphane1.kitapEkle(kitap1);
		kutuphane1.kitapEkle(kitap1);

		Kitap kitap2=new Kitap("Moby Dick","9786256691223",496,"Roman","KAPRA YAYINCILIK","2024","Herman Melville");
		kutuphane1.kitapEkle(kitap2);
		kutuphane1.kitapEkle(kitap2);
		kutuphane1.kitapEkle(kitap2);
		kutuphane1.kitapEkle(kitap2);
		
		Kitap kitap3=new Kitap("Tarzan 2: Tarzan'ın Dönüşü","9786257599412",302,"Hikaye","Fihrist","2022",
		                       "Edgar Rice Burroughs");
		kutuphane1.kitapEkle(kitap3);
		kutuphane1.kitapEkle(kitap3);
		kutuphane1.kitapEkle(kitap3);
//		kutuphane1.kitaplariListele();
		
		Uye uye1 = new Uye("Su","İzmir","1999","18.07.2024","Yıldırım","12214423153","5350232132");
		Uye uye2 = new Uye("Su","Antalya","2000","18.07.2024","Akbaş","12214423151","5353132132");
		Uye uye3 = new Uye("Su","Kadıköy Ist.","1990","18.07.2024","Beyazıt","12214423152","5398765132");
		Uye uye4 = new Uye("Ece","Bakırköy Ist.","1996","18.07.2024","Keskin","92914443125","5451232332");
		kutuphane1.uyeEkle(uye1);
		kutuphane1.uyeEkle(uye2);
		kutuphane1.uyeEkle(uye3);
		kutuphane1.uyeEkle(uye4);
		
		kutuphane1.oduncVer("9786256691223", "12214423153");
		kutuphane1.oduncVer("9786059681001", "12214423153");
		kutuphane1.teslimAl(1);
		kutuphane1.teslimAl(2);
		kutuphane1.oduncVer("9786059681001", "12214423153");
		kutuphane1.oduncVer("9786257599412", "12214423153");
		kutuphane1.uyeninOduncAldigiTumKitaplar("Su","Yıldırım");
		kutuphane1.uyedekiKitaplar("12214423153");
//		kutuphane1.oduncListele();
		
//		kutuphane1.uyeListele();
		/*kutuphane1.uyeSil("12214423153");
		kutuphane1.uyeListele();
		kutuphane1.teslimAl(1);
		kutuphane1.oduncListele();
		kutuphane1.uyeListele();
//		kutuphane1.kitapAra("moby Dick");
		kutuphane1.uyeAra("u", "Yıldırım");
		*/
//
//		kutuphane1.kitapSil("9786256691223");
	
	}
}