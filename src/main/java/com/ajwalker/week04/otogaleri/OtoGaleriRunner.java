package com.ajwalker.week04.otogaleri;

public class OtoGaleriRunner {
	public static void main(String[] args) {
		OtoGaleri kardeslerOto = new OtoGaleri(10);
		kardeslerOto.arabaEkle(new Araba(0,20000,"Marka1","Model1",new Motor(90,1600,"dsada123",200),"beyaz","2020"));
		
		Motor motor2 = new Motor(10,20,"dsajlx123",50);
		kardeslerOto.arabaEkle(new Araba(0,40000,"Marka2","Mdel2",motor2,"siyah","2000"));
		
		Motor motor3 = new Motor(10,20,"dsajlx123",50);
		Araba araba =new Araba(0,40000,"Marka2","Mdel2",motor2,"siyah","2000");
		kardeslerOto.arabaEkle(araba);
		
		OtoGaleri alexGaleri = new OtoGaleri(3);
		alexGaleri.arabaEkle(new Araba());
		alexGaleri.arabaEkle(new Araba());
		alexGaleri.arabaEkle(new Araba());
		alexGaleri.arabaEkle(new Araba());
		
		kardeslerOto.arabalariListele();
	}
	
}