package ps.day10;

public class Multiplication {

	public static int product(int a, int b) {
		int product = a * b;
		return product;
	}

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int prod = product(a, b);
		System.out.println("a * b = " + prod);
	}

}
