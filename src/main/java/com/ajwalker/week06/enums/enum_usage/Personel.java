package com.ajwalker.week06.enums.enum_usage;

public class Personel {
	String ad;
	String adres;
	
	/*
	* 0-> Mühendis
	* 1-> Muhasebeci
	* 2-> Hizmetli
	* 3->Müdür
	*/
	EUnvanlar unvan;
	
	public Personel(String ad, String adres, EUnvanlar unvan) {
		this.ad = ad;
		this.adres = adres;
		this.unvan = unvan;
	}
	
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
	
	public EUnvanlar getUnvan() {
		return unvan;
	}
	
	public void setUnvan(EUnvanlar unvan) {
		this.unvan = unvan;
	}
}