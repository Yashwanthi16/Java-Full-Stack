package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeObject {

	public writeObject() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 9444);
		Vehicle car = new Vehicle("Car", 4268);
		
		//the exceptions thrown by inner try blocks can be caught by outer catch blocks
		//this is "try with resources" technique of creating objects of IOstreams--> i.e try with resources inside ();
		//this helps us avoid the close statements
		
		try(FileOutputStream fos = new FileOutputStream("F:\\java\\OOPS\\src\\FileHandling\\fourth.txt")){
			try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written onto the file");
			//it will not be in readable format!!
			}

		} catch (FileNotFoundException e) {
			System.out.println("ileNotFoundException");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}
	}
}
