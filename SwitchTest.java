package controlstatement.selection;

import java.util.Scanner;

public class SwitchTest {
		/*
		 * ------------Switch---------------
		 * 	#	syntax
		 * 	
		 * 	switch(variable){
		 * 		case 1 :
		 * 			// Statement
		 * 			break;
		 * 		case 2:
		 * 			// Statement
		 * 			break;
		 * 		.....................
		 * 		.....................
		 * 		default :
		 * 			// Statement
		 * }
		 */
	public static void main(String[] args) {
		
		int day ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your days in number:");
		day = sc.nextInt();
		
		
		switch(day) {
		
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;	
		
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
			
		case 7:
			System.out.println("Saturday");
			break;
			
		default :
			System.out.println("Invalid Output");
		}
	}
}
