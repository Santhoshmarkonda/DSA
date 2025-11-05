package ps.day10;

public class BinToDec {

	public static int binToDec(int n) {
		int dec = 0;
		int i = 0;

		while (n > 0) {
			int r = n % 10;
			dec = dec + (r * (int) Math.pow(2, i));
			i++;
			n /= 10;
		}
		return dec;
	}

	public static void main(String[] args) {

		int number = 1010;
		System.out.println(binToDec(number));
	}

}
