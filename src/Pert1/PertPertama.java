package Pert1;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class PertPertama {
	int testingGlobal;
	public static void main(String[] args) {
//		String namaSaya = "Elvin Sestomi";
//		namaSaya = namaSaya + " Umur 20";
//		namaSaya += " Umur 20"; 
//		Integer angkaPertama = new Integer(10_000);
//		
//		int x = angkaPertama + 10000; // bisa  + - * / %
//		int modulo = angkaPertama % 3000;
//		float pecahanFloat = 2.021421412F;
//		double doublePertama = 3.01231312312124124;
//		boolean booleanPertama = true;
//		
//		System.out.println(namaSaya);
//		System.out.println(Double.valueOf((pecahanFloat + doublePertama)).getClass());
//		System.out.println(doublePertama);
//		System.out.println(booleanPertama);
//		
//		System.out.println(angkaPertama.getClass());
//		System.out.println(modulo);
//		System.out.println("HELLOW WORLD");
//		System.out.printf("%s ", namaSaya);
//		System.out.println("Selamat sore");
		
		
		int x = 1;
////		
//		System.out.println("x adalah " + x); // ctrl + alt + arrow
//		
//		System.out.println("x adalah" + x++ ); // ctrl + alt + arrow
//		x = x+1;
//		x = x+1;
//		System.out.println("x adalah " + ++x + " || " + --x);
//		System.out.println(x);
		
//		x = 4;
////		? :
////		x = () ? value1 : value2; equivalent ke if else;
//		
//		String y = ((x == 4) ? 4 : 5) == 5  ? "Ini adalah 5" : "ini bukan 5";
//		System.out.println(x);
//		System.out.println(y);
//		if (++x == 4) {
//			System.out.println("INI adalah 4 dari pre inc");
//		} else if (x != 5){
//			System.out.println("Ini dari else if");
//		} else {
//			System.out.println("ini dari Else");
//		}
//
//		if (x++ == 5) {
//			System.out.println("INI adalah 4 dari post inc");
//		}
//		x = 4;
//		
//		if(x == 4) {
//			x = 4;
//			if (x == 5) {
//				y = "ini adalah 5";
//			} else {
//				y = "ini bukan 5 dari if else";
//			}
//		}
//		System.out.println(y);
//		
//		x = 5;
//		
//		if(true) {
//			System.out.println("ini true");
//		}
//		
//		switch (x) {
//		case 4 :
//			System.out.println("ini adalah 4");
//			break;
//			
//		case 5 :
//			System.out.println("ini adalah 5");
//			break;
//		default:
//			System.out.println("X BUKAN 4 DAN BUKAN 5 JUGA");
//			break;
//		}
		x = 4;
		while(x==0) {
			System.out.println("ini masih true");System.out.println(x);
			++x;
			if(x == 8) {
				break;
			} else if (x == 5) {
				System.out.println("ini masuk");
				continue;
			}
			
		}
		
		for (int i = 0; i >= 5; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			
		}
		int i = 0;
		do {
			System.out.println("ini jalan");  
			i++;
			System.out.println(i);
			if (i == 5) {
				break;
			}
		} while (i != 0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input nama anda");
		String nama;
		nama = sc.nextLine();
		int umur = sc.nextInt(); sc.nextLine();
		int angkakedua = sc.nextInt();
		System.out.println(nama);
		System.out.println(umur);
		System.out.println(angkakedua);
		
		
	}
	
	
	
	
//	for, while, do while;
	
}
