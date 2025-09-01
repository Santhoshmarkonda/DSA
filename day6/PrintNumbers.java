package ps.day6;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= n) ;
		sc.close();
	}

}
