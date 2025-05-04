package controlstatement.selection;

public class IfTest {
	public static void main(String[] args) {
		int salary = 250000;
		if(salary < 40000) {
			salary = 5000 + salary;
		}
		System.out.println("Your total salary= " + salary);
		
	}
}
