package Inheritance;

public class Vehicle {

	private String Engine;
	private int Wheels;
	private int Seats;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
		this.Engine = "off";
		this.Wheels = -1;
		this.Seats = -1;
	}

	public Vehicle(String engine, int wheels, int seats) {
		Engine = engine;
		Wheels = wheels;
		Seats = seats;
	}

	public String getEngine() {
		return Engine;
	}

	public int getWheels() {
		return Wheels;
	}

	public int getSeats() {
		return Seats;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

	public void setWheels(int wheels) {
		Wheels = wheels;
	}

	public void setSeats(int seats) {
		Seats = seats;
	}

	@Override
	public String toString() {
		return "Vehicle [Engine= " + Engine + ", Wheels= " + Wheels + ", Seats= " + Seats + "]";
	}
	
}
