package ps.day12;

public class SolidRhombus {

	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 7;
		getPattern(n);
	}

}
