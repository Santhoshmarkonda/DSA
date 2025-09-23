package ps.day24;

public class SetBitCounter {

	public static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int number = 10;
		System.out.println("The number of set bits (1s) in the number is: " + countSetBits(number));
	}

}
