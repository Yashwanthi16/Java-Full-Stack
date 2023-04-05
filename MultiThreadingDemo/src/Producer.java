

//this is the producer thread, so it implements runnable interface
public class Producer implements Runnable{

	Operation op;
	
	public Producer(Operation op) {
		this.op = op;
		
		//starting the thread
		Thread t1 = new Thread(this,"Producer");
		t1.start();
	}

	@Override
	public void run() {
		int i=1;
		while(i<=10) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			op.put(i++);
		}
	}

}
