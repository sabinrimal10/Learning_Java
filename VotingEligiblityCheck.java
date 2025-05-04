package controlstatement.selection;

import java.util.Scanner;

public class VotingEligiblityCheck {
	public static void main(String[] args) {
		
	int age;
	String citizen;
	boolean haveVoterid;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Citizenship :");
	citizen = sc.nextLine();  
	
	System.out.println("Enter your age :");
	age = sc.nextInt();
	
	System.out.println("You have Voter id ");
	haveVoterid = sc.hasNext();
	
	if(citizen.equals("nepali")) {
		
		if(age>=18) {
			
			if(haveVoterid) {
				System.out.println("You can vote");
			}else {
				System.out.println("You cannot vote!!");
			}
		}else {
			System.out.println("You are under age !!");
		}
	}else {
		System.out.println("Invalid citizenship!!");
	}

	
		
	}

}
