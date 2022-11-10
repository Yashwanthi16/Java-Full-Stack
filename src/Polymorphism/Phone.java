package Polymorphism;

public class Phone {
	
	private String model;
	
	public Phone(String model) {
		this.model =model;
	}

	public void features() {
		System.out.println("Feature Phone");
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Phone [Model= " + getModel() + "]";
	}
	
}
