package ps.day15;

public class ReversingAnArray {

	public static void reverse(int nums[]) {
		int first = 0;
		int last = nums.length - 1;
		while (first < last) {
			int temp = nums[first];
			nums[first] = nums[last];
			nums[last] = temp;

			first++;
			last--;
		}
	}

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		reverse(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
