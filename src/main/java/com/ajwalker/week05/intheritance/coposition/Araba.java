package com.ajwalker.week05.intheritance.coposition;

//Araba sınıfı compound sınıfıdır (composition)
//Bu ilişki türünde (composition) 2 sınıfı birbirine çok sıkı bağlıdır.
//Her 2 nesne de birlikte üretilirler.
//Araba nesnesi motor nesnesi olmadan olamaz.

public class Araba {
	private Motor motor;
	private String marka;
	
	public Araba(String tip, String marka){
		this.motor =new Motor(tip);
		this.marka = marka;
	}
	public void arabaBilgisi(){
		System.out.println("Araba markası: "+ marka);
		System.out.println("Motor tipi: "+ motor.getTip());
	}
}