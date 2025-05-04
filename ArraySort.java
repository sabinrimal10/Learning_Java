package array;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int values[] = {1,2,34,56,78,923,456,7,8,9,56,78,56,78};
		
		Arrays.sort (values);
		System.out.println(Arrays.toString(values));
		
		Arrays.fill(values, 300);
		System.out.println(Arrays.toString(values));
		
		Arrays.fill(values,7,8,900);
		System.out.println(Arrays.toString(values));
		
		int[] newArray = values;
		System.out.println(Arrays.toString(newArray));
		
		int []	arr = Arrays.copyOfRange(values, 3 , 13);
		System.out.println(Arrays.toString(arr));
		
	}
}
