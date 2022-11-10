package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class tester {

	public tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Samsung note5 = new Samsung("Note 5");
		//note5.features();
		
		Nokia plus= new Nokia("Plus");
		//plus.features();
		
		//if we have polymorphism then i.e same method in both parent and
		//child class then it is better to create objects as shown below
		
		Phone note8 = new Samsung("Note 8");
		//note8.features();
		
		//parent_class obj_name = new childclass_ctor (it is a CHILD OBJECT OF PARENT TYPE)
		//this helps in dynamic selection of methods that are common in both parent 
		//and child class like features() method here.
		//if there is features method in child class also, then the priority is given to 
		//features() method of child class.
		
		Phone Nokiapro = new Nokia("Nokia Pro");
		//Nokiapro.features();
		
		Phone samsungM31 = new Samsung("samsungM31");
		Phone samsungM31s = new Samsung("samsungM31s");
		Phone Nokia5G = new Nokia("Nokia5G");
		
		//an array of phones is created below
		List<Phone> phones = new ArrayList<>();
		phones.add(note8);
		phones.add(samsungM31s);
		phones.add(samsungM31);
		phones.add(Nokia5G);
		phones.add(Nokiapro);
		
		for(Phone p : phones) {
			System.out.println(p);
		}
		
		
		
	}

}
