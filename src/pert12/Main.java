package pert12;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	static boolean interupt = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// thread main
		Thread t2 = new Thread("Thread ke 2") {
			public void run() {
				System.out.println("Ini dari thread ke 2");
				System.out.println("ini adalah thread : " + Thread.currentThread().getName());
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread ke dua for ke " + (i + 1));
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("thread is finished running for");
			};
		};
		
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		priority 1 - 10;
//		Paling rendah itu 1, paling tinggi 10, default dari thread = 5; (paling tinggi jalan dluan kalo ready to run)
		System.out.println("t2 Priority adalah " + t2.getPriority());
		t2.setPriority(10);
		System.out.println("t2 Priority adalah " + t2.getPriority());
		System.out.println("Thread 2 state : " + t2.getState());
		t2.start();
		System.out.println("INterupted : "+ Thread.interrupted());
		System.out.println("ini adalah thread : " + Thread.currentThread().getName());
		while (true) {
			if (t2.getState() == Thread.State.TERMINATED) {
				System.out.println("Thread is terminated");
				System.out.println("Thread 2 State : " + t2.getState());
				break;
			}
		}
		
		new t3("3").start();
		
		Runnable r = () -> {
			System.out.println("Ini dari thread : " + Thread.currentThread().getName());
			System.out.println("by runnable interface");
		};
		
		new Thread(r, "Thread ke 3").start();
		new Thread(r, "Thread ke 4").start();
		
		
		
		
	}

}
