package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories;

import com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities.Musteri;

public interface IMusteriRepository extends IRepository {
	Musteri getMusteri(String uuid);
}