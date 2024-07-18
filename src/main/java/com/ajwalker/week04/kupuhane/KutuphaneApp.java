package com.ajwalker.week04.kupuhane;

public class KutuphaneApp {
	public static void main(String[] args) {
		Kutuphane kutuphane1 = new Kutuphane();
		Kitap kitap1=new Kitap("The Little Prince","9786059681001",120,"Hikaye","KARBON KİTAPLAR","2016","Antoine De " +
				"Saint Exupery");
		kutuphane1.kitapEkle(kitap1);
		kutuphane1.kitapEkle(kitap1);
		
		Kitap kitap2=new Kitap("Moby Dick","9786256691223",496,"Roman","KAPRA YAYINCILIK","2024","Herman Melville");
		kutuphane1.kitapEkle(kitap2);
		
		kutuphane1.kitaplariListele();
		
		Uye uye1 = new Uye("Su","Kadıköy Ist.","1999","18.07.2024","Yıldırım","12214423153","5350232132");
		Uye uye2 = new Uye("Ece","Bakırköy Ist.","1996","18.07.2024","Keskin","92914443123","5450632332");
		kutuphane1.uyeEkle(uye1);
		kutuphane1.uyeEkle(uye2);
		kutuphane1.uyeListele();
		
		kutuphane1.oduncVer("9786256691223", "92914443123");
		kutuphane1.oduncVer("9786059681001", "92914443123");
		kutuphane1.oduncVer("9786256691223", "12214423153");
		kutuphane1.oduncVer("9786059681001", "12214423153");
	}
}