package ps.day24;

public class NumberParityChecker {

	public static void getEvenOrOdd(int n) {
		if ((n & 1) == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		int num = 11;
		getEvenOrOdd(num);
	}

}
