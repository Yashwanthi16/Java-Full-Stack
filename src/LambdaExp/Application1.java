package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

class Data{
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}
	
}

public class Application1 {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Chaand"));
		list.add(new Data("John"));
		list.add(new Data("Mia"));
		list.add(new Data("Angelica"));
		list.add(new Data("Roy"));
	
		//application of lambda exp on forEach loop.
		//temp is the temporary object that will be traversing in the list
	    list.forEach(temp->{
	    	System.out.println(temp.getName());
	    });
		
		
		
	}

}
