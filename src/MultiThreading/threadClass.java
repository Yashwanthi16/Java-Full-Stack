package Multithreading;

public class threadClass extends Thread{
		private int threadNo;

		public threadClass(int threadNo) {
			this.threadNo = threadNo;
		}
		
		
	//override the run method
		@Override
		public void run() {
			countMe();
		}
		
		public void countMe(){
			
			//Thread.sleep() or sleep must be surrounded by try-catch block!!
			for(int i=1; i<=9;i++){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
			}
		}

		public static void main(String[] args) throws InterruptedException {
		
			//create an object of this class, override the run method, start the thread.
			threadClass counter1 = new threadClass(1);
			threadClass counter2 = new threadClass(2);
			
		    long startTime = System.currentTimeMillis();
			counter1.start(); //Run should be called by JVM
			System.out.println("**************************");
			counter1.join();
			counter2.start(); //Run should be called by JVM
			counter2.join();
			long endTime = System.currentTimeMillis();			
			System.out.println("Total time required to process: "+(endTime-startTime));
		}

}
