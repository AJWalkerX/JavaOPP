package com.ajwalker.week04.otogaleri;

public class Motor {
	public int motorHacmi;
	public String sasiNo;
	public int beygir;
	public int tork;
	
	public Motor(int beygir, int motorHacmi, String sasiNo, int tork) {
		this.beygir = beygir;
		this.motorHacmi = motorHacmi;
		this.sasiNo = sasiNo;
		this.tork = tork;
	}
	
	public int getBeygir() {
		return beygir;
	}
	
	public void setBeygir(int beygir) {
		this.beygir = beygir;
	}
	
	public int getMotorHacmi() {
		return motorHacmi;
	}
	
	public void setMotorHacmi(int motorHacmi) {
		if(motorHacmi>=800 && motorHacmi<=3000){
			this.motorHacmi = motorHacmi;
		}
		else if(motorHacmi<800){
			this.motorHacmi=800;
		}
		else if(motorHacmi>3000){
			this.motorHacmi=3000;
			System.out.println("800-3000 arası değer girmediğiniz için motorHacmi 3000 yapıldı.");
		}
	}
	
	public String getSasiNo() {
		return sasiNo;
	}
	
	public void setSasiNo(String sasiNo) {
		if(sasiNo.length()==8)
			this.sasiNo = sasiNo;
		else
			this.sasiNo="00000000";
	}
	
	public int getTork() {
		return tork;
	}
	
	public void setTork(int tork) {
		this.tork = tork;
	}
	
	@Override
	public String toString() {
		return "Motor{" + "motorHacmi=" + getMotorHacmi() + ", sasiNo='" + getSasiNo() + '\'' + ", beygir=" + getBeygir() + ", tork=" + getTork() + '}';
	}
}