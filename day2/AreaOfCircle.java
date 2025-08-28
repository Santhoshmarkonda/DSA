package ps.day2;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the radius of the circle: ");
		float radius = sc.nextFloat();
		
		double area = 3.141 * radius * radius;
		
		System.out.println("Area of the circle is "+ area);
		
		sc.close();
	}

}
