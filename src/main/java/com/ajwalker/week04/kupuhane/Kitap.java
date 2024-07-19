package com.ajwalker.week04.kupuhane;

public class Kitap {
	//Nesne değişkenleri:
	private String ISBN;
	private String ad;
	private double fiyat;
	private String tur;
	private int sayfaSayisi;
	private int adet;
	private int stok;
	private String yazar;
	private String yayinEvi;
	private String yayinYili;
	
	//Constructor:
	public Kitap(){}
	
	public Kitap(String ad, String ISBN, int sayfaSayisi, String tur, String yayinEvi, String yayinYili, String yazar) {
		this.ad = ad;
		this.adet = 1;
		this.stok = 1;
		this.ISBN = ISBN;
		this.sayfaSayisi = sayfaSayisi;
		this.tur = tur;
		this.yayinEvi = yayinEvi;
		this.yayinYili = yayinYili;
		this.yazar = yazar;
	}
	//Getter & Setter
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getAdet() {
		return adet;
	}
	
	public int getStok() {
		return stok;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
	
	public String getTur() {
		return tur;
	}
	
	public void setTur(String tur) {
		this.tur = tur;
	}
	
	public String getYayinEvi() {
		return yayinEvi;
	}
	
	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}
	
	public String getYayinYili() {
		return yayinYili;
	}
	
	public void setYayinYili(String yayinYili) {
		this.yayinYili = yayinYili;
	}
	
	public String getYazar() {
		return yazar;
	}
	
	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	
	@Override
	public String toString() {
		return "Kitap{" + "ad='" + getAd() + '\'' + ", ISBN='" + getISBN() + '\'' + ", fiyat=" + fiyat + ", tur='" + getTur() + '\'' + ", sayfaSayisi=" + getSayfaSayisi() + ", adet=" + getAdet() + ", stok=" + getStok() + ", yazar='" + getYazar() + '\'' + ", yayinEvi='" + getYayinEvi() + '\'' + ", yayinYili='" + getYayinYili() + '\'' + '}';
	}
}