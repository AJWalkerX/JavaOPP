package com.ajwalker.week06.staticc;

public class StaticUsage3 {
	static Integer sayi;
	
	public void degerAta(){
		sayi = 10;
	}
	
	public StaticUsage3() {
		System.out.println("Constructor çalıştı.");
		sayi = 30;
	}
	static void degerAta2(){
		sayi = 40;
	}
	
	static {
		System.out.println("static block çalıştı");
		sayi = 50;
	}
	{
		System.out.println("Init block çalıştı");
		sayi = 60;
	}
}