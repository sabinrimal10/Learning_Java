package controlstatement.selection;

public class NestedIfElseTest {
	/*
	 * Nested If Else 
	 * #syntax
	 * 	if(Condition-1){
	 * 		if(Condition-2){
	 * 		
	 */
	public static void main(String[] args) {
		String citizen = "nepali";
		int age = 44;
		boolean haveVoteId = false;
		
		if(citizen.equals("nepali")) {
			
			if(age>=18) {
				
				if(haveVoteId) {
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
