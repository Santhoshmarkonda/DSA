package ps.day3;

import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = sc.nextInt();
		if(number%2 ==0)
			System.out.println(number+" is Even Number");
		else
			System.out.println(number+" is Odd Number");
		sc.close();
	}
}
