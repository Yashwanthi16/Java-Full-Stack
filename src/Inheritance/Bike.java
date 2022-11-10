package Inheritance;

public class Bike extends Vehicle {
	private String Handle;
	
	public Bike() {
		this.Handle = "";
	}
	public Bike(String handle) {
		//super();
		Handle = handle;
	}
	public Bike(String handle,String engine, int wheels, int seats) {
		super(engine, wheels, seats);
		Handle = handle;
	}
	
	public String getHandle() {
		return Handle;
	}
	public void setHandle(String handle) {
		Handle = handle;
	}
	@Override
	public String toString() {
		return "Bike [getHandle()=" + getHandle() + ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + "]";
	}
	
}
