package pert4;

import ProductPert4.Product;

public class Minuman extends Product{

	private String jenisMinuman, namaProduct;

	public Minuman(String jenisMinuman, String namaProduct, String vendor, double harga) {
		super(vendor, true, harga);
		this.jenisMinuman = jenisMinuman;
		this.namaProduct = namaProduct;
	}
	
	public void displayDetail() {
		System.out.println("nama product : " + this.namaProduct);
		System.out.println("Harga product : " + this.harga);
		System.out.println("vendor product : " + this.vendor);
		System.out.println("minuman atau bukan?" + ((this.getBaverage()) ? "iya, ini adalah  minuman" : "bukan, ini bukan minuman"));
		
		isBaverage();
	}

	@Override
	public void isBaverage() {
		// TODO Auto-generated method stub
		if (this.getBaverage()) {
			System.out.println("Ini minuman, ini adalah " + this.namaProduct);
		} else {
			System.out.println("ini bukan minuman");
		}
	}

}
