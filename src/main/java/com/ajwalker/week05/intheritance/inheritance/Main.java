package com.ajwalker.week05.intheritance.inheritance;

import com.ajwalker.week05.intheritance.inheritance.entities.*; // -> * işareti entities package altındaki tüm sınıfları temsil için konulmuştur.
import com.ajwalker.week05.intheritance.inheritance.services.Personel;
import com.ajwalker.week05.intheritance.inheritance.services.Yonetici;

public class Main {
	public static void main(String[] args) {
		/*Mudur mudur1=new Mudur();
		Mudur mudur2=new Mudur();
		Mudur mudur3=new Mudur();
		System.out.println(mudur1.ad);
		System.out.println(mudur2.ad);
		System.out.println(mudur3.ad);*/
		
		//Mudur mudur4=new Mudur("Ayhan","555","1111","888444");
		//System.out.println(mudur4);
		
		Mudur mudur5=new Mudur("Mehmet");
		Muhasebeci muhasebeciAliBey=new Muhasebeci("Ali Bey");
		muhasebeciAliBey.muhasebeciUnvani="Mali Müşavir";
		
		//System.out.println(muhasebeciAliBey.getInfo());
		
		System.out.println(mudur5.yoneticiOzelligi);
		System.out.println(mudur5.ad);
		mudur5.yoneticiMetodu();
		
		Personel personel1=new Personel("Personel1-Personel");
		personel1.ad="Ali";
		Personel personel2=new Yonetici("Personel2-Yonetici");
		personel2.ad="Ahmet";
		Personel personel3=new Mudur("Personel3-Mudur");
		//personel3.getInfo();
		Personel personel4=new Muhendis("Personel4-Mühendis","55",5);
		Mudur mudur4=new Mudur("Personel4");
		
		
		Yonetici yonetici1=new Yonetici("yonetici1");
		Yonetici yonetici2=new Mudur("yonetici2");
		//Yonetici yonetici3=new Muhasebeci("yonetici2");
		
		isYap(personel1);
		isYap(personel2);
		isYap(personel3);
		isYap(personel4);
	}
	
	public static void isYap(Personel p){
		//p.getInfo();
		p.zamIste();
		p.calis();
		System.out.println(p.ad+" iş yaptı");
	}
}