package ps.day2;

public class TypeCasting {
	
	public static void main(String[] args) {
		int a = 56;
		float f = a;   // implicit type casting
		System.out.println(f);
		
		double d = 3.141;
		long l = (long) d;  // Explicit type casting
		System.out.println(l);
		
		/*
		 *  Implicit type casting is directly converting a
		 *  lower level data type into a higher level data type
		 *  
		 *  Explicit type casting is manually converting an higher 
		 *  level data type into a lower level data type.
		 *  
		 *  you can only convert a type compactible data types like
		 *  
		 *  you can convert a double to int, short, byte, long
		 *  but you can not convert it to a char or String(type incompactible).
		 *  
		 */
	}

}
