package ps.day3;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth Term: ");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		int third = 0;
		//System.out.print(first + " " + second + " ");
		for (int i = 3; i <= n; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		System.out.println(third);
		sc.close();
	}

}
