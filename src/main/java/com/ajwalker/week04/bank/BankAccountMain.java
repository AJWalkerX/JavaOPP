package com.ajwalker.week04.bank;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount hesap1 = new BankAccount();
		hesap1.setHesapSahibi("Alexander J. Walker");
		hesap1.setBakiye(999_999_999);
		
		BankAccount hesap2 = new BankAccount();
		hesap2.setHesapSahibi("Kai Osman");
		hesap2.setBakiye(1_000_000);
		
		System.out.println("Faiz orani: "+BankAccount.getFaizOrani());
		
		hesap1.setFaizOrani(0.20);
		
		System.out.println(hesap1.getFaizOrani());
		System.out.println("Faiz orani: "+BankAccount.getFaizOrani());
		System.out.println(hesap2.getFaizOrani());
	
		BankAccount hesap3 = new BankAccount("Gökhan Agra",5_000_000);
		System.out.println(hesap1.getHesapSahibi());
		System.out.println(hesap1.getBakiye());
		System.out.println(hesap2.getHesapSahibi());
		System.out.println(hesap2.getBakiye());
		System.out.println(hesap3.getHesapSahibi());
		System.out.println(hesap3.getBakiye());
		System.out.println("----------------------------------");
		BankAccount.faizEkle(hesap1);
		
		BankAccount hesap4 = new BankAccount();
		System.out.println(hesap4.getHesapNo());
		System.out.println(hesap1.toString());
		System.out.println(hesap2.toString());
		System.out.println(hesap3.toString());
		System.out.println(hesap4.toString());
		
	}
}