package pert6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public void Throwable() throws ArithmeticException {
		while (true) {
			System.out.println("Please input 2 number");
			try {
				System.out.println("Number 1");
				double d1 = sc.nextDouble(); sc.nextLine();
				System.out.println("Number 2");
				double d2 = sc.nextDouble(); sc.nextLine();
				double result = d1 / d2;
				
				if (result == ((double)1/0)) {
					ArithmeticException ae = new ArithmeticException("Zero Division is not allowed");
					throw ae;
				}
				
				System.out.println("Result adalah " + result);
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Tolong masukan angka");
				sc.nextLine();
			} 
		}
		
	}
	
	public void trycatch() {
		int angka1 = 0;
		int angka2 = 0;
		double result = 0;
		
		
		/*
		 * kemungkinan ada 2 error, 
		 * 1. inputmissmatch
		 * 2. arithmatic
		 * 
		 * merupakan child dari exception class.
		 */
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			angka1 = sc.nextInt(); sc.nextLine();
			angka2 = sc.nextInt(); sc.nextLine();
			
			result = ((double)angka1/angka2);
			
			
			double inf = 1/0;
			if (result == inf) {
				new ArithmeticException();
			}
			
		} catch (InputMismatchException inputmiss) {
			// TODO: handle exception
			System.out.println("Error ketika menginput data, pastikan adalah angka");
			result = -1;
		} catch (ArithmeticException Ae) {
			// TODO: handle exception
			System.out.println("Tidak bisa di bagi dengan 0");
//			System.out.println(Ae.getMessage());
		} finally {
			System.out.println("Result nya adalah " + result);
			
			Scanner sc2 = new Scanner(System.in);
			try {
				String areYouAdmin = sc2.next(); sc2.nextLine();
				if (areYouAdmin.equalsIgnoreCase("Yes")) {
					System.out.println("Welcome");
				} else System.out.println("you aren't authorized");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			sc2.close();
		}
	}
	
	public Main() {
		// TODO Auto-generated constructor stub		
		Throwable();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		try {
			m.Throwable();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			m.Throwable();
		}
	}

}
