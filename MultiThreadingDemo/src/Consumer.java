

//this is the consumer thread, so it implements runnable interface
public class Consumer implements Runnable{
	Operation op;

	public Consumer(Operation op) {
		this.op = op;
		
		//starting the thread
		//this obj and we named it as consumer
		Thread t2 = new Thread(this,"Consumer");
		t2.start();
	}

	@Override
	public void run() {
		int i=1;
		while(i<=10) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			op.get();
			i++;
		}
	}
	
}
