package ps.day10;

public class isPrimeOrNot {

	public static boolean isPrime(int n) {

		boolean isPrime = true;

		if (n == 1) {
			isPrime = false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {

		if (isPrime(11)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
