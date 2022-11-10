package Interface;

public class tester {
	
	public static void main(String[] args) {
	
		Phone note5pro = new Samsung();
		//System.out.println(note5pro);
		System.out.println(note5pro.OS());
		System.out.println(note5pro.Processor());
		System.out.println(note5pro.spaceInGB());
	
	}

}

