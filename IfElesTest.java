package controlstatement.selection;

public class IfElesTest {
	/*
	 * #syntax
	 * 	if(){
	 * 		
	 * }
	 * else{
	 * 
	 * };
	 * 
	 */

	public static void main(String[] args) {
		 int n = 15000;
		 if(n%2 == 0) {
			 System.out.println(n + "Is even number");
		 }
		 else {
			 System.out.println(n + " Is odd number");
		 }
	}
}
