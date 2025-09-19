package ps.day13;

public class ReversePalindromePyramid {

	public static void getPyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int sp = 1; sp <= n - i; sp++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 5;
		getPyramid(n);
	}

}
