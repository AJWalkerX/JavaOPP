package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities;

import java.util.UUID;

public class Musteri{
	String uuid;
	String ad;
	String soyad;
	String adres;
	
	public Musteri(String ad, String soyad, String adres) {
		this.ad = ad;
		this.adres = adres;
		this.soyad = soyad;
		this.uuid = UUID.randomUUID().toString();
	}
	
	public String getUuid() {
		return uuid;
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
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	@Override
	public String toString() {
		return "Musteri{" + "ad='" + getAd() + '\'' + ", uuid='" + getUuid() + '\'' + ", soyad='" + getSoyad() + '\'' + ", adres='" + getAdres() + '\'' + '}';
	}
}