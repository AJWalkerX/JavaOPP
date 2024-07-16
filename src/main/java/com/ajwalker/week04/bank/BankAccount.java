package com.ajwalker.week04.bank;
/*
	Java 3 tip değişken vardır.
	1.Object variable (Nesne değişkeni, Instance variable)
	2.Class variable (Sınıf değişkeni, Static variable)
	3.Local Variable (yerel değişken)
 */
public class BankAccount {
	//Sınıf değişkeni (Static variable)
	private static double faizOrani = 0.05;
	private static int hesapNoCounter;
	
	//Nese değişkenleri (Instance variable, Field, Prop, Property)
	//Nesne değişkenlerine ilk değer atanmazsa bile derleyici varsayılan bir değer atar.
	private int hesapNo;
	private String hesapSahibi;
	private double bakiye;
	
	//Default Constructor: Parametre almayan.
	public BankAccount() {
		hesapNoCounter++;
		this.hesapNo = hesapNoCounter;
	}
	//Constructor Method: Nesne yaratmak için kullanılır. // Parametreli
	public BankAccount(String hesapSahibi, double bakiye) {
		hesapNoCounter++;
		this.hesapNo = hesapNoCounter;
		this.hesapSahibi = hesapSahibi;
		this.bakiye = bakiye;
	}
	
	public static double getFaizOrani() {
		return faizOrani;
	}
	
	public static void setFaizOrani(double faizOrani) {
		BankAccount.faizOrani = faizOrani;
	}
	
	//Private olan methodları dışarıdan erişilebilir yapmak için. Getter ve Setter kullanılır.
	public int getHesapNo() {
		return hesapNo;
	}
	
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}
	
	public String getHesapSahibi() {
		return hesapSahibi;
	}
	
	public void setHesapSahibi(String hesapSahibi) {
		this.hesapSahibi = hesapSahibi;
	}
	
	public double getBakiye() {
		return bakiye;
	}
	
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	//Metodlar
	public void paraYatir(double miktar){
		bakiye+=miktar;
		System.out.println("Yeni bakiye: "+bakiye);
	}
	
	public void paraCek(double miktar) {
		bakiye -= miktar;
		System.out.println("Yeni bakiye: " + bakiye);
	}
	
	public static void faizEkle(BankAccount hesap) {
		double faizGeliri = hesap.getBakiye() * faizOrani;
		hesap.setBakiye(hesap.getBakiye()+faizGeliri);
		System.out.println("Faiz geliri sonrası bakiye: "+hesap.getBakiye());
	}
	
	@Override
	public String toString() {
		return "BankAccount{" + "hesapNo=" + hesapNo + ", hesapSahibi='" + hesapSahibi + '\'' + ", bakiye=" + bakiye + '}';
	}
}