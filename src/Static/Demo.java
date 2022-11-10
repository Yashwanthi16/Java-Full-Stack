package Static;

public class Demo {

	private static int count;
	private String name = "Yashwanthi";
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	
	private static void increaseCount() {
		count++;
	}
	private static void decreaseCount() {
		count--;
	}
	
	//accessing static method and variable inside non static method is possible
	public void performDecrement() {
		System.out.println("Before decrement: "+count);
		decreaseCount();
		System.out.println("After decrement: "+ count);
	}
	
	public void printName() {
		System.out.println("Name is: "+ name);
	}
	
	//can't access non static method inside static directly!!
	public static void performIncrement() {
		System.out.println("Before incremetn: "+count);
		increaseCount();
		System.out.println("After increment: "+count);	
		
		//way to access a non static method of a class inside static method of same class
		//is by creating the obj of its class
		Demo obj = new Demo();
		obj.printName();
	
	}
}
