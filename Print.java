package controlstatement.looping;

public class Print {
	public static void main(String[] args) {
		int es = 0;
		int os = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				es = es + i ;
			}else {
				os = os + i;
			}
//			System.out.println(i);
//			s = s + i;
		}
		System.out.println("Sum of even =" + es);
		System.out.println("Sum of odd ="+os);
		System.out.println("Total= " +(es + os));
	}
}
