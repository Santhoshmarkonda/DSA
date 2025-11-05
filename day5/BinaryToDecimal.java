package ps.day5;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// Binary to Decimal Conversion

		int number = 10;
		int sum = 0;
		int temp = number;
		int i = 0;
		while (temp > 0) {
			int r = temp % 2;
			sum = sum + (int) (r * Math.pow(2, i));
			i++;
			temp /= 10;
		}

		System.out.println("Decimal representation of "+number+" is: "+sum);

	}

}
