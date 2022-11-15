package LambdaExpression;

//this interface is a functional interface
interface Lambda{
	//this is an abstarct method
	public void demo(); 
}

public class Basics {

	public static void main(String[] args) {
		
		/*
		Anonymous class method:
		this is the usual method of creating an object for interfaces but we can simplify it using
		lambda expression: ()->
		
		Lambda lambda = new Lambda() {
			//override the demo method
		}
		 */
		
		 //lambda exp method
		Lambda lambda = ()->{
			System.out.println("Statement 1");
			System.out.println("Statement 2");
		};
		lambda.demo();
		
	}
}

