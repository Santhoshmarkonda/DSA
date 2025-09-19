package ps.day6;

public class PrintReverseOfaNumber {
	
	public static void main(String[] args) {
		int number = 23503;
		while(number>0) {
			int r = number%10;
			System.out.print(r);
			number /= 10;
		}
	}

}
