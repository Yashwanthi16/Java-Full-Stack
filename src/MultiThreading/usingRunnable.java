package Multithreading;

import java.util.Random;

public class usingRunnable implements Runnable{
	private int threadNo;

	public usingRunnable(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();
		for(int i = 0;i<=9;i++){
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
		
	}

	public static void main(String[] args) {
		//this is one way of creating a thread for a class that implements runnable interface
		//we have used anonymous objec of the class here!!
	
		Thread thread1 = new Thread(new usingRunnable(1));
		Thread thread2 = new Thread(new usingRunnable(2));
		
		thread1.start();
		thread2.start();
		
	//Method 3:	
	//here we have created an anonymous thread with Runnable interface and directly overriden run method here
	   new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<10;i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
					System.out.println(i);
				}
				
			}
		}).start();
	}
}

