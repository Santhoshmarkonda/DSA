package ps.day12;

public class HallowRhombus {

	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int n = 5;
		getPattern(n);
	}

}
