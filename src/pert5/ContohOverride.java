package pert5;

import ProductPert4.Product;
import pert4.Krupuk;
import pert5OutsidePackage.contohInterface;
import pert5OutsidePackage.interfaceKedua;

public class ContohOverride {

	public ContohOverride() {
		// TODO Auto-generated constructor stub
		implementation lateImp = new implementation();
		NeoImplementation neoImp = new NeoImplementation();
		
		System.out.println(lateImp.a);
		
		System.out.println("adisi 3 dan 2 adalah " + lateImp.operation(3, 2));
		
		// Anonymous Class
		
		int angka1 = 10;
		interfaceKedua operasi; 
		if (angka1 > 5) {
//			lambda expression
			
			interfaceKedua temp = (a, b) -> {
				return (int)(a / b);
			};
			operasi = temp;
		} else {
			operasi = new interfaceKedua() {
				
				@Override
				public int operation(double angka1, double angka2) {
					// TODO Auto-generated method stub
					return (int)(angka1 - angka2);
				}
			};
		}
		
		operasi(5, 2.5, operasi);
		
		System.out.println("\n====================\n");
		
		operasi(15,3 , operasi);
		
		
//		System.out.println("Pengurangan antara 5 dan 3 adalah " + pengurangan.operation(5, 3));
		
		lateImp.sayHello();
		neoImp.sayHello();
		
//		// anonymous Class
//		Krupuk krupukElvin = new Krupuk() {
//			@Override
//			public void isBaverage() {
//				// TODO Auto-generated method stub
//				System.out.println("Ini adalah krupuk nomor 1 di indonesia");
//			}
//		};
//		krupukElvin.setNama("krupuk elvin");
//		krupukElvin.isBaverage();
	}
	
	void methodBaru() {}
	
	void operasi(double angka1, double angka2, interfaceKedua jenisOperasi) {
		int hasil = jenisOperasi.operation(angka1, angka2);
		System.out.println("hasil operasi adalah " + hasil);
	}

	public static void main(String[] args) {
		new ContohOverride();
	}
}
//	path is seperated by '/' in java project, package, and class is seperated by '.'

class implementation implements pert5OutsidePackage.contohInterface, interfaceKedua {

//	Constructor method auto generated selama kita belom ada constructor custom
//	public implementation() {
//		
//	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
			System.out.println("Hello");
	}

	@Override
	public int operation(double angka1, double angka2) {
		// TODO Auto-generated method stub
		System.out.println("this is a addition operation ");
		return (int)  (angka1 + angka2);
	}
	
}

class NeoImplementation implements contohInterface {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("I am shy and don't wanna say hello");
	}
	
}
