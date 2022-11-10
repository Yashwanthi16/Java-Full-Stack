package Comparable;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cars> cars = new LinkedList<>();
		cars.add(new Cars("Maruti",2001));
		cars.add(new Cars("Yamaha",2010));
		cars.add(new Cars("Suzuki",2020));
		cars.add(new Cars("Benz",2005));
		cars.add(new Cars("Hyundai",2000));
		
		Demo d = new Demo();
		d.printCollection(cars);
		
		Collections.sort(cars);
		
		System.out.println("******************");
		d.printCollection(cars);
		
		System.out.println("******************");
		
		Collections.sort(cars,Collections.reverseOrder());
		d.printCollection(cars);
		
		
	}
	public void printCollection(List<Cars> cars) {
		Iterator<Cars> i = cars.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
}
