package Composition;

public class Laptop {

	private String Screen;
	private String RAM;
	private Processor processor;
	private String HardDrive;
	private GraphicsCard graphicsCard;
	private String OpticalDrive;
	private String Keyboard;
	
	public Laptop() {
		Screen = "FHD";
		RAM = "DDR4";
		//BY DEFAULT WE ARE CREATIJNG AN ANONYMOUS OBJECT
		this.processor = new Processor();
		HardDrive = "500 GB";
		//BY DEFAULT WE ARE CREATIJNG AN ANONYMOUS OBJECT
		this.graphicsCard = new GraphicsCard();
		OpticalDrive = "Single Layer";
		Keyboard = "Standard";
	}

	public Laptop(String screen, String rAM, Processor processor, String hardDrive, GraphicsCard graphicsCard,
			String opticalDrive, String keyboard) {
		Screen = screen;
		RAM = rAM;
		this.processor = processor;
		HardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		OpticalDrive = opticalDrive;
		Keyboard = keyboard;
	}

	public String getScreen() {
		return Screen;
	}

	public String getRAM() {
		return RAM;
	}

	public Processor getProcessor() {
		return processor;
	}

	public String getHardDrive() {
		return HardDrive;
	}

	public GraphicsCard getGraphicsCard() {
		return graphicsCard;
	}

	public String getOpticalDrive() {
		return OpticalDrive;
	}

	public String getKeyboard() {
		return Keyboard;
	}

	public String toString() {
		return "Laptop [Screen= " + getScreen() + ", RAM= " + getRAM() + ", Processor= " + getProcessor()
				+ ", HardDrive= " + getHardDrive() + ", GraphicsCard= " + getGraphicsCard()
				+ ", OpticalDrive= " + getOpticalDrive() + ", Keyboard= " + getKeyboard() + "]";
	}
	
	
}
