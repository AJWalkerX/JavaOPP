package com.ajwalker.week05.intheritance.inheritance.entities;

import com.ajwalker.week05.intheritance.inheritance.services.Personel;

public class Muhasebeci extends Personel {
	public String muhasebeciUnvani;
	
	public Muhasebeci(String ad) {
		super(ad);
	}
	
	@Override
	public void calis() {
		System.out.println("MUhasebeci calis");
	}
	
	@Override
	public int getMaasKaySayisi() {
		return 3;
	}
	
//	public void getProtectedMethodFromParent(){
//		super.protectedMethod(); // Personel ile bu sınıf extends edildiği için Personel sınıfı başka packeage
//		// içerisinde olmasına rağman protected sınıfa ulaşılabilindi.
//	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + "Muhasebeci Unvani:" + muhasebeciUnvani;
	}
}