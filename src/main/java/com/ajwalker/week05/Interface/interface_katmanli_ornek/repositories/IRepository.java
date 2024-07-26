package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories;

public interface IRepository {
	void save(Object o);
	void update(Object yeniKayit, int eskiKayitIndex);
	void delete(Object o);
	void list();
	int search(Object o);
}