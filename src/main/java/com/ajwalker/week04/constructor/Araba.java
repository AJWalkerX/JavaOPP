package com.ajwalker.week04.constructor;

import com.ajwalker.week03.day05.oppUsage.Motor;

public class Araba {
	
	public String marka;
	public String model;
	public String yil;
	public int km;
	public int hiz;
	
	public Araba(){
		System.out.println("Araba() default constructor çalıştı.");
	}
	
	public Araba(String model, String marka) {
		this.model = model;
		this.marka = marka;
		System.out.println("Araba(String, String ) constructor çalıştı.");
	}
	
	public Araba(int km, String marka) {
		this.km = km;
		this.marka = marka;
		System.out.println("Araba(int, String) constructor çalıştı.");
		
	}
	/*public Araba(String yil; String marka) { // İki aynı tip parametre tekrarladığı için hata veriyor
		this.km = km;
		this.marka = marka;
		System.out.println("Araba(String, String ) constructor zaten vat çalışmaz ERROR.");
	}*/
	
	public Araba(String marka, String model, String yil, int km, int hiz) {
		this(model, marka); // Constructor methodu cağırdı.
		//this. ile this() farklı işlemler için kullanılır.
		//this. ile o sınıf içindeki nesne değişkenlerine erişim sağlarız.
		//this() method ile o sınıftaki constructorlara erişim sağlarız.
		this.yil = yil;
		this.km = km;
		this.hiz = hiz;
		System.out.println("Araba(String marka, String model, String yil, int km, int hiz) constructor çalıştı.");
		
	}
}