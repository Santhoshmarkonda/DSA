package ps.day2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of Square: ");
		int side = sc.nextInt();
		double area = side * side;
		System.out.println("Area of Square is " + area);
		sc.close();
	}

}
