package OOPS;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	
	public Car() {
		this.doors = "closed";
		this.engine = "off";
		this.driver = "absent";
	}
	
	public Car(String doors, String engine, String driver) {
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
	}
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("present")) {
			return "running";
		}
		else
			return "not running";
	}
}
