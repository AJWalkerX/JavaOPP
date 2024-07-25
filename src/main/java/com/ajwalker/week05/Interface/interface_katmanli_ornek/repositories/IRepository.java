package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories;

public interface IRepository<T> {
	void save (Object object);
	void delete (Object object);
	void uptade (Object object);
	void getAll ();
}