package com.ajwalker.week03.day05.oppUsage;

public class ArabaMain {
	public static void main(String[] args) {
		//Method üretildi.
		new Araba();
		//Ulaşabilmek için referanslarını tutacak değişkenlere atamak gereklidir.
		//Constructor methodlar geriye değer dönme ile ilgili bir tanımlama içermez.
		//Ancak geriye oluşturulan nesnenin bellek adresini dönerler.
		Araba araba1 = new Araba("Audi","A3");
		araba1.yil = "2020";
		araba1.km = 10_000;
		araba1.hiz = 0;
		
		Motor motor1 = new Motor();
		motor1.motorHacmi=1400;
		motor1.beygir=140;
		motor1.sasiNo="SE010MKN";
		motor1.tork=40;
		
		araba1.motor=motor1;
		
		Araba araba2 = new Araba();
		araba2.marka = "Toyota";
		araba2.model = "Corolla";
		araba2.yil = "2022";
		araba2.km = 18_000;
		araba2.hiz = 50;
		
		System.out.println(araba1.toString());
		System.out.println(araba2.getInfo());
		
		araba1.hizlan(500);
		araba1.yavasla(100);
		araba1.yavasla(200);
		araba1.yavasla(90);
		araba1.yavasla(90);
		araba1.yavasla(90);
		araba1.yavasla(100);
		
	}
}