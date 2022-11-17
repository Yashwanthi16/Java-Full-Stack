package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readObject {

	public readObject() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		try (FileInputStream FIO = new FileInputStream("F:\\java\\OOPS\\src\\FileHandling\\fourth.txt")) {
			try (ObjectInputStream obj = new ObjectInputStream(FIO)) {
				//when you are reading object then you need to cast it to the class needed
				Vehicle v1 = (Vehicle) obj.readObject();
				Vehicle v2 = (Vehicle) obj.readObject();
				System.out.println("Object 1: "+v1);
				System.out.println("Object 1: "+v2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
