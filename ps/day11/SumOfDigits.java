package ps.day11;

public class SumOfDigits {

	public static int getSum(int n) {
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum += r;
			n /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int number = 23503;
		System.out.println("Sum of Digits: " + getSum(number));
	}

}
