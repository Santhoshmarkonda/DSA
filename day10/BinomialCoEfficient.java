package ps.day10;

public class BinomialCoEfficient {

	public static int fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}

	public static int countbiocoeff(int n, int r) {
		int n_f = fact(n);
		int r_f = fact(r);
		int nmr = fact(n - r);
		int bce = n_f / (r_f * nmr);
		return bce;
	}

	public static void main(String[] args) {
		int n = 5;
		int r = 2;

		int binocoeff = countbiocoeff(n, r);
		System.out.println("Binomial co-efficient of n and r is: " + binocoeff);

	}

}
