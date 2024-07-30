package com.ajwalker.week06.staticc;

public class StaticUsage {
	static Integer sayi = 10;
	
	static Integer sayi2;
//	sayi2 = 20; // Class içerisinde bu şekilde değer verilemez.
	
	
	
	public static void main(String[] args) {
		sayi2 = 20; // Bu şekilde main içersinde olmalıdır.
	}
	
	public void degerVer(){
		sayi2 = 20; // yada bu şekilde olmalıdır.
	}
	
	{
		sayi2 = 20; //Bu da olur.
	}
}