package pert4;

import ProductPert4.Product;

public class Krupuk extends Product {

	private String nama;
	private int harga;
	private Double berat, modal;

//	Shortcut membuat setter dan getter, caranya alt + shift + s + r
	
	//Getter
	String getNama() {
		return nama; 
	}
	
	int getHarga() {
		return harga;
	}
	
	Double getBerat() {
		return berat;
	}

	Double getModal(String pass) {
		if (pass.equals("Password")) {
			return modal;
		} else {
			return null; 
		}
	}
	
	//Setter
	void setNama(String nama) {
		this.nama = nama;
	}
	
	void setHarga(int harga) {
		this.harga = harga;
	}
	
	void setBerat(Double berat) {
		this.berat = berat;
	}

	void setModal(Double modal) {
		this.modal = modal;
	}
	
	
	
	// Ini adalah Overloading pada constructor (polymorphism)
	//Constructor Kosong
	public Krupuk() {
		// Apa itu method super()
		super();
		this.vendor = "Terserah";
		this.setBaverage(false);
	}
	
	//Constructor dengan parameter
//	Untuk debugging
	public Krupuk(String Testing) {
		
		// TODO Auto-generated constructor stub
		System.out.println("String yang anda masukan adalah " + Testing);
	}
	
	Krupuk(String nama, int harga, Double berat, Double modal, String Vendor, Boolean baverage) {
		super(Vendor, baverage);
		this.nama = nama;
		this.harga = harga;
		this.berat = berat;
		this.modal = modal;
	}
	
//	Constructor dengan parameter untuk ngisi Field
//	shortcut buat constructor method => alt + shift + s + o
	
	
	public void displayDetail(String nama, int harga, double berat) {
		if (this.nama != null && this.harga != 0 && this.berat != null) {
			System.out.println("Nama Product : " + this.nama);
			System.out.println("Harga product : " + this.harga);
			System.out.println("Berat Product : " + this.berat);
			System.out.println("Vendornya adalah : " + this.vendor );
			System.out.println("apakah minuman : " + this.getBaverage());
			isBaverage();
		} else {
			System.out.println("Nama Product : " + nama);
			System.out.println("Harga product : " + harga);
			System.out.println("Berat Product : " + berat);
		}
	}

	@Override
	public void isBaverage() {
		// TODO Auto-generated method stub
		if (this.getBaverage()) {
			System.out.println("Ini minuman");
		} else {
			System.out.println("ini bukan minuman, ini adalah " + this.nama);
		}
	}


}
