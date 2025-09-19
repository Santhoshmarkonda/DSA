package ps.day4;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your salary per year: ");
		double salary = sc.nextDouble();
		double tax = 0;
		
		if (salary < 0) {
			System.out.println(salary + " is Not Valid");
		} else if (salary > 0 && salary <= 500000) {
			tax = 0;
		} else if (salary > 500000 && salary <= 1000000) {
			tax = salary * 0.2;
		} else {
			tax = salary * 0.3;
		}

		System.out.println("Tax for " + salary + " is: " + tax);
		sc.close();
	}

}
