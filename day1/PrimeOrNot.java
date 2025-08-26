package DSA.day1;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		int n = 2;
		int div = 2;
		boolean isPrime = true;
		
		while(div <= n/2) { 
			if(n % div == 0) {
				isPrime = false;
				break;
			}
			div++;
		}
		
		if(isPrime && n > 1) 
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is Not a Prime Number");
	}
}
