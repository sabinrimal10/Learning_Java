package controlstatement.looping;

public class JumpingTest {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i==5 || i == 8) {
				//break;
				//continue;
				return;
			}
			System.out.println(i);
		}
		System.out.println("--------End of Loop-------");
	}
}
