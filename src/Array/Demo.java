package Array;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// directly create arrays like this or use new keyword
		int []arr = {1,2,3};
		System.out.println(arr[2]);
		
		int []arr2 = new int[10];
		System.out.println(arr2[5]);

		//for each loop
		for(int x: arr2) {
			System.out.println(x);
		}
	}

}
