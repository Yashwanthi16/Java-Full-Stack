package Interface;

public class Samsung implements Phone {

	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Processor() {
		// TODO Auto-generated method stub
		return "SnapDragon";
	}

	@Override
	public String OS() {
		// TODO Auto-generated method stub
		return "Android";
	}

	@Override
	public int spaceInGB() {
		// TODO Auto-generated method stub
		return 128;
	}

	@Override
	public String toString() {
		return "Samsung [Processor= " + Processor() + ", OS= " + OS() + ", spaceInGB= " + spaceInGB() + "]";
	}
	

}
