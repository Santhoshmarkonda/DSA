package ps.day2;

public class Question_4 {

	public static void main(String[] args) {
		byte b = 4;
		char c = 'a';
		short s = 512;
		int i = 1000;
		float f = 3.14f;
		double d = 99.9954;

		double result = (f * b) + (i % c) - (d * s);
		/*
		 * type promotion : all the lower level data types 
		 * are converted to the top level data type i.e. double here
		 */
		System.out.println(result);
	}
}
