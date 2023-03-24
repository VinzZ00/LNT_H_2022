package pert12;

public class t3 extends Thread {

	public t3(String nama) {
		// TODO Auto-generated constructor stub
		super(nama);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ini dari thread ke -" + this.getName() );
		for (int i = 0; i < 10; i++) {
			System.out.println("thread ke 3 no ke " + i);
		}
	}

}
