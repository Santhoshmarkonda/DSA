package ps.day18;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

	public static void printArray(int nums[]) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int nums[] = { 5, 4, 1, 3, 2 };
		Arrays.sort(nums);
        printArray(nums);
        Arrays.sort(nums,2,5);
        printArray(nums);
        Integer numbers[] = { 5, 4, 1, 3, 2 };
        Arrays.sort(numbers,Collections.reverseOrder());
        printArray(nums);
	}

}
