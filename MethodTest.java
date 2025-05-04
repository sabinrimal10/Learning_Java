package methods;

public class MethodTest {
		// 1. no return type with no arguments.
		static void sum() {
			int x = 56;
			int y = 44;
			
			int s = x + y;
			System.out.println("result = "+ s);
		}
		//2. return type with no argument.
		static int area() {
			int l = 3;
			int b = 4;
			
			int a = l * b;
			System.out.println("Area = "+ a);
			return a;
		}
		
		static int getSumOf1To100() {
			int s = 0;
			
			for(int i=1 ; i<=100 ; i++) {
				s = s + i;
				
			}
			
			return s;
		}
		
		
		
		
		//3. no return type with arguments.
		
			static void printTable(int n) {
				for(int i=1 ; i<=10 ; i++) {
					System.out.println(n+"x"+i+"="+(n*i));
			}
				
			}
	// return type with arguments.
			
			static int getSmallestValue(int x , int y) {
				if(x < y)
					return x;
				else
					return y;
					
			}
	
		public static void main(String[] args) {
			sum();
			area();
			printTable(11);
			int s = getSumOf1To100();
			System.out.println("Sum of 1 to 100 = "+s);
			int sv = getSmallestValue(61,55);
			System.out.println(sv);
			
			System.out.println("Smallest value = " + getSmallestValue(55, 61));
		}
		
		
		
}
