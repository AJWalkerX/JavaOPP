package com.ajwalker.week04.encapsulation;
/*
	Encapsulation: Bir sınıf içindeki metod ve değişkenleri korumak demektir.
	Nesne değişkenlerimizin dışarıdaki sınıflardan erişimini gizleriz.
	Access Modifierlardan Private kullanarak bu erişim gizlenir.
	
	Nesne değişkenini girdikten sonra değer atamak ve okumak için Public olarak tanımlanan setter ve getter metodlar kullanılır.
	Setter metodlar ile nesne değişkenine değer atanırken gerekli kontroler sağlanabilir.
	Getter metodu ile de nesne değişkeninin değerini okuyabilirsin.
	
	Encapsulation'da package yapısı da önemlidir. Access modifierlar package yapısına göre davranışlar sergiler.
	
	
*/
public class Encapsulation {
	private int kdvOrani; // Nesne değişkeni : private yapılarak sınıf dışarısından erişim engellendi.
	private String saseNo;
	
	public Encapsulation(){}
	public Encapsulation(int kdvOrani, String saseNo) {
		this.kdvOrani = kdvOrani;
		//this.saseNo = saseNo; burada kontroldsüz bir şekilde parametrelerden gelen saseNo bilgisi nesne değişkeni
		// olan saseNo'ya aktarılıyor bu yüzden burada da setSaseNo methodu kullanarak bu açığın önüne geçeriz
		setSaseNo(saseNo);
	}
	
	public void  setKdvOrani(int kdvOrani){
		if (kdvOrani <30 && kdvOrani > 0){
			this.kdvOrani = kdvOrani;
		}
		else {
			System.out.println("Oran 0-30 arası olmalıdır.");
		}
	}
	public int getKdvOrani(){
		return kdvOrani;
	}
	
	public String getSaseNo() {
		return saseNo;
	}
	
	public void setSaseNo(String saseNo) {
		if (saseNo.length() >=8){
			this.saseNo = saseNo;
		}
		else{
			System.out.println("En az 8 karakter uzunluğunda olmalıdır.");
		}
	}
	
	@Override
	public String toString() {
		return "Encapsulation{" + "kdvOrani=" + getKdvOrani() + ", saseNo='" + getSaseNo() + '\'' + '}';
	}
}