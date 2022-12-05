package pert4;

public class OOP {
	/*
	1. OOP (object Oriented Programmming) ini konsep
	di java ada yg namaya 
	 1. Kelas => bentukan/cetakan dari sebuah object yang akan  di buat
	 2. Object => gabungan dari berberapa variable yang tipe datanya udh di tentukan

	Konsep OOP itu terbagi 3
	1. Encapsulation => pengelompokan dan management akses kepada data dalam sana pengelompokannya terdiri dari Field (variable global dari kelas tersebut), method, constructor.

		Access modifier itu 3 explicitly defined, satu lagi default
		
		untuk mengakses data yg tidak visible karena access modifier tidak memberikan akses, kita bisa pake setter dan getter method (accessor dan mutator)
		
		1. public => bisa diakses sama semua kelas dalam project
		2. protected => bisa diakses sama anaknya dari kelas tersebut
		3. Default => bisa di akses di pakage yg sama aja
		4. private => hanya di kelas itu saja


	2. inheritance 
		Parent dan child
		- Product adalah Parent
		- makanan dan minuman itu adalah child
		
		Class itu ada 2 secara teknikal
		Class biasa, dan Class abstract 
	3. Polymorph
	*/
	public void UnOOP() {
		Object[] item = new Object[3];
		
		item[0] = "Kusuka";
		item[1] = 2000;
		item[2] = 100.5D;
		
		Object[] item2 = new Object[3];
		
		item2[0] = "Chitato";
		item2[1] = 1000;
		item2[2] = 50.6D;
		
		System.out.println("Nama product : " + item[0]);
		System.out.println("Harga product : " + item[1] );
		System.out.println("Berat product : " + item[2] );
	}
	
	public void oopUsage() {
		Krupuk kusuka = new Krupuk("Hello World");
		kusuka.displayDetail("Chitato", 2000, 100.5);
		kusuka.setHarga(5000);
		kusuka.setNama("Kusuka");
		kusuka.setBerat(100.5);
		kusuka.setModal(2000.0);
		
		System.out.println();
		kusuka.displayDetail("lays", 3000, 100.5);
		
		System.out.println("\nIni adalah harga dari kusuka " + kusuka.getModal(""));
		System.out.println();
		Krupuk chitato = new Krupuk("Chitato", 5000, 30.1, 3000D, "Terserah", false); 
		chitato.displayDetail("", 0, 0);
		System.out.println("\n==========================\n");
		Minuman pocari = new Minuman("Minuman isotonik", "Pocari", "Otsuka", 7000);
		pocari.displayDetail();
	}
	
	public OOP() {
		// TODO Auto-generated constructor stub
//		actionOOP();
//		contohMethod();
	}
	
	public void contohMethod() {
		System.out.println("ini dari contohMethod");
	}
	
	public static void main(String[] args) {
		new OOP().oopUsage();
		
	}
	

}
