package ps.day11;

public class PalindromeOrNot {

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int original = number;

		while (number > 0) {
			int r = number % 10;
			reverse = (reverse * 10) + r;
			number /= 10;
		}

		return (original == reverse);
	}

	public static void main(String[] args) {
		int number = 1221;
		if (isPalindrome(number)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
