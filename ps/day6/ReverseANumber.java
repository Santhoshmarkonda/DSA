package ps.day6;

public class ReverseANumber {
	
	public static void main(String[] args) {
		int number = 23503;
		int rev = 0;
		while(number>0) {
			int r = number%10;
			rev = (rev * 10) + r;
			number /= 10;
		}
		
		System.out.println("Reverse of Number is: "+rev);
	}

}
