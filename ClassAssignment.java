package methods;

public class ClassAssignment {
		/*
		 * Q> Find area and volume as :
   *    a> getArea :
   *       ->  pass l and b as parameters
   *       ->  calculate area
   *       ->  return area
   *       ->  call this method in main
   *       
   *   b> volume :
   *      -> pass area and h as parameters
   *      -> calculate volume
   *      -> print area
   *      -> print volume
   *      -> call this method in main   
		 */
	
	static int getArea(int l , int b) {
		int area = l * b;
		return area;
	}
	
	static int getvolume(int Area , int h) {
		
		int volume = Area * h;
		System.out.println(volume);
		return volume;
		
	}
	
	public static void main(String[] args) {
		int area = getArea(2, 3);
		System.out.println("The area is " + area);
		getvolume(area , 10);
	
	
	}
	
		
}
