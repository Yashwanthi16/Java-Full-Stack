package Multithreading;

//here we see the use of wait(), notify(), notfyAll(), interrupt() methods!!

public class someMethods {

	static public int balance = 0;
	
	public void withdraw(int amount){
		synchronized (this){
		if(balance <= 0){
			try {
				System.out.println("Waiting for balance updation");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Thread has been interrupted!");
				//e.printStackTrace();
				}
			}
		}
		balance = balance - amount;
		System.out.println("Withdrawal successful and the current balance is: "+balance);
	}
	public void deposit(int amount){
		System.out.println("We are deposting the amount");
		balance = balance + amount;
		synchronized (this){
		 notify();
		}
	}
	
	public static void main(String[] args) {
		someMethods app = new someMethods();
		someMethods app2 = new someMethods();

		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				app.withdraw(1000);
				
			}
		});
		//to give name to the thread
		thread1.setName("Thread1");
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deposit(2000);
				//thread1.interrupt();
				//(uncomment this and comment notify to check interrupt() functioning!!)
			}
		});
		thread2.setName("Thread");
		thread2.start();
		

//wait and notify() methods are object specific. That means, 
//here if we use app2.deposit instead of app.deposit,then wait is not interrupted!!) it will keep on waiting till notify is called using same object!!
//comment the previous thread 2 and try this!!
		/*
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app2.deposit(2000);
				//thread1.interrupt();
				//(comment this out and uncomment notify to check its functioning!!)
			}
		});
		thread2.setName("Thread");
		thread2.start();
		 */
	}
	
	//but interrupt doean't work like that. It is not object specific. We can clear the waiting state of the previous 
	//thread i.e thread1 using thread1.interrupt()..
	//comment the previous thread 2 and try this!!
	
}
