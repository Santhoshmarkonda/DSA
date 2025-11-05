package ps.day17;

public class BestTimeToBuyAndSellStock {

	public static int getMaxProfit(int[] prices) {
		int minPrice = prices[0];
		int maxProfit = 0;

		if (prices == null || prices.length == 0) {
			return 0;
		}

		for (int i = 1; i < prices.length; i++) {

			minPrice = Math.min(minPrice, prices[i]);
			int currentProfit = prices[i] - minPrice;
			maxProfit = Math.max(maxProfit, currentProfit);

		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		System.out.println("Maximum Profit: " + getMaxProfit(prices1));
	}
}

// Time Complexity: O(n)