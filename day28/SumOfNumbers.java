package ps.day28;

public class SumOfNumbers {

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		int addition = n + sum(n - 1);
		return addition;
	}

	public static void main(String[] args) {
		System.out.println(sum(5));
	}

}
