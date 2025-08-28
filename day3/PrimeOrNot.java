package ps.day3;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {

		// Approach 1

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				isPrime = false;
		}

		if (isPrime)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is Composite Number");

		sc.close();

		/*
		 * Approach 2
		 * 
		 * for(int i = 2; i <= n-1;i++){ 
		 *     if(n%i ==0) 
		 *         isPrime = false; 
		 * }
		 */
	}
}
