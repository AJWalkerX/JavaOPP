package com.ajwalker.week05.Polymorphism;

public class Kus extends Hayvan{
	
	public Kus(String ad, int boy, int kilo) {
		super(ad, boy, kilo);
	}
	
	@Override
	public void sesCikar() {
		System.out.println("cici kus cici kus");
	}
}