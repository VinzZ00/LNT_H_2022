package pert8;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class pert8 {

	String userDir = System.getProperty("user.dir");
	
	public pert8() {
		// TODO Auto-generated constructor stub
//		createTestFile(); create file example
//		createDir(); Create dir Example
		
		File f = new File(userDir.concat("\\src\\testingDir\\TestingWriter"));
		
//		listFileInDir(f.getParentFile()); //list File in Dir Example
//		WriteIntoFile(f); //write ke dalam file
		
		readFile(f);
		
		
		
	}
	
	
	public void readFile(File f) {
		if (f.exists()) {
			Scanner fsc = null;
			try {
				fsc = new Scanner(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ArrayList<String> temp = new ArrayList<String>();
		
			while (fsc.hasNextLine()) {
				temp.add(fsc.nextLine());
			}
			
			
			
			for (String string : temp) {
				System.out.println(string);
			}
			
			temp.add("Penambahan");
			
			FileWriter fw = null;
			try {
				fw = new FileWriter(f);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			for (String string : temp) {
				try {
					fw.write(string.concat("\n"));
					fw.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			WriteIntoFile(f);
			readFile(f);
		}

	}
	
	public void WriteIntoFile(File f) {
		if (f.exists()) {
			FileWriter fw = null;
			try {
				fw = new FileWriter(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fw.write("Elvin Sestomi\nSebastian\nHowen\nNadia\n\n");
				fw.flush(); // Setelah ini fw masih bisa di pakai
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				fw.write("After Flush nnt akan di flush lagi Probably dan akan di close");
				fw.close(); // Setelah ini fw tidak bisa lagi dipakai
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
//				FileWriter fw2 = new FileWriter(f);
//				fw2.write("Write ketiga");
//				fw2.close();
				
				fw.write("Write Ketiga");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error = " + e.getMessage());
			}
			
		} else {
			try {
				if (f.createNewFile())
					System.out.println("File Dibuat");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WriteIntoFile(f);
		}
	}
	
	public void listFileInDir(File directory) {
		if (!directory.exists()) {
			System.out.println("Filenya tidak ada di tempat");
		} else {
			String[] listFile = directory.list();
			File[] Files = directory.listFiles();
			
			System.out.println("file tersedia antara lain : ");
			int idx = 1;
			for (String string : listFile) {
				System.out.printf("%d. %s\n",idx++,string);
			}
		}
	}
	
	public void createDir() {
		File dir = new File(userDir.concat("\\src\\testingDir"));
		
		if (dir.mkdir()) 
			System.out.println("Directory berhasil dibuat");
		else
			System.out.println("Directory sudah Exist");
		
		for (int i = 0; i < 10; i++) {
			try {
				File f = new File(dir.getCanonicalPath(), String.format("File %d.txt", i));
				
				if (f.createNewFile()) {
					System.out.printf("File %s telah berhasil di buat\n", f.getName());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void createTestFile() {
//		Kalo di java '\' itu dianggep sebagai sebuah escape sequence jdi untuk escape '\' kita harus memasukan seperti ini '\\'
//		Current working directory -> parent directory dimana file .java sekarang tempat kalian ngoding berada
		
		
		System.out.println("current Working Dir is " + userDir);
		File f = new File(userDir.concat("\\src\\pert8"), "File1");
		try {
			System.out.println(f.getCanonicalPath() + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (true) {
			if (!f.exists()) {
				System.out.println("File tidak exist (tidak ada)");
				try {
					if (f.createNewFile()) {
						System.out.println("File berhasil di buat");
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("File exist (ada)");
				break;
			} 
		}
	}
	
	public static void main(String[] args) {
		new pert8();
	}

}
