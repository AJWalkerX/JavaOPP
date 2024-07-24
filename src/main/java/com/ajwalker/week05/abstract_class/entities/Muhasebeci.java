package com.ajwalker.week05.abstract_class.entities;

import com.ajwalker.week05.abstract_class.services.Personel;

public class Muhasebeci extends Personel {
	public String muhasebeciUnvani;
	
	public Muhasebeci(String ad) {
		super(ad);
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + "Muhasebeci Unvani:" + muhasebeciUnvani;
	}
	
	@Override
	public void zamIste() {
		System.out.println("Muhasebeci zam istiyor.");
	}
}