package Enum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//way to use enum data type
		Days d = Days.FRIDAY;
		System.out.println(d);
		
		switch(d) {
		case FRIDAY: System.out.println("Friday");
			break;
		case MONDAY: System.out.println("Monday");
			break;
		case SATURDAY: System.out.println("Saturday");
			break;
		case SUNDAY: System.out.println("Sunday");
			break;
		case THURSDAY: System.out.println("Thursday");
			break;
		case TUESDAY: System.out.println("Tuesday");
			break;
		case WEDNESDAY: System.out.println("Wednesday");
			break;
		default: System.out.println("enter valid number");
			break;
		
		}
	}

}
