package ps.day28;

public class Main {

	public static void printNumbers(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		}
		System.out.print(n + " ");
		printNumbers(n - 1);
	}

	public static void main(String[] args) {
		printNumbers(100);
	}

}
