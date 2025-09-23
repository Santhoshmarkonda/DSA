package ps.day24;

public class PowerOfTwo {
	
	public static boolean checkIfPowerOfTwo(int n) {
		return (n & (n-1)) == 0;
	}
	
	public static void main(String[] args) {
		int number = 8;
		System.out.println("Power of 2? " + checkIfPowerOfTwo(number));
	}

}
