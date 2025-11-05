package ps.day12;

public class InvertedHalfPyramidRotated {

	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 4;
        getPattern(n);
	}

}
