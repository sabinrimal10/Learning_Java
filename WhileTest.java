package controlstatement.looping;

public class WhileTest {
		/*
		 * ---------------------- While Loop -----------------
		 * #syntax
		 * 	
		 * 	while(condition){
		 * 		// statement
		 * 		//inc/dec
		 * }
		 */
	public static void main(String[] args) {
		//5! = 5*4*3*2
		int n = 5;
		int fact = 1;
		while(n > 1) {
			fact = fact * n;
			n--;
		}
		System.out.println("Result= "+ fact);
	}
}
