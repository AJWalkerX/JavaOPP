package com.ajwalker.week05.intheritance.inheritance.entities;

public class Muhasebeci extends Personel{
	public String muhasebeciUnvani;
	
	public Muhasebeci(String ad) {
		super(ad);
	}
	
	
	@Override
	public String toString() {
		return "Muhasebeci{" + "muhasebeciUnvani='" + muhasebeciUnvani + '\'' +  super.toString()+'}';
	}
}