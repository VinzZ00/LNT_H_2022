package pert12;

public class multiThread {
	
	static int many;
	
	
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("Thread Main: " + main.isDaemon());
		
//		many = 10;
		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Running ke " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.setDaemon(true);
		System.out.println("Thread 1 : " + t1.isDaemon());
		
		// Daemon
//		many = 5;
		Thread t2 = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Running ke " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		System.out.println("Thread 2 : " + t2.isDaemon());
		
		t1.start();
		t2.start();
		
	}
}
