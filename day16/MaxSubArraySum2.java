package ps.day16;

public class MaxSubArraySum2 {

	public static int getSum(int arr[]) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		int prefix[] = new int[arr.length];
		prefix[0] = arr[0];

		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			int start = i;
			for (int j = i; j < arr.length; j++) {
				int end = j;
				sum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
				if (maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int numbers[] = { 1, -1, 5, 4, 7 };
//		int nums[] = { 1, -2, 6, -1, 3 };
//		System.out.println("the sum is: " + getSum(nums));
		System.out.println("the max sub array sum is: " + getSum(numbers));
	}

}

//Time Commplexity - O(n*n)