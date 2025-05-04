package controlstatement.looping;

public class DoWhileTest {
		/*
		 * -------------------- do-while --------------------
		 * 
		 * 	#syntax :
		 * 		
		 * 		do{
		 * 			//statement
		 * 			//inc/dec
		 * 
		 * }while(condition);
		 */
	public static void main(String[] args) {
		/*
		 * 	7 x 1 = 7
		 * 	7 x 2 = 14
		 * ............
		 * ............
		 */
		int n = 7;
		int i = 1;
		
		do {
			System.out.println(n+"x"+i+"="+(n*i));
			i++;
		}while(i<=10);
		
		
	}
	
}
