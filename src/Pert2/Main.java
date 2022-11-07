package Pert2;

import java.math.MathContext;
import java.util.Random;

public class Main {

	private int returnPrimit() {
		return 12;
	}
	
	private void stringMethod(String nama) {
		// TODO Auto-generated method stub
//		Tiap primitive type itu immutable
		System.out.println("Ini dari main Constructor default " + nama);
//		Concat itu sama dengan operation + yang diberikan kepada String
		System.out.println("Ini dari main Constructor default dengan Concat ".concat(nama));
//		codePointAt() memberikan nilai ASCII value pada sebuah string di index yang di berikan di parameternya
		System.out.println("Ini ASCII value dari index ke - 1 dari parameter " + nama.codePointAt(1));
//		Static Method
		System.out.println(String.valueOf(12));
		System.out.println(String.valueOf(12));

		String strPertama = "Hello", strKeempat = "World";
		String strKedua = "HEllO", strKetiga = null;
	
		
		

		System.out.printf("Ini compareTo tanpa ignore case %d\n" ,strPertama.compareTo(strKedua));
//		hal yang sama juga berlaku untuk equals dan equals ignore case 		
		System.out.println("Ini compare to dengan ingnore case " + strPertama.compareToIgnoreCase(strKedua));

		System.out.println("Hello world GOD BLESS YOU".toUpperCase());
		System.out.println("Hello world GOD BLESS YOU".toUpperCase().contains("HELLO"));
	}
	

	
	
	
	private void section1() {
//		byte -> short -> int -> long -> float -> 
		/*
		 * Mengapa semua math return double
		 * 1. double size double itu yang palign besar.
		 * 2. double itu presisinya lebih tinggi.
		 * 3. casting, manual parsing. (kalo udh di parsing, bukan dibulatin, melainkan itu di truncate)
		 * truncate itu membuang presisi yang ada sampai menyamai datatype tujuannya
		 * contoh 12,999999999 tetap jadi 12 di tipe integer. bukan 13
		 */
		
		
		
		int x = 45;
		System.out.println(Math.round(45.33214));
		x = (int)Math.ceil(Math.sin(x));
		System.out.println(x);
//		Pembulatan keatas (ceil)
//		23 -> 30
//		pembulatan kebawah (floor)
//		28 -> 20
//		pembulatan terdekat (round)
//		25 -> 30
//		22 -> 20
//		1.1 dibuletin jadi 1 di floor dan 2 di ceil 1 di round()
		Random rand = new Random(2);
		Random randKedua = new Random(2);
//	System.out.println((int)(Math.random() * 20));
	for (int i = 0; i < 5; i++) {
		System.out.println(rand.nextDouble());
		System.out.println(randKedua.nextDouble());
		System.out.println("-------------------------\n");
	}
//		System.out.println(Math.ceil(Math.sin(x)));
		
	}
	
	
	public Main() {
		// TODO Auto-generated constructor stub
		
		
		
		section1();
		
		
//		strKeempat = strKeempat.concat(" " + "Dari Main");
//		strPertama = strPertama.concat(strKeempat);
//		System.out.println(strPertama);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main namaVariable = new Main();
		
	}

}
