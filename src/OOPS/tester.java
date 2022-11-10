package OOPS;

public class tester {

	public tester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car maruti = new Car();
		Car alto = new Car("closed","on","present");
		System.out.println(maruti.run());
		System.out.println(alto.run());
	}

}
