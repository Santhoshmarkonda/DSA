package ps.day28;

public class Fibonacci {

	public static int getFib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fib = getFib(n - 1) + getFib(n - 2);
		return fib;
	}

	public static void main(String[] args) {
        System.out.println(getFib(10));
	}

}
