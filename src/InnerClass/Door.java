package InnerClass;

public class Door {
	private Lock lock;
	
	public Door() {
		lock = new Lock(true); //by defaut setting the value as true
	}
	
	public class Lock{
		private boolean lock;
		public Lock(boolean lock) {
			this.lock = lock;
		}
		public boolean isLock() {
			return lock;
		}
		public void setLock(boolean lock) {
			this.lock = lock;
		}	
	}
	
	public Lock getLock() {
		return lock;
	}
	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("Shop is closed!!");
		}
		else {
			System.out.println("Shop is open!!");
		}
	}
}
