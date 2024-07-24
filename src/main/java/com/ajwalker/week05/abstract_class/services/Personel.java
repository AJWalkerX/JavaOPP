package com.ajwalker.week05.abstract_class.services;

//Sınıfı final olarak tanımlarsanız o sınıftan miras alınmasını engellersiniz.
//public final class Personel{...}
public abstract class Personel {
	public String ad;
	public String tel;
	public String tc;
	public String ceptel;
	public int yas;
	
	public Personel(String ad) {
		this.ad = ad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getCeptel() {
		return ceptel;
	}
	
	public void setCeptel(String ceptel) {
		this.ceptel = ceptel;
	}
	
	public String getTc() {
		return tc;
	}
	
	public void setTc(String tc) {
		this.tc = tc;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public int getYas() {
		return yas;
	}
	
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public String getInfo() {
		System.out.println("Personel getInfo metodu çalıştı.");
		return "Personel{" + "ad='" + ad + '\'' + ", tel='" + tel + '\'' + ", tc='" + tc + '\'' + ", ceptel='" + ceptel + '\'' + ", yas=" + yas + '}';
	}
	
	public abstract void zamIste();
	

}