package com.ajwalker.week05.Interface.usage;

public class Olcum {
	//parametreye interface yazdık
	public void nemOlc(INemOlcer nemOlcer){
		System.out.println(nemOlcer.nemOlc());
	}
	
	//Olcum sınıfı içinde yeni bir metod tenımlıyoruz
	//Bu metod geriye ITermomerte tipinde bir değer dönecek.
	//return kısmına ne yazılabilir? ITremometre interfacesini imlemente eden herhangi bir sınıftan oluşturulan bir
	// nesne yazılabilir.
	public ITermometre termometreOlustur(){
		return new SimboTermometre();
	}
	
	public INemOlcer nemOlcerOlustur() {
		return new SimboTermometre();
	}
}