package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Movies implements Comparable{
	
	private String director;

	public Movies(String director) {
		this.director = director;
	}
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Movies [director= " + director + "]";
	}

	@Override
	//.compareTo methdod must return -1, 1 or 0 which is used while sorting  
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return director.compareTo(((Movies) o).getDirector());
	}

	@Override
	public int hashCode() {
		return Objects.hash(director);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movies))
			return false;
		Movies other = (Movies) obj;
		return Objects.equals(director, other.director);
	}
	
}

public class ObjectsAsKeys {
	
	//generic method to pront all types of maps
	public <K,V> void printMap(Map<K,V> map) {
		for(Map.Entry <K, V> m: map.entrySet()) {
			System.out.println("Key is: " + m.getKey() + ", Value is: " + m.getValue());
		}
	}
	
	public static void main(String[] args) {
		Map<String ,String> map = new HashMap<>();
		map.put("S S Rajamouli","RRR" );
		map.put("V V Vinayak","Shivaji" );
		map.put("Shankar","Robo" );
		map.put("Puri Jagannath","Liger" );
		map.put("Puri Jagannath","Idiot" );
		
		ObjectsAsKeys app = new ObjectsAsKeys();
		app.printMap(map);
		System.out.println("----------------");
		
		//Now objects as keys!!
		//Map<Movies,String> map2 = new HashMap<>();
		//we can't use HashMap or LinkedHashMap as we can see that it doesn't identify unique keys(it allows dupicates as well)
		Map<Movies,String> map2 = new TreeMap<>();
		//tree map can't compare keys if they are user defined objects so we need to implement comparable 
		//Also tree map is best when we want to have unique keys when keys are user defines objects!!
		
		map2.put(new Movies("S S Rajamouli"),"RRR" );
		map2.put(new Movies("S S Rajamouli"),"Eega" );
		map2.put(new Movies("V V Vinayak"),"Shivaji" );
		map2.put(new Movies("Shankar"),"Robo" );
		map2.put(new Movies("Puri Jagannath"),"Liger" );
		map2.put(new Movies("Puri Jagannath"),"Idiot" );
		map2.put(new Movies("S S Rajamouli"),"Eega" );
		
		app.printMap(map2);	
		
		//hashcode and .equals methods
		//Case1: For Strings
		System.out.println("----------------string hashcode and .equals()--------------------");
		String str1 = new String("Yashu");
		String str2 = new String("Yashu");
		System.out.println(str1.hashCode() + " " + str2.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println("----------------userdefined class hashcode and .equals()--------------------");
		Movies m1 = new Movies("S S Rajamouli");
		Movies m2 = new Movies("S S Rajamouli");
		System.out.println(m1.hashCode() + " " + m2.hashCode());
		System.out.println(m1.equals(m2));
		
		//here we can see that for strings the hashcodes we same for exactly identical objects. So .equals() gave a right output.
		//but for our user defined class we get wrong output. So we need to ibverride hashcode and .equals() in the class for good result.
		

		
	}

}
