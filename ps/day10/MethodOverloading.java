package ps.day10;

public class MethodOverloading {
	
	public static int sum(int a , int b) {
		return a + b;
	}
	
	public static int sum(int a , int b, int c) {
		return a + b + c;
	}
	
	public static float sum(float a , float b) {
		return a + b;
	}
	
	public static float sum(float a , float b, float c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		int sumof2 = sum(4,5);
		float sumof2f = sum(4.5f, 6.7f);
		int sumof3 = sum(4,7,6);
		float sumof3f = sum(5.6f, 8.9f, 6.1f);
		
		System.out.println(sumof2);
		System.out.println(sumof2f);
		System.out.println(sumof3);
		System.out.println(sumof3f);
		
	}

}
