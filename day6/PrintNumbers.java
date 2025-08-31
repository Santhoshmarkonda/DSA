package ps.day6;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while (i <= n) {
			System.out.print(i + " ");
			i++;
		}
		sc.close();
	}

}
