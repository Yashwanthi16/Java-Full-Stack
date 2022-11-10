package Comparable;

//in order to sort the objects of user defined classes then we need to implement Comparable interface
public class Cars implements Comparable {
	private String model;
	private int yearOfManufacture;
	
	public Cars(String model,int year) {
		this.model = model;
		yearOfManufacture = year;
	}

	@Override
	//this obj is the another obj which is compared which is compared with current object
	public int compareTo(Object obj) {
		if(yearOfManufacture > ((Cars)obj).getYearOfManufacture()) {
			return 1;
		}
		else if (yearOfManufacture < ((Cars) obj).getYearOfManufacture())
			return -1;
		else
			return 0;
	}
	public String getModel() {
		return model;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	@Override
	public String toString() {
		return "[Model= " + getModel() + ", YearOfManufacture= " + getYearOfManufacture() + "]";
	}

	

}
