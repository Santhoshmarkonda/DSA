package ps.day10;

public class PrimesInRange {

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
		
		int range = 100;

		for(int i = 2 ; i<= range; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}

}

