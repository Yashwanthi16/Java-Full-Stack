 package Multithreading;

public class usingSynchronisation  {
	
	//just giving a name to lock to be used in synchronised block instead of "this"
	private Object lock = "lock";
	
	//we can make the code more time efficient if we use sync block instead of sync method!!
	//note that in either case, obj has to be same for synchronisaiton to work
	//or tackle this issue with static synchronisation
	 
	public void generate()
	 {		 
		synchronized (lock) {
			for(int i=1; i<=10; i++){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i<=5){
					System.out.print("[");
				}else{
					System.out.print("]");
				}
		}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		//for synchronisation to work 
		
		usingSynchronisation obj = new usingSynchronisation();
		//usingSynchronisation obj2 = new usingSynchronisation();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=1; i<=5; i++){
				 obj.generate();
				}
				long endtTime = System.currentTimeMillis();
				System.out.println("Time required for thread 1 was:"+(endtTime-startTime));
			}
		}).start();
		
       new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=1; i<=5; i++){
				 obj.generate();
				}
				long endtTime = System.currentTimeMillis();
				System.out.println("Time required for thread 2 was:"+(endtTime-startTime));
			}
		}).start();

	}

}
