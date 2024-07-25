package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities;

public class Urun {
	static Integer urunIndex = 0;
	private Integer urunId;
	private String ad;
	private String marka;
	private Double kdvOrani;
	private Double fiyat;
	
	public Urun(String ad, String marka, Double fiyat, Double kdvOrani) {
		this.ad = ad;
		this.fiyat = fiyat;
		this.kdvOrani = kdvOrani;
		this.marka = marka;
		this.urunId = ++urunIndex;
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
	
	public Double getKdvOrani() {
		return kdvOrani;
	}
	
	public void setKdvOrani(Double kdvOrani) {
		this.kdvOrani = kdvOrani;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public Integer getUrunId() {
		return urunId;
	}
	
	public static Integer getUrunIndex() {
		return urunIndex;
	}
	
	public static void setUrunIndex(Integer urunIndex) {
		Urun.urunIndex = urunIndex;
	}
	
	@Override
	public String toString() {
		return "Urun{" + "ad='" + getAd() + '\'' + ", urunId=" + getUrunId() + ", marka='" + getMarka() + '\'' + ", kdvOrani=" + getKdvOrani() + ", fiyat=" + getFiyat() + '}';
	}
}