package com.ajwalker.oppUsage;

public class Araba {
	public String marka;
	public String model;
	public String yil;
	public int km;
	public int hiz;

//	Constructor method: Sınıf ismiyle aynı isme sahip, geri donuş ile ilgili herhangi bir değer içermeten bir
//	metod'tur.
	// Bu method ile bu sınıftan nesneler üertilecek.
	// Bu method elle yazmasanız bile derleme aşamasından sonra oluşan .class dosyasına otomatik olarak eklenir.
	public Araba(){
	
	}
//	Davranışlar: Üye methodlar
	public void dur(){
		hiz=0;
	}
	public void hizlan(int yeniHiz){
		hiz = yeniHiz;
	}
	public void git(int gidilecekKm){
		km+= gidilecekKm;
	}
	
	@Override
	public String toString() {
		return "Araba: {" + "marka='" + marka + '\'' + ", model='" + model + '\'' + ", yil='" + yil + '\'' + ", km=" + km + ", hiz=" + hiz + '}';
	}
}