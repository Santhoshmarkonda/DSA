package ps.day17;

public class TrapRainWater {

	public static int trapRainWater(int height[]) {
		int rainwater = 0;
		int n = height.length;

		int leftMax[] = new int[n];
		leftMax[0] = height[0];

		for (int i = 1; i < n; i++) {
			leftMax[i] = (height[i] > leftMax[i - 1]) ? height[i] : leftMax[i - 1];
		}

		int rightMax[] = new int[n];
		rightMax[n - 1] = height[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = (height[i] > rightMax[i + 1]) ? height[i] : rightMax[i + 1];
		}

		for (int i = 0; i < n; i++) {
			int wl = Math.min(leftMax[i], rightMax[i]) - height[i];
			rainwater += wl;
		}

		return rainwater;
	}

	public static void main(String[] args) {
		int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("The Total Water is: " + trapRainWater(height));
	}

}

// Time Complexity: O(n)