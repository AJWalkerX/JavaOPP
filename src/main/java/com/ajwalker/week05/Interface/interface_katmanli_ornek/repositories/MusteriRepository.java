package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories;

import com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities.Musteri;

import java.util.ArrayList;

public class MusteriRepository implements IMusteriRepository {
	ArrayList<Musteri> musteriArrayList;
	
	public MusteriRepository() {
		this.musteriArrayList = new ArrayList<>();
	}
	
	@Override
	public void save(Object o) {
		Musteri musteri = (Musteri) o;
		musteriArrayList.add(musteri);
		System.out.println(musteri.getAd() + " adlı kişi eklendi");
	}
	
	@Override
	public void update(Object yeniKayit, int eskiKayitIndex) {
		Musteri musteri = (Musteri) yeniKayit;
		musteriArrayList.set(eskiKayitIndex, musteri);
	}
	
	@Override
	public void delete(Object o) {
		Musteri musteri = (Musteri) o;
		if (musteriArrayList.remove(musteri)) {
			System.out.println(musteri.getAd() + " adlı kişi listeden kaldırıldı!");
		}
		else System.out.println("Böyle bir müşteri yok");
	}
	
	@Override
	public void list() {
//		for (Musteri musteri : musteriArrayList) {
//			System.out.println(musteri);
//		}
		//Lamda expression kullanımı:
//		musteriArrayList.forEach(musteri -> System.out.println(musteri));

//		Method referans:
		musteriArrayList.forEach(System.out::println);
	}
	
	@Override
	public int search(Object o) {
		int index = musteriArrayList.indexOf((Musteri) o);
		System.out.println(musteriArrayList.get(index));
		return index;
	}
	
	/*
	 * uuid'sine göre aranan musteriyi döner
	 * @param uuid:
	 * @return uuid;
	 * */
	@Override
	public Musteri getMusteri(String uuid) {
		for (Musteri musteri: musteriArrayList){
			if (musteri.getUuid().equals(uuid)){
				return musteri;
			}
		}
		System.out.println("Böyle bir uuid yok!");
		return null;
	}
}