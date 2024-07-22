package com.ajwalker.week05.intheritance.inheritance;

import com.ajwalker.week05.intheritance.inheritance.entities.*; // -> * işareti entities package altındaki tüm sınıfları temsil için konulmuştur.

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
		
		Mudur mudur5=new Mudur("Alexander Joseph Walker");
		Muhasebeci muhasebeciAliBey=new Muhasebeci("Ali Bey");
		muhasebeciAliBey.muhasebeciUnvani="Mali Müşavir";
		System.out.println(muhasebeciAliBey);
	}
}