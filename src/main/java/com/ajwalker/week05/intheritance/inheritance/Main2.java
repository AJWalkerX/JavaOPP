package com.ajwalker.week05.intheritance.inheritance;

import com.ajwalker.week05.intheritance.inheritance.entities.*;

public class Main2 {
	public static void main(String[] args) {
		Mudur mudur1 = new Mudur("Mudur1");
		Muhendis muhendis1 = new Muhendis("Mühendis1", "555", 4);
		Muhasebeci muhasebeci1 = new Muhasebeci("Muhasebeci1");
		Hizmetli hizmetli1 = new Hizmetli("Hizmetli1");
		
		Mutemet mutemet1 = new Mutemet();
		mutemet1.maasHesapla(mudur1);
		mutemet1.maasHesapla(muhendis1);
		mutemet1.maasHesapla(muhasebeci1);
		mutemet1.maasHesapla(hizmetli1);
		
		Muhendis muhendis2 = new Muhendis("Mühendis2", "555", 10);
		muhendis2.setMaas(20000);
		
		mutemet1.maasHesapla(muhendis2);
		
		/*
		
Müdürün maaşı:85010
Mühendisin maaşı:68008
Muhasebecinin maaşı:51006
Hizmetli maaşı:17002
Mühendisin maaşı:80000
		 */
	}
}