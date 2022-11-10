package Polymorphism;

public class Nokia extends Phone {

	public Nokia(String model) {
		super(model);
	}

	@Override
	public String toString() {
		return "Nokia [Model= " + getModel() + "]";
	}
	
}
