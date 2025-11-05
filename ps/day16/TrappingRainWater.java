package ps.day16;

public class TrappingRainWater {

	public static int calculateRainWater(int height[]) {
		int rainWater = 0;
		int n = height.length;

		int leftMax[] = new int[n];
		leftMax[0] = height[0];

		for (int i = 1; i < n; i++) {
			leftMax[i] = (height[i] > leftMax[i - 1]) ? height[i] : leftMax[i - 1];
//			leftMax[i] = Math.max(height[i], leftMax[i - 1]);
		}

		int rightMax[] = new int[n];
		rightMax[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = (height[i] > rightMax[i + 1]) ? height[i] : rightMax[i + 1];
//			rightMax[i] = Math.max(height[i], rightMax[i + 1]);
		}

		for (int i = 0; i < n; i++) {
			int wl = ((leftMax[i] < rightMax[i]) ? leftMax[i] : rightMax[i]) - height[i];
//			int wl = Math.min(leftMax[i], rightMax[i]) - height[i];
			rainWater += wl;
		}

		return rainWater;
	}

	public static void main(String[] args) {
		int height[] = { 4, 2, 0, 6, 3, 2, 5 };
		System.out.println("Total Trapped Rain Water is: " + calculateRainWater(height));
	}

}

// Time Complexity: O(n) 
