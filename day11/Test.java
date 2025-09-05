package ps.day11;

public class Test {

	public static boolean isEven(int num) {
		boolean isEven;
		if (num % 2 == 0) {
			isEven = true;
		} else {
			isEven = false;
		}
		return isEven;
	}

	public static void main(String[] args) {
		int number = 12;
		System.out.println("isPrime: " + isEven(number));
	}

}
