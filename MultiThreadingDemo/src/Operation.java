

public class Operation {

	int num;
	boolean valueSet = false;
	//because in the very beginning value needs to be set
	
	public synchronized void put(int i) {
		while(valueSet)
		{
			//if value is set then wait for the consumer thread to finish consuming the value
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//but if value is not set, then we are setting it and updating the valueSet value
		System.out.println("Put:" + i);
		this.num = i;
		valueSet= true;
		notify();
		
	}
	
	public synchronized void get() {
		while(!valueSet)
		{
			//if value is not set then wait for the producer thread to finish setting the value
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//but if value is set, then we are setting it and updating the valueSet value
		System.out.println("Get:" + num);
		valueSet = false;
		notify();
		
	}

}
