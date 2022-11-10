package Exception;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			someMethod();
		}
		catch (ArithmeticException e){
			System.out.println(" Arithmetic Exception encountered!! ");			
		}
		catch (Exception e){
			System.out.println(" Generic Exception encountered!! ");			
		}
		
	}
	public static void someMethod() {
		int result = 10/0;
	}
}
