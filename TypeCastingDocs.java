package typecasting;

public class TypeCastingDocs {
/*
 * -------------------Type casting-----------------
 * #syntax
 * 	data_type var = (data_type)value;
 * 
 * 1. implicit casting (automatic)
 * 	byte ->short -> int -> long -> float -> double
 * 
 * 2. explicit casting (manual)
 * double-> float -> long -> int -> short -> byte
 */
	public static void main(String[] args) {
		byte a = 22;
		int b = a; // auto casting
		
		double x = 122222.202020;
		int y = (int) x; // explicit casting
		
		
	}
}
