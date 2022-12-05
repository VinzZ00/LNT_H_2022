package Pert3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

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
	
	private Vector initVect(Vector<?> Vect) {
		Vector<Integer> returnVect  = (Vector<Integer>) Vect;
//		Kesimpulan kalo misal vector kosong, itu masih bisa di parse, tp kalo udh terisi itu udh gaa bisa
//		returnVect.add(12);
		return returnVect;
	}
	
	/** 
	 * Array list Mirip dengan Vector, sama" Array dinamis, namun arraylist mendukung multiTasking / multiThread, Arraylist itu tambahin size 1/2 dari size (lebih kecil dari Vector) cocok untuk digunakan di device yang memiliki limitasi pada ruang storage.
	 * vector itu tambahin dengan besar sizenya sendiri
	 * 
	 * Array list itu mendukung Multi Threading, ini membuat dia menjadi cepat tp kurang aman, inkonsistensi mungkin terjadi, contoh user a lagi update, dalam waktu bersamaan user b lagi read data., nah data yang mana yang akan di read.
	 * 
	 * 
	 */
	
	private void arraylist() {
		ArrayList<String> arrList = new ArrayList<>();
//		arrList.__ itu sama dengan vector cuma berbeda di performanya doang seperti yg dijelasin
	}
	
	private void DinamisArray() {
		Vector<String> vecNama = new Vector<String>();
		
		//Testing deklarasi
//		Vector<String> initVect = initVect(new Vector<String>());
//		System.out.println(initVect.add("12"));
//		System.out.println(initVect.get(0).getClass());
		
		vecNama.add("Elvin");
		vecNama.add("Alfred");
		
		System.out.println(vecNama);
		System.out.println(vecNama.contains("Alfred"));
		System.out.println(vecNama.get(1));
//		System.out.println(vecNama.remove("Elvin"));
		System.out.println(vecNama);
		System.out.println(vecNama.size());
//		vecNama.clear();
		System.out.println(vecNama.size());
		
		
		int i = 1;
		for (String string : vecNama) {
			System.out.printf("Nama ke %d adalah %s\n",i++, string);
		}
		
		System.out.println("ini dari Itterator");
		
		Iterator<String> itt = vecNama.iterator();
		while (itt.hasNext()) {
			System.out.println(itt.next());
		}
		
//		vecNama.clear();
		
		if (vecNama.isEmpty()) {
			System.out.println("Size VecNama adalah " + vecNama.size());
		} else {
			System.out.println("ini gaa kosong, sizenya adalah " + vecNama.size());
		}
		
	}
	
	private void batasanStatic() {
		String[] anggota = new String[2];
		anggota[0] = "Joni";
		anggota[1] = "Jason";
//		ini Jika di jalankan akan raise error index Out of bound;
//		Kenapa?, karena ini array static, sizenya gaa akan pernah berubah. tidak bisa ditambahin, maupun di kurangin,
//		anggota[2] = "Dodi";
		
//		anggota[0] = null;
//		int lenghtnull = anggota[0].length();
//		Error Handling untuk null pointer exception
		
		System.out.println(anggota.length);
		
		
		for (String string : anggota) {
			System.out.println(string);
		}
	}
	
	private void NestedArr() {
		// Nested Array or multiDimensi Array
				String[][] NestedArray = {{"a", "a"}, {"a","b"}, {"a","c"}};
				int idx = 1;
				for (String[] strings : NestedArray) {
					System.out.print("Baris ke " + (idx++) + " ");
					for (String strings2 : strings) {
						System.out.print(strings2);
					} System.out.println();
				}
				
				NestedArray = new String[26][26];
	}
	
	private void  arrayStatis() {
		// Array yang dideklarasi dan di inisialisasi namun belum di masukin sebuah angka maka default dari arraynya adalah 0
		int[] arrInt = new int[5];
		arrInt[0] = 1; 
		arrInt[2] = 2;
		System.out.println(arrInt); // Alamat [I@alamatArray 
		int[] arrKedua = {12,0,5,2,3,6};
		
		int[] arrKetiga = arrKedua;
		
		arrKetiga[1] = 1;  
		
//		array untuk membuat index 1 - 100;
		System.out.printf("Alamat arrkedua == %s, dan arrayketiga == %s\n", arrKedua, arrKetiga);
		System.out.println("array ke dua");
//		    Variable    Array
		for (int i : arrKedua) {
			System.out.print(i  + ", ");
		}
		System.out.println();
		int[] ArrayInd = new int[100];
		
		for (int i = 0; i < ArrayInd.length; i++) {
			ArrayInd[i] = i + 1;
		}		
	
		
		//Pake For each (enhanced for)
//		for (int i : ArrayInd) {
//			System.out.println(i);
//		}
		
		// Pake For biasa untuk melakukan Output
		for (int i = 0; i < arrInt.length; i++) {
			System.out.print(arrInt[i] + ", ");
		}
		
//		System.out.println(arrInt[1]);
	}
	
//	Perkenalan ke Array statis
	private void LastPert() {
		// TODO Auto-generated stub
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
	
	public Main() {
	}
	
	public static void main(String[] args) {
		new Main().DinamisArray();
	}

	
/**
 * Materi Hari ini 14 Nov 2022

Array

Array adalah sebuah kumpulan dari data yang sejenis

Contohnya kumpulan dari String, Integer, Boolean, Float, Double, Character dll


Array Ini itu nyimpen tipe data Wrapper ataupun primitive juga (hanya dianjurkan untuk statis dan hanya bisa di pake di tipe data Primitive saja, tidak bisa dipake di tipe data Object yang didefine) karena object sebenarnya tergolong ke wrapper.

1. Array Statis
Array size tetap, sejenis, mutable (bagian"nya bisa di ubah secara independent cth : huruf ke dua dari array of Char)

ditandakan dengan [], tipe data ini bisa di pake dengan wrapper class maupun primitive class.

sintak :
Array Integer :
int[] <<namaVariable>> = new Int[<<jumlahData>>];
(0,0,0,0,0)
int[] <<namaVariable>>; //Deklarasi doang
int[] <<namaVariable>> = {12,0,5,2,3,6};

Bisa juga untuk yg selain integer, String, boolean

2. Array Dinamis

Array yang bertambah panjangnya secara otomatis.
array exception yang bisa di raise itu juga termasuk arrayIndexOutOfBound() pada saat melakukan Get/Retrive data.

Codenya itu udh di modif sama Oraclenya predefined Library. Contohnya kayak Vector, Arraylist, List, dll source codenya bisa di cari di internet.

Dikarenakan ini adalah Object, maka harus melakukan object Instantiation. pake keyword new <<Constructor>>; hanya bisa di pake oleh Wrapper class.

Cara Declaration nya 
Vector<String> <<namaVar>> = new Vector<>();

method untuk manipulasi data ArrayDinamis
.get() // Retrieve
.set() // ganti
.remove() // hapus
.Clear() // hapus semua
.Size() // balikin size yang teroccupied
.add() // nambahin data
.contains() // mengecek apakah ada suatu data
.Iterator() // Cara lain looping selain looping biasa
.isempty() //Ngecek dia kosong apa ngaa?
coba perbedaan clear, dan remove All
hipotesis : clear sizenya masih tetap?



 */
}
