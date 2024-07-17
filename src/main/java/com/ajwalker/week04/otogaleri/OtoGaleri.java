package com.ajwalker.week04.otogaleri;

public class OtoGaleri {
	//Nesne değişkenleri
	private Araba[] arabalar;
	private int galaridekiArabaSayisi;
	
	public OtoGaleri(int kapasite) {
		this.arabalar = new Araba[kapasite];
	}
	
	public void arabaEkle(Araba araba) {
		if (galaridekiArabaSayisi < arabalar.length) {
			arabalar[galaridekiArabaSayisi] = araba;
			galaridekiArabaSayisi++;
			
		}
		else{
			System.out.println("Galeri dolu! Araç eklenemedi!");
		}
	}
	
	public void arabalariListele() {
		for (var araba : arabalar) {
			if (araba != null){
				System.out.println(araba);
			}
		}
	}
}