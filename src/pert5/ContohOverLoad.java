package pert5;

public class ContohOverLoad {

	/*
	 * Syarat overload 
	 * 
	 * 1. nama method sama
	 * 2. variablenya berbeda secara tipe data, bukan namanya
	 * 3. peletakannya mempengaruhi 
	 * contoh param dengan (int, string) beda dengan (string, int);
	 * 4. Jumlah parameter ini bisa pembeda juga.
	 */
	
	public ContohOverLoad() {
		// TODO Auto-generated constructor stub
	}
	
	public void SayHello(String nama, int umur) {
		System.out.println("Hello my name is "  + nama + " I am " + umur + "YO");
	}
	
	public void SayHello() {
		System.out.println("Hello, nice to meet you but I don't know who am I");
	}
	
	public static void main(String[] args) {
		ContohOverLoad cthOverload = new ContohOverLoad();
		cthOverload.SayHello("Elvin" , 20);
	}

}
