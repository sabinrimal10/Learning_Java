package controlstatement.looping;

public class ForEachTest {
	/*
	 * --------------------- forEach loop--------------------
	 * #used to read data from collection (array, list, set, maps etc .)
	 * 	#syntax :
	 * 	
	 * 	 for(data_type var : collection ){
	 * 		//statements
	 * 	}		
	 */
	public static void main(String[] args) {
		int values[] = {3,3,4,5,66,89,78} ;
			int sum =0;
			
			for(int x : values) {
				System.out.println(x);
				sum = sum + x;
			}
			System.out.println("Total =" + sum);
	}
}
