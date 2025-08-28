package ps.day2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the cost of pencil: ");
		float a = sc.nextFloat();
		System.out.println("Enter the cost of pen: ");
		float b = sc.nextFloat();
		System.out.println("Enter the cost of eraser: ");
		float c = sc.nextFloat();

		float total_cost = a + b + c;

		double final_cost = total_cost + (total_cost * 0.18);

		System.out.printf("Final cost including GST(18%%): %.3f%n", final_cost);

		sc.close();
	}
}
