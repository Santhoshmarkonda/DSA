package ps.day28;

public class RecursionExample {

	public static void printIncrease(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		printIncrease(n - 1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		printIncrease(100);
	}

}
