package com.ajwalker.week05.okul;
// nesne değişkenleri: okulAd, okulAdres, siniflar(ArrayList)
// constructor 1:  okulAd, okulAdres
// constructor 2:  okulAd, okulAdres, siniflar(ArrayList)
// getter&setter
// sinifEkle 1 : (Sinif sinif)
// siniflariListele -> sinifAd ve sinifLokasyon bilgileri yazsın.
// ogrenciListele -> Sınıf Sınıf öğrenci listelerini yazdırsın.
import java.util.ArrayList;

public class Okul {
	private String okulAdi;
	private String okulAdres;
	private ArrayList<Sinif> sinifArrayList;
	
	public Okul(String okulAdi, String okulAdres) {
		this.okulAdi = okulAdi;
		this.okulAdres = okulAdres;
		this.sinifArrayList = new ArrayList<>();
	}
	
	public Okul(String okulAdi, String okulAdres, ArrayList<Sinif> sinifArrayList) {
		this.okulAdi = okulAdi;
		this.okulAdres = okulAdres;
		this.sinifArrayList = sinifArrayList;
	}
	
	public String getOkulAdi() {
		return okulAdi;
	}
	
	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}
	
	public String getOkulAdres() {
		return okulAdres;
	}
	
	public void setOkulAdres(String okulAdres) {
		this.okulAdres = okulAdres;
	}
	
	public void sinifEkle(Sinif sinif){
		sinifArrayList.add(sinif);
	}
	public  void siniflariListele(){
		System.out.println("*************** "+getOkulAdi().toUpperCase()+" ******************");
		for (Sinif sinif: sinifArrayList){
			System.out.println(sinif);
		}
	}
	public void okulOgrenciListele(){
		System.out.println("**********************"+getOkulAdi().toUpperCase()+"**********************");
		for (Sinif sinif : sinifArrayList){
			sinif.listOgrenci();
		}
	}
}