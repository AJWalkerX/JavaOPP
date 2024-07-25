package com.ajwalker.week05.Interface.usage;

public class Runner {
	public static void main(String[] args) {
		BraunTermo bt10 = new BraunTermo();
		System.out.println(bt10.sicaklikOlc());
		System.out.println(bt10.havaKalitesi());
		System.out.println(bt10.nemOlc());
		System.out.println(bt10.saatGoster());
		System.out.println(bt10.tarihGoster());
		
		SimboTermometre smb1 = new SimboTermometre();
		System.out.println(smb1.nemOlc());
		System.out.println(smb1.sicaklikOlc());
		
		Olcum olcum = new Olcum();
		System.out.println("*****");
		olcum.nemOlc(smb1); //nemOlc metodu parametre olarak interface istiyordu,
		//ama ona bir nesne gönderdik.
		
		
		//Abstraction: Soyutlama, gizleme: Hangi termometre ile ölçüm yapıldı bilinmiyor.
		ITermometre iTermometre = olcum.termometreOlustur();
		System.out.println(iTermometre.sicaklikOlc());
		
		INemOlcer iNemOlcer = olcum.nemOlcerOlustur();
		System.out.println(iNemOlcer.nemOlc());
	}
}