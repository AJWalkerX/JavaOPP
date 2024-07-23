package com.ajwalker.week05.intheritance.inheritance.entities;

import com.ajwalker.week05.intheritance.inheritance.services.Personel;

public class Mutemet {
//	public void maasHesapla(Mudur mudur){
//		System.out.println("Müdürün maaşı:"+mudur.getMaas()* mudur.getMaasKaySayisi());
//	}
//	public void maasHesapla(Muhendis muhendis){
//		System.out.println("Mühendisin maaşı:"+muhendis.getMaas()* muhendis.getMaasKaySayisi());
//	}
//	public void maasHesapla(Muhasebeci muhasebeci){
//		System.out.println("Muhasebecinin maaşı:"+muhasebeci.getMaas()* muhasebeci.getMaasKaySayisi());
//	}
//	public void maasHesapla(Hizmetli hizmetli){
//		System.out.println("Hizmetli maaşı:"+hizmetli.getMaas()* hizmetli.getMaasKaySayisi());
//	}
	
	public void maasHesapla(Personel personel){
		System.out.println(personel.ad+" maaşı:"+personel.getMaas()* personel.getMaasKaySayisi());
	}
}