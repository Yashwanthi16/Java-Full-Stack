package Exception;
import java.util.*;
public class DemoWithThrow {

	public DemoWithThrow() {
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
		catch (UserDefinedException e){
			System.out.println(" UserDefined Exception encountered!! ");			
		}
		catch (Exception e){
			System.out.println(" Generic Exception encountered!! ");			
		}
		
	}
	public static void someMethod() throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter choice: ");
		int choice = in.nextInt();

		switch(choice) {
		case 1:
			throw new ArithmeticException();
		case 2:
			throw new UserDefinedException();
		default:
			throw new Exception();
		}
	}
}
