package ps.day14;

import java.util.Scanner;

public class ArrayCC {

	public static void main(String[] args) {
		// Array Creation
		int arr[] = new int[10];
		// int arr[] = {1. 2. 3};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers:");

		// Input to an Array
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();

		// Output From an Array
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// Array Updation
		System.out.println("Previous Value: " + arr[2]);
		arr[2] = 97;
		System.out.println("Updated value: " + arr[2]);

		// Length of an Array
		System.out.println("Length of Array: " + arr.length);

		sc.close();
	}
}
