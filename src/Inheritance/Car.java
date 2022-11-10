package Inheritance;

public class Car extends Vehicle {
	private String MusicSystem;
	private String SeatBelt;
	private String AC;
	
	public Car() {
		MusicSystem = "";
		SeatBelt = "";
		AC = "";
	}

	public Car(String musicSystem, String seatBelt, String aC) {
		//super();
		MusicSystem = musicSystem;
		SeatBelt = seatBelt;
		AC = aC;
	}
	public Car(String musicSystem, String seatBelt, String aC, String engine, int wheels, int seats) {
		super(engine,wheels, seats);
		//this is a call to parameterised constructor of parent class
		MusicSystem = musicSystem;
		SeatBelt = seatBelt;
		AC = aC;
	}

	public String getMusicSystem() {
		return MusicSystem;
	}

	public void setMusicSystem(String musicSystem) {
		MusicSystem = musicSystem;
	}

	public String getSeatBelt() {
		return SeatBelt;
	}

	public void setSeatBelt(String seatBelt) {
		SeatBelt = seatBelt;
	}

	public String getAC() {
		return AC;
	}

	public void setAC(String aC) {
		AC = aC;
	}

	@Override
	public String toString() {
		return "Car [getMusicSystem()=" + getMusicSystem() + ", getSeatBelt()=" + getSeatBelt() + ", getAC()=" + getAC()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + "]";
	}
	

}
