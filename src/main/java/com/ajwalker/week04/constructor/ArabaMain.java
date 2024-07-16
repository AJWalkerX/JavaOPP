package com.ajwalker.week04.constructor;

public class ArabaMain {
	public static void main(String[] args) {
		Araba araba1 = new Araba();
		Araba araba2 = new Araba("Audi", "Q5");
		Araba araba3 = new Araba(5000, "Mercedes");
		System.out.println();
		Araba araba4 = new Araba("bilmem ne","BMW","1990",1000,140);
	}
}