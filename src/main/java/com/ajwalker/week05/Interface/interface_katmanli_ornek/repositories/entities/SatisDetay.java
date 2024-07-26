package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities;

import java.util.UUID;

public class SatisDetay {
	String satisDetayID;
	String satisID;
	String urunID;
	Integer adet;
	Double fiyat;
	Double toplamFiyat;
	
	public SatisDetay(Integer adet, Double fiyat,  String satisID, Double toplamFiyat, String urunID) {
		this.adet = adet;
		this.fiyat = fiyat;
		this.satisDetayID = UUID.randomUUID().toString();
		this.satisID = satisID;
		this.toplamFiyat = toplamFiyat;
		this.urunID = urunID;
	}
	
	public Integer getAdet() {
		return adet;
	}
	
	public void setAdet(Integer adet) {
		this.adet = adet;
	}
	
	public Double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	public String getSatisDetayID() {
		return satisDetayID;
	}
	
	public String getSatisID() {
		return satisID;
	}
	
	public void setSatisID(String satisID) {
		this.satisID = satisID;
	}
	
	public Double getToplamFiyat() {
		return toplamFiyat;
	}
	
	public void setToplamFiyat(Double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	
	public String getUrunID() {
		return urunID;
	}
	
	public void setUrunID(String urunID) {
		this.urunID = urunID;
	}
}