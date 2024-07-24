package com.ajwalker.week05.okul;

public class Ogrenci {
	
	private int okulNo;
	private String ad;
	private String soyad;
	private double notOrt;
	
	public Ogrenci(String ad, double notOrt, int okulNo, String soyad) {
		this.ad = ad;
		setNotOrt(notOrt);
		this.okulNo = okulNo;
		this.soyad = soyad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public double getNotOrt() {
		return notOrt;
	}
	
	public void setNotOrt(double notOrt) {
		if ( notOrt < 0 ){
			this.notOrt = 0;
		}
		else this.notOrt = Math.min(notOrt, 100);
	}
	
	public int getOkulNo() {
		return okulNo;
	}
	
	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + ad + '\'' + ", okulNo=" + okulNo + ", soyad='" + soyad + '\'' + ", notOrt=" + notOrt + '}';
	}
}