package ps.day13;

public class StarPyramid {

	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		getPattern(n);
	}

}
