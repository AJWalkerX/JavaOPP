package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories;

import com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities.Urun;

public interface IUrunRepository extends IRepository {
	Urun getUrun(int id);
}