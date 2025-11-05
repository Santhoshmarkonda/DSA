package ps.day24;

public class BinaryExponentiation {

	public static long power(int base, int exp) {
		int result = 1;
		int b = base;

		while (exp > 0) {
			if ((exp & 1) != 0) {
				result *= b;
			}
			b *= b;
			exp >>= 1;
		}
		return result;
	}

	public static void main(String[] args) {
		int base = 2;
		int exp = 5;
		System.out.println("The result of " + base + "^" + exp + " is: " + power(base, exp));
	}
}