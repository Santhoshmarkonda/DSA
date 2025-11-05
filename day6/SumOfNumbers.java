package ps.day6;

import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		int i = 1;
		while(i <= n) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("Sum is "+sum);
		sc.close();
	}

}
