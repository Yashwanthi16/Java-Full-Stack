package Composition;

public class GraphicsCard {

	private String Brand;
	private int Series;
	private String Memory;
	
	public GraphicsCard() {
		Brand = "nvidia";
		Series = 940;
		Memory = "3 GB";
	}

	public GraphicsCard(String brand, int series, String memory) {
		Brand = brand;
		Series = series;
		Memory = memory;
	}

	public String getBrand() {
		return Brand;
	}

	public int getSeries() {
		return Series;
	}

	public String getMemory() {
		return Memory;
	}

	@Override
	public String toString() {
		return "GraphicsCard [Brand= " + getBrand() + ", Series= " + getSeries() + ", Memory= "
				+ getMemory() + "]";
	}
	
	
}
