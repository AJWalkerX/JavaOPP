package com.ajwalker.week03.day05.oppUsage;

public class Araba {
	//Özellikler, üye değişkenler, Field, Nesne değişkenleri.
	public String marka;
	public String model;
	public String yil;
	public int km;// primirive datatype'ların defult degeri devreye girer.
	// Ama wrapper classlar(Integer gibi) null degeri taşır. Onun üzerine ilk değer verilmeden işlem yapılamaz.
	public Integer hiz;

//	Constructor method: Sınıf ismiyle aynı isme sahip, geri donuş ile ilgili herhangi bir değer içermeten bir
//	metod'tur.
	// Bu method ile bu sınıftan nesneler üertilecek.
	// Bu method elle yazmasanız bile derleme aşamasından sonra oluşan .class dosyasına otomatik olarak eklenir.
	public Araba(){}
	// Marka ve model değerlerini almadan yeni nesne oluşturmaz. !Eğer sadece bu constructor olursa!
	public Araba(String marka, String model) {
		//this.marka: Sınıfın nesne değişkeni olan martkayı göstermek için kullanılır.
		this.marka = marka;
		this.model = model;
	}
	
	//	Davranışlar: Üye methodlar
	public void dur(){
		hiz=0;
	}
	public void hizlan(int yeniHiz){
		hiz += yeniHiz;
		if (hiz > 180){
			hiz = 180;
		}
		
		System.out.println(hiz);
	}
	public void git(int gidilecekKm){
		km+= gidilecekKm;
	}
	public void yavasla(int yavaslamaMiktari){
		hiz-=yavaslamaMiktari;
		if (hiz < 0){
			hiz = 0;
		}
		System.out.println(hiz);
	}
	
	
	String getInfo() {
		return "Araba: {" + "marka='" + marka + '\'' + ", model='" + model + '\'' + ", yil='" + yil + '\'' + ", km=" + km + ", hiz=" + hiz + '}';
	}
}