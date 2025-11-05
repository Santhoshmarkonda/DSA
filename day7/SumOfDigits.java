package ps.day7;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int number = 54321;
		int sum = 0;
		
		do {
			sum = 0;
			while(number > 0) {
				int r = number%10;
				sum += r;
				number /= 10;
			}
			number = sum;
		}while(number > 10);
		
		System.out.println(sum);
		
	}

}
