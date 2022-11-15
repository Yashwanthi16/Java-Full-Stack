package LambdaExpression;

public class Application2 {

	public static void main(String[] args) {
		/* anonymous-class technique of creating threads
			new Thread(new Runnable()){
				//override run() method
			}
		*/

		//in place of new Runnable() i.e the obj of Runnable() interface we use lambda expression ()->
	    new Thread(()->{			
			System.out.println("I am inside thread 1");
			System.out.println("This is line 2");
			}).start();;

	}
}
 