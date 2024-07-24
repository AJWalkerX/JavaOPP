package com.ajwalker.week05.okul;
// nesne değişkenleri: sinifAd, lokasyon, ogrenciler(ArrayList).
// constructor:  sinifAd, lokasyon + sinifAd, lokasyon, ogrenciler(ArrayList).
// sınıfa öğrenciEkle metodu olmalı. Ogrenci nesnesi alarak ekleme olabilir, veya okulNo, ad,soyad,notOrt bilgilerini
// alıp öğrenci oluşturma işini eklerken de yapabiliriz.
// sınıftaki öğrencileri listeleyecek bir metod
import java.util.ArrayList;

public class Sinif {
	
	private String sinifAd;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrencilerArrList;
	
	public Sinif(String lokasyon, String sinifAd) {
		this.lokasyon = lokasyon;
		this.sinifAd = sinifAd;
		ogrencilerArrList = new ArrayList<>();
	}
	
	public Sinif(String lokasyon, String sinifAd,ArrayList<Ogrenci> ogrencilerArrList) {
		this.sinifAd = sinifAd;
		this.lokasyon = lokasyon;
		this.ogrencilerArrList = ogrencilerArrList;
	}
	
	public String getLokasyon() {
		return lokasyon;
	}
	
	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}
	
	public void ogrenciEkle(Ogrenci ogrenci){
		ogrencilerArrList.add(ogrenci);
	}
	public void ogrenciEkle(int okulNo, String ad, String soyad, double notOrt){
		ogrencilerArrList.add(new Ogrenci(ad,notOrt,okulNo,soyad));
	}
	
	public String getSinifAd() {
		return sinifAd;
	}
	
	public void setSinifAd(String sinifAd) {
		this.sinifAd = sinifAd;
	}
	
	public ArrayList<Ogrenci> getOgrencilerArrList() {
		return ogrencilerArrList;
	}
	
	public void listOgrenci (){
		System.out.println("*********** "+getSinifAd().toUpperCase()+" ***************");
		for (Ogrenci ogrenci:ogrencilerArrList){
			System.out.println(ogrenci);
		}
	}
	
	
}