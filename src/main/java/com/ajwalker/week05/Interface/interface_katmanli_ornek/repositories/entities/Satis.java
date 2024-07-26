package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities;

import java.util.UUID;

public class Satis {
	
	String satisId;
	String uuid;
	Double toplamFiyat;
	String satisTarihi;
	
	public Satis(String satisTarihi, Double toplamFiyat, String uuid) {
		this.satisId = UUID.randomUUID().toString();
		this.satisTarihi = satisTarihi;
		this.toplamFiyat = toplamFiyat;
		this.uuid = uuid;
		
		
	}
	
	public String getSatisId() {
		return satisId;
	}
	
	public String getSatisTarihi() {
		return satisTarihi;
	}
	
	public void setSatisTarihi(String satisTarihi) {
		this.satisTarihi = satisTarihi;
	}
	
	public Double getToplamFiyat() {
		return toplamFiyat;
	}
	
	public void setToplamFiyat(Double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	@Override
	public String toString() {
		return "Satis{" + "satisId='" + getSatisId() + '\'' + ", uuid='" + getUuid() + '\'' + ", toplamFiyat=" + getToplamFiyat() + ", satisTarihi='" + getSatisTarihi() + '\'' + '}';
	}
}