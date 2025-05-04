package array;

import java.util.Scanner;

public class MultiDArray {

			/*
			 * ----------MultiDimensional Array-----------
			 * 		
			 */
	public static void main(String[] args) {
		
		//Create array 
		int mat[][] = new int[2][2];
		
		// put data in array
		
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0; i<2 ; i++) {
			
			
			for(int j= 0 ; j<2 ; j++) {
				
				System.out.println("Enter values : ");
				mat [i][j]= sc.nextInt();
				
			}
		}
		// get data from array
		for ( int i=0; i<2 ; i++) {
			
			for(int j=0; j<2 ; j++) {
				System.out.println(mat[i][j] + " ");
				
			}
			System.out.println();
		}
	}
}
