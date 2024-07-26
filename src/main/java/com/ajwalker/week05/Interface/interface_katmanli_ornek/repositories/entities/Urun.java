package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities;

public class Urun {
	static Integer index = 0;
	
	Integer id;
	String ad;
	String marka;
	Double fiyat;
	
	public Urun(String ad, String marka, Double fiyat) {
		this.ad = ad;
		this.fiyat = fiyat;
		this.id = ++index;
		this.marka = marka;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	@Override
	public String toString() {
		return "Urun{" + "ad='" + getAd() + '\'' + ", id=" + getId() + ", marka='" + getMarka() + '\'' + ", fiyat=" + getFiyat() + '}';
	}
}