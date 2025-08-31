package ps.day6;

import java.util.Scanner;

public class TableOFaNumber {

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}

		sc.close();
	}

}
