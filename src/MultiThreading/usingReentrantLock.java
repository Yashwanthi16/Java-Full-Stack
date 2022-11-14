package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class usingReentrantLock {
	
	static int counter = 0;
	static Lock lock = new ReentrantLock();
	static Lock lock2 = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(new Runnable() {

		//a lock by the name "lock" is being applied to the run() method of both the threads
		//so when the threads are started then all the threads with the same lock name will be synchronised!!
	
			@Override
			public void run() {
				lock.lock();
				try {
					for (int i = 1; i <= 1000; i++) {
						usingReentrantLock.counter++;
					}
				} finally {
					lock.unlock();
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				lock.lock();
				//try with lock2 instead of lock, the results are inconsistent!!
				//lock2.lock();
				try {
					for (int i = 1; i <= 1000; i++) {
						usingReentrantLock.counter++;
					}
				} finally {
					//lock2.unlock();
					lock.unlock();
				}
			}

		});
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println("The final value of counter is " + usingReentrantLock.counter);

	}
}

