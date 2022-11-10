package Map;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	
	public void printMap(Map<Integer, String> map) {
		for(Map.Entry <Integer, String> m: map.entrySet()) {
			System.out.println("Key is: " + m.getKey() + ", Value is: " + m.getValue());
		}
	}
	
	public void iterateMap(Map<Integer, String> map) {
		
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator(); 
		
		while(itr.hasNext())
		{
			//this temp variable is used to store itr.next() so that it doesn't skip any entries whie printing
			//try itr.next().getKey() instead of temp and run.
			//it skips some entries because itr.next() is itself an object so calling it twice in every iteration like once for getKey and net for getValue skips entries.
			
			Entry<Integer, String> temp = itr.next();
			System.out.println("Key is: " + temp.getKey() + ", Value is: " + temp.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"Yash");
		map.put(2, "Sravanthi");
		map.put(3, "Adi");
		map.put(4, "Sumedha");
		map.put(5, "Shiva");
		
		Demo app = new Demo();
		app.printMap(map);
		System.out.println("-----------------------");
		app.iterateMap(map);
	}

}
