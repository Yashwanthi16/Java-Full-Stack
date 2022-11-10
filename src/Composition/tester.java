package Composition;

public class tester {

	public tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lappy = new Laptop();
		//this is the way to access the method of object inside object
		System.out.println(lappy.getGraphicsCard().getBrand());
		
		// passing objects of those present inside laptop
		Processor processor = new Processor("intel", "7200U",7, 5, 8,"11MB","4 GHz");
		GraphicsCard graphicsCard = new GraphicsCard("nvidia", 5, "4 GB");
		
		Laptop gamingLappy = new Laptop("FHD","6GB", processor, "2 TB", graphicsCard, null, "backlit");
		System.out.println(gamingLappy);
	}

}
