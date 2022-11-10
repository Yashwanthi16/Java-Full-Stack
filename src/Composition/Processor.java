package Composition;

public class Processor {
	private String Brand;
	private String Series;
	private int Generation;
	private int Cores;
	private int Threads;
	private String CacheMemory;
	private String Frequency;	
	
	public Processor() {
		Brand = "intel";
		Series = "7200u";
		Generation = 10;
		Cores = 5;
		Threads = 5;
		CacheMemory = "10MB";
		Frequency = "2.5GHz";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency) {
		Brand = brand;
		Series = series;
		Generation = generation;
		Cores = cores;
		Threads = threads;
		CacheMemory = cacheMemory;
		Frequency = frequency;
	}

	public String getBrand() {
		return Brand;
	}

	public String getSeries() {
		return Series;
	}

	public int getGeneration() {
		return Generation;
	}

	public int getCores() {
		return Cores;
	}

	public int getThreads() {
		return Threads;
	}

	public String getCacheMemory() {
		return CacheMemory;
	}

	public String getFrequency() {
		return Frequency;
	}

	public String toString() {
		return "Processor [Brand= " + Brand + ", Series= " + Series + ", Generation= " + Generation + ", Cores= " + Cores
				+ ", Threads= " + Threads + ", CacheMemory= " + CacheMemory + ", Frequency= " + Frequency + "]";
	}	
}
