

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation();
		new Producer(op);
		new Consumer(op);
	}

}
