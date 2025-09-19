package ps.day15;

public class SumofSubArrays {

	public static int getSum(int nums[]) {
		int sum = 0;

		for (int start = 0; start < nums.length; start++) {
			for (int end = start; end < nums.length; end++) {
				for (int i = start; i <= end; i++) {
					sum = sum + nums[i];
				}
			}
		}
		
//		for (int i = 0; i < n; i++) {
//            contribution formula
//            totalSum += nums[i] * (i + 1) * (n - i);
//      }

		return sum;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 4, 6, 8, 10 };
		System.out.println("Sum of all sub Arrays: " + getSum(nums));
	}

}
