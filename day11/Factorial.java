package ps.day11;

public class Factorial {

	static int fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}

	public static void main(String[] args) {
		int n = 7;
		int res = fact(n);
		System.out.println("factorial of n: " + res);
	}

}
