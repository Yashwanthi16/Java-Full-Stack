package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class usingTryLock {

	//this apporocah of try lock avoids deadlock scenario as it proceeds with other non-blocking operations instead of waiting for the lock!!
	//try lock returns true if the lock is free and it is locking the shared resource. It returns false if it is already locked!!
	public static void main(String[] args) {
		
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
			//flagLock1 and flagLock2 are used to hold the value returned by trylock
			//doneFlag1 and doneFlag2 is used to hold the boolean value of whether the lock is unlocked or not!!
				
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				
				//we are using an infinite while loop to keep trying for lock using tryLock!!
				
				while (true) {
					try {
				//we need to use the if block for tryLock because when we keep on using tryLock then the system crashes!!		
				//if we put in this if block then if it is locked
						if (!flagLock1) {
							flagLock1 = lock1.tryLock();
						}
						if (!flagLock2) {
							flagLock2 = lock2.tryLock();
						}
						
				
					} finally {
						if (flagLock1 && !doneFlag1) {
							//if lock1 is acquired then this opeartion is performed and then lock is unlocked!!
							//doneflag hs to be updated to true!!
							System.out.println("Inside thread1 on lock 1");
							lock1.unlock();
							doneFlag1 = true;
						}
						if (flagLock2 && !doneFlag2) {
							System.out.println("Inside thread1 on lock 2");
							lock2.unlock();
							doneFlag2 = true;
						}
						
						//both the locks have been acquired and operations are performed successfully, so we break the loop and end the thread!!
						//remember that we are not using if-else if, we are only using if statements!!
						if (flagLock1 && flagLock2) {
							break;
						}

					}
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while (true) {
					try {

						if (!flagLock1) {
							flagLock1 = lock1.tryLock();
						}
						if (!flagLock2) {
							flagLock2 = lock2.tryLock();
						}


					} finally {
						if (flagLock1 && !doneFlag1) {
							System.out.println("Inside thread2 on lock 1");
							lock1.unlock();
							doneFlag1 = true;
						}
						if (flagLock2 && !doneFlag2) {
							System.out.println("Inside thread2 on lock 2");
							lock2.unlock();
							doneFlag2 = true;
						}
						if (flagLock1 && flagLock2) {
							break;
						}

					}
				}
			}
		});
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Inside main method");

	}

}
