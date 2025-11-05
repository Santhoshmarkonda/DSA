package ps.day10;

public class DecToBin {

	public static int decToBin(int n) {
		int bin = 0;
		int i = 0;

		while (n > 0) {
			int r = n % 2;
			bin = bin + (r * (int) Math.pow(10, i));
			i++;
			n /= 2;
		}

		return bin;
	}

	public static void main(String[] args) {
		int number = 10;
		System.out.println(decToBin(number));
	}

}
