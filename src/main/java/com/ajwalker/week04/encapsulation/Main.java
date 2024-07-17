package com.ajwalker.week04.encapsulation;

public class Main {
	public static void main(String[] args) {
		Encapsulation encap = new Encapsulation();
		encap.setSaseNo("12345678");
		System.out.println(encap.getSaseNo());
		Encapsulation encap2 = new Encapsulation(20, "abcd"); //Sase numarasını atamadı. Çünkü constructor içersinde
		// this yerine setter kullanıldı.
		
		System.out.println(encap.toString());
		System.out.println(encap2.toString());
	}
}