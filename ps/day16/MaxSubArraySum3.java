package ps.day16;

// KADANE'S Algorithm

public class MaxSubArraySum3 {

	public static int getSum(int arr[]) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			maxSum = Math.max(maxSum, sum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("The max sub array sum is: " + getSum(numbers));
//		int nums[] = { 1, -2, 6, -1, 3 };
//		System.out.println("the sum is: " + getSum(nums));
	}

}

// Time Commplexity - O(n)
