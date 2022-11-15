package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data1 {
	private String name;

	public Data1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

}

public class Application3
{

	public static void main(String[] args) {
		List<Data1> list = new ArrayList<>();
		list.add(new Data1("Chaand"));
		list.add(new Data1("Ed"));
		list.add(new Data1("Angelica"));
		list.add(new Data1("Maqbul"));
		list.add(new Data1("John"));

		/*

		This is the general way to sort user-defined objects.
		We use the object of Comparator Interface and override the compare method
		Collections.sort(list, new Comparator<Data>() {
		@Override public int compare(Data o1, Data o2) { return
		o1.getName().compareTo(o2.getName()); } });
		
		*/
		//when you write new Comparator()<Data>{ } Automatically suggestion comes to override the compare method
		//since compare method takes two parameter inputs we need to use a parameterised lambda expression!!

		Collections.sort(list, (Data1 o1, Data1 o2) -> {
			if(o1.getName().length() < o2.getName().length()){
				return -1;
			}else if(o1.getName().length() > o2.getName().length()){
				return 1;
			}else{
				return 0;
			}
		});

		for (Data1 data : list) {
			System.out.println(data.getName());
		}

	}
}
