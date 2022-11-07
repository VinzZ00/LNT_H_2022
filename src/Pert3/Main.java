package Pert3;

public class Main {
	
	/**
Catatan

Data type 
String
int, float, double, long, byte, short
boolean

Pre-defined method
String Maninpulation method 
method yang digunakan untuk manipulasi si string, 
String itu immutable (Tidak bisa diubah, melainkan harus di ganti)
contoh = Hello -> cuma ganti e menjadi a doang itu butuh

sintak
String string1 = "Hello";
string1 = "Hallo";
Setara dengan
object String
init object 
String string1 = new String("Hello");

String method terdiri dari 2 jenis method
yaitu 
Static dan non-static.

Inclusive dan exclusive
Inclusive => termasuk
Exclusive => tidak termasuk

String Hello = "Hello World";

Hello.substring(0, 5); => "Hello"

Hello.substring(1); => "ello World"

Math Manipulation method
	 */
	
	
	
//	Perkenalan ke Array statis
	public Main() {
		// TODO Auto-generated constructor stub
//		Apa itu array?
		/*
		 * Array adalah kumpulan dari berberapa data yang memiliki tipe data sejenis (Homogen)
		 * Array bisa di bikin untuk primitive maupun wrapper
		 * disimbolkan dengan []
		 * array merupakan tipe data mutable 
		 * array static tidak bisa bertambah sizenya 
		 */
//		                  0 1 2 3 4  5 6
		int[] arrAngka = {2,3,5,6,7,10,5}; //size nya adalah 7;
		char[] arrChar = new char[3];
		
		for (int i = 0; i < arrChar.length; i++) {
			arrChar[i] = 'a';
		}
		
		for (char c : arrChar) {
			System.out.println(c);
		}
		
		
		System.out.println(arrChar[3]);
//		arrChar[arrChar.length] = 'b';
		
		System.out.println(arrAngka); // -> return sebuah reference
		System.out.println(arrAngka[1]); // return angka yang ada pada index ke 1
		arrAngka[1] = 5; // ganti arrAngka pada index ke satu dari 3 menjadi 5
		
		System.out.println(arrAngka[1]); // return angka yang ada pada index ke 1
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
