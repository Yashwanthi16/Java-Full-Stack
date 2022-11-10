package Polymorphism;

public class Samsung extends Phone {
	
	public Samsung(String model) {
		super(model);
	}
	
	public void features() {
		System.out.println("Android Flagship");
	}

	@Override
	public String toString() {
		return "Samsung [Model= " + getModel() + "]";
	}
	
}
