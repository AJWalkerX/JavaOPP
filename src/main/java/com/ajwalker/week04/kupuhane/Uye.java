package com.ajwalker.week04.kupuhane;

/*
* Üye
uyeNo
ad
soyad
telno
dtarih
adres
tc
kayittarihi
puan
oduncAldıgıKitapSayisi
*/
public class Uye {
	//Sınıf değişkeni
	private static int uyeIndex;
	
	//Nesne değişkenleri:
	private int uyeNo;
	private String ad;
	private String soyAd;
	private String telNo;
	private String dTarihi;
	private String adres;
	private String tc;
	private String kayiTarihi;
	private int puan;
	private int oduncAldigiKitapSayisi;
	
	//Constructor
	
	public Uye() {
	}
	
	public Uye(String ad, String adres, String dTarihi, String kayiTarihi,
	           String soyAd, String tc, String telNo) {
		this.ad = ad;
		this.adres = adres;
		this.dTarihi = dTarihi;
		this.kayiTarihi = kayiTarihi;
		this.puan = 100;
		this.soyAd = soyAd;
		this.tc = tc;
		this.telNo = telNo;
		this.uyeNo = ++uyeIndex;
	}
	//Getter & Setter
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	public String getdTarihi() {
		return dTarihi;
	}
	
	public void setdTarihi(String dTarihi) {
		this.dTarihi = dTarihi;
	}
	
	public String getKayiTarihi() {
		return kayiTarihi;
	}
	
	public void setKayiTarihi(String kayiTarihi) {
		this.kayiTarihi = kayiTarihi;
	}
	
	public int getOduncAldigiKitapSayisi() {
		return oduncAldigiKitapSayisi;
	}
	
	public void setOduncAldigiKitapSayisi(int oduncAldigiKitapSayisi) {
		this.oduncAldigiKitapSayisi = oduncAldigiKitapSayisi;
	}
	
	public int getPuan() {
		return puan;
	}
	
	public void setPuan(int puan) {
		this.puan = puan;
	}
	
	public String getSoyAd() {
		return soyAd;
	}
	
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	
	public String getTc() {
		return tc;
	}
	
	public void setTc(String tc) {
		this.tc = tc;
	}
	
	public String getTelNo() {
		return telNo;
	}
	
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	
	public int getUyeNo() {
		return uyeNo;
	}
	
	public void setUyeNo(int uyeNo) {
		this.uyeNo = uyeNo;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Uye{" + "ad='" + getAd() + '\'' + ", uyeNo=" + getUyeNo() + ", soyAd='" + getSoyAd() + '\'' + ", telNo" +
				"='" + getTelNo() + '\'' + ", dTarihi='" + getdTarihi() + '\'' + ", adres='" + getAdres() + '\'' + ", " +
				"tc='" + getTc() + '\'' + ", kayiTarihi='" + getKayiTarihi() + '\'' + ", puan=" + getPuan() + ", " +
				"oduncAldigiKitapSayisi=" + getOduncAldigiKitapSayisi() + '}';
	}
}