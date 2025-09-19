package ps.day13;

public class NumberSpacingPyramid {
	
	public static void getPyramid(int n) {
		int number = 1;
		for(int i = 1; i <= n; i++) {
			for(int sp = 1; sp <= n-i;sp++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
		getPyramid(n);
	}

}
