package ps.day5;

public class DecimalToBinary {

	public static void main(String[] args) {
		// Decimal to Binary
		int number = 10;
		String str = "";
		int temp = number;
		while (number > 0) {
			int r = number % 2;
			str = r + str;
			number = number / 2;
		}
		System.out.println("Binary representation of " + temp + " is: " + str);
	}

}
