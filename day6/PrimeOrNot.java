package ps.day6;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		boolean isPrime = true;

		if (n == 0) {
			isPrime = false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println(n + " is Prime Number");
		} else {
			System.out.println(n + " is Not Prime Number");
		}
		
		sc.close();
	}

}
