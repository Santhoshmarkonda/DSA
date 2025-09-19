package ps.day17;

import java.util.*;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> uniqueTriplets = new HashSet<>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(triplet);
						uniqueTriplets.add(triplet);
					}
				}
			}
		}

		return new ArrayList<>(uniqueTriplets);
	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = threeSum(nums);
		System.out.println(result);
	}
}

// Time Complexity: O(n*n*n)