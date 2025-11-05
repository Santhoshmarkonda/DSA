package ps.day16;

public class MaxSubArraySum1 {

	public static int getMaxSubArraySum(int arr[]) {

		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
				}
				if (maxSum < sum) {
					maxSum = sum;
				}
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int nums[] = { 1, -2, 6, -1, 3 };
		System.out.println("The maximum sub array sum is: " + getMaxSubArraySum(nums));
	}

}

//Time Commplexity - O(n*n*n)