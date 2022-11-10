package Inheritance;

import java.util.LinkedList;
import java.util.List;

public class tester {

	public tester() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String musicSystem, String seatBelt, String aC, String engine, int wheels, int seats
		Vehicle alto = new Car("JBL","locked", "on", "on",4,5);
		Vehicle maruti = new Car("zebotronics","locked", "on", "on",4,5);
		Vehicle suzuki = new Car("boat","locked", "on", "on",4,5);
		Vehicle hyundai = new Car("b&o","locked", "on", "on",4,5);
		Vehicle benz = new Vehicle();
		
//		System.out.println("Engine: " + alto.getEngine());
//		System.out.println("AC: "+ alto.getAC());
//		System.out.println("Music System: " + alto.getMusicSystem());
//		System.out.println("Seat Belts: " + alto.getSeatBelt());
//		System.out.println("Number of seats: "+ alto.getSeats());
//		System.out.println("Number of wheels: "+ alto.getWheels());
		
//		System.out.println(alto);
		
		List<Vehicle> vehicles = new LinkedList<>();
		vehicles.add(alto);
		vehicles.add(maruti);
		vehicles.add(suzuki);
		vehicles.add(hyundai);
		vehicles.add(benz);
		
		for (Vehicle vehicle:vehicles) {
			System.out.println(vehicle);
		}
		
	}

}
