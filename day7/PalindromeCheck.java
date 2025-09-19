package ps.day7;

public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		int number = 242;
		int rev = 0;
		int temp = number;
		
		while(temp > 0) {
			int r = temp%10;
			rev = (rev*10) + r;
			temp /= 10;
		}
		
		if(number == rev) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}
	}

}
