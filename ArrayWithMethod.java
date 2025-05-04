package array;

import java.util.Arrays;

public class ArrayWithMethod {
		
	/* 
	 * -------------------Array with Method-------------
	 * 	a. Array as argument :
	 * 	
	 * 		void sum(int a[]){
	 * 
	 * 	}
	 * 
	 * 	b. Array as return type :
	 * 		
	 * 		int [] get20IntValues(){
	 * 
	 * 
	 * 
	 * 		// array = 122,22,22,,33,4,,4,5,5,5,2,1,5;
	 * 			return array;
	 * 	}
	 * 
	 */
	static void findSum(int values[]) {
		int s=0;
		for ( int x: values) {
			s= s+x;
			
		}
		System.out.println("Total = "+ s);
	}
	 
	 //array as return type
	 
	 static int[] getOddNumbersFrom1To100() {
		 
		 int oddnums[] = new int[50];
		 
		 int j = 0;
		 
		 for (int i = 1; i<=100; i++) {
			 
			 if (i%2 != 0) {
				 oddnums[j] =i;
				 j++;
				 
			 }
		 }
		 return oddnums;
	 }


	
	public static void main(String[] args) {
		int array[] = {9,87,65,43,21,12,34,56,78,90};
		
		findSum(array);
				
		int [] oddnums = getOddNumbersFrom1To100()	;
		System.out.println(Arrays.toString(oddnums));
	}
	
	
	
	
	
}
		
	
	
	 