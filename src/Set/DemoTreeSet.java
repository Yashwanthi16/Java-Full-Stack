package Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>
{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key= " + key + ", value= " + value + "]";
	}
	
}

public class DemoTreeSet {

	public DemoTreeSet() {
		// TODO Auto-generated constructor stub
	}
	
//	Data<Integer, String> obj = new Data<Integer, String>(1, "Yashu");
	
	
	public static void main(String[] args) {
		
		//if we have string objects, by natural sorting mechanism TreeSort sorts the objects.
				Set<String> set = new TreeSet<>();
				
				set.add(new String("Yashu"));
				set.add(new String("Rubina"));
				set.add(new String("Isha"));
				set.add(new String("Smriti"));
				set.add(new String("Jemimah"));
				
				for(String s: set) {
					System.out.println(s);
				}
				
				// But if we have user defined objects in tree set the it can't sort.
				//Then we need to use Comparator to "CUSTOMISE SORTING" for out objects
				
				Comparator<Data<Integer,String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {

					@Override
					public int compare(Data<Integer,String> obj1, Data<Integer,String> obj2) {
						// TODO Auto-generated method stub
						if(obj1.getKey() < obj2.getKey()) {
							return -1;
						}
						else if(obj1.getKey() > obj2.getKey())
							return 1;
						else
							return 0;
					}
				};
				
				Comparator<Data<Integer,String>> COMPARE_VALUE_LENGTH = new Comparator<Data<Integer, String>>() {

					@Override
					public int compare(Data<Integer,String> obj1, Data<Integer,String> obj2) {
						// TODO Auto-generated method stub
						if(obj1.getValue().length() < obj2.getValue().length()) {
							return -1;
						}
						else if(obj1.getValue().length() > obj2.getValue().length())
							return 1;
						else
							return 0;
					}
				};
				
				//Set<Data<Integer,String>> set2 = new TreeSet<>(COMPARE_KEY);
				Set<Data<Integer,String>> set2 = new TreeSet<>(COMPARE_VALUE_LENGTH);
				set2.add(new Data<Integer,String>(1,"Yashu"));
				set2.add(new Data<Integer,String>(2,"Rubina"));
				set2.add(new Data<Integer,String>(3,"Isha"));
				set2.add(new Data<Integer,String>(4,"Sri"));
				set2.add(new Data<Integer,String>(5,"Jemimah"));
				
				System.out.println("----------------------");
				for(Data s: set2) {
					System.out.println(s);
				}
	}

}
