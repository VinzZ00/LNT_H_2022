package ProductPert4;


public abstract class Product {
	protected Double harga;
	protected String vendor;
	private boolean baverage;
	
	protected Product() {
		
	}
	
	public Product(String vendor, boolean baverage, Double harga) {
		this.vendor = vendor;
		this.baverage = baverage;
		this.harga = harga;
	}
	
	public Product(String vendor, boolean baverage) {
		this.vendor = vendor;
		this.baverage = baverage;
	}
	
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public void setBaverage(boolean baverage) {
		this.baverage = baverage;
	}

	public boolean getBaverage() {
		return baverage;
	}
	public abstract void isBaverage();
	
	
}
