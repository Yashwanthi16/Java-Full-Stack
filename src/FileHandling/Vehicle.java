package FileHandling;

import java.io.Serializable;

public class Vehicle implements Serializable {
	//serializable interface has to be implemented by the class whose objects are being read from/written into files
	//this serial version UID is needed for proper casting of objects while reading!!
	private static final long serialVersionUID = 7832936175930005582L;
	private String type;
	private int number;

	public Vehicle(String type, int number) {
		this.type = type;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}
}


