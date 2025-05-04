package controlstatement.selection;

public class LadderTest {
/*
 * ------------------ else if--------------------
 * 	if(Condition-1){
 * 
 * 	}
 * else if(Condition-2){
 * 
 * 	}
 * else if(Condition-3){
 * 
 * 	}
 * else{
 * 
 * 	}
 * 
 */
	public static void main(String[] args) {
		int marks = 88;
		if(marks>=80) {
			System.out.println("Distinction");
		}
		else if(marks>=60) {
			System.out.println("First Division");
		}
		else if(marks>=45) {
			System.out.println("Second Division ");
		}
		else if(marks>=32) {
			System.out.println("Third Division ");
		}
		else {
			System.out.println("Fail");
		}
			
			
			
			
	}
}
