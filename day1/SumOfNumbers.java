package DSA.day1;

public class SumOfNumbers {

	public static void main(String[] args) {
		int N = 10;
		int sum = 0;

		int i = 1;
		while (i <= N) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
