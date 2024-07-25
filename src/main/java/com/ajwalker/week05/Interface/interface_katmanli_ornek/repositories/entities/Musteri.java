package com.ajwalker.week05.Interface.interface_katmanli_ornek.repositories.entities;

import java.util.UUID;

public class Musteri {
	private String uuid;
	private String name;
	private String surname;
	private String address;
	private String mobile;
	
	public Musteri(String address, String mobile, String name, String surname) {
		this.address = address;
		this.mobile = mobile;
		this.name = name;
		this.surname = surname;
		this.uuid = java.util.UUID.randomUUID().toString();
	}
	
	public String getUUID() {
		return uuid;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "Musteri{" + "address='" + getAddress() + '\'' + ", UUID='" + getUUID() + '\'' + ", name='" + getName() + '\'' + ", surname='" + getSurname() + '\'' + ", mobile='" + getMobile() + '\'' + '}';
	}
}