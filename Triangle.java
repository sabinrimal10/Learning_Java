package constructor;

public class Triangle {

	/*
	 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a
		class named 'Triangle' without any parameter in its constructor.
	 */
	int a;
	int b;
	int c;
	
	Triangle(){
		a = 3;
		b = 4;
		c = 5;
	}
	
	
	
	void perimeter() {
		int perimeter = a+b+c;
		System.out.println("Perimeter ="+perimeter);
	}
	double area() {
		double s = (a+b+c)/ 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		
		t.area();
		t.perimeter();
	}
		
}
