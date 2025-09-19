package ps.day13;

public class HallowPyramid {

	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i == 1 || i == n || j == 1 || j == 2 * i - 1) {
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
