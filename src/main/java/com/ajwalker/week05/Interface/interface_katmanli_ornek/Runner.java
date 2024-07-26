package com.ajwalker.week05.Interface.interface_katmanli_ornek;

import com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.MusteriRepository;
import com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.UrunRepository;
import com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities.Musteri;
import com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities.Urun;

public class Runner {
	public static void main(String[] args) {
		MusteriRepository dbMusteri = new MusteriRepository();
		Musteri m1 = new Musteri("alex","walker","eskişehir");
		Musteri m2 = new Musteri("Joseph","walker","eskişehir");
		dbMusteri.save(m1);
		dbMusteri.save(m2);
		int index = dbMusteri.search(m1);
		m1.setAd("Cemil");
		dbMusteri.update(m1,index);
		dbMusteri.list();
		
		UrunRepository dbUrun = new UrunRepository();
		Urun u1 = new Urun("çikolata", "eti", 10.0);
		dbUrun.save(u1);
		
		
	}
}