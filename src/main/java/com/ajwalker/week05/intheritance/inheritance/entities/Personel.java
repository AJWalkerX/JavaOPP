package com.ajwalker.week05.intheritance.inheritance.entities;

public class Personel {
	public String ad;
	public String tel;
	public String tc;
	public String ceptel;
	public int yas;
	public int maasKaySayisi;
	
	
	
	public Personel(String ad) {
		this.ad = ad;
		System.out.println("Personel sınıfı 1 parametreli constructor çalıştı."+ad);
	}
	
	public Personel(String ad, String ceptel, int maasKaySayisi) {
		this.ad = ad;
		this.ceptel = ceptel;
		this.maasKaySayisi = maasKaySayisi;
	}
	
	@Override
	public String toString() {
		return "Personel{" + "ad='" + ad + '\'' + ", tel='" + tel + '\'' + ", tc='" + tc + '\'' + ", ceptel='" + ceptel + '\'' + ", yas=" + yas + ", maasKaySayisi=" + maasKaySayisi + '}';
	}
}