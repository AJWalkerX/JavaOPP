package com.ajwalker.week05.intheritance.aggregation;
 /*
 aggrigetion : compositiondaki sını başlılık yerine daha gevşek bir başlılık sunar.
 Araba has motor.
 Burada bileşen ayrı bir şekilde nesne nesne oluşturularak gönderebiliyor. Bağımsız bir şekilde çalışır.
 */
public class Araba {
	private  Motor motor;
	private  String marka;
	
	public Araba(String marka, Motor motor) {
		this.marka = marka;
		this.motor = motor; // motor nesnesi dışarıdan parametre ile alınıyor
	}
	
	public void arabaBilgisi(){
		System.out.println("Araba markası: "+ marka);
		System.out.println("Motor tipi: "+ motor.getTip());
	}
}