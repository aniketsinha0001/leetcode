package com.leetcode;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		int prices[] = { 7, 6, 4, 3, 1 };
		BestTimetoBuyandSellStock b = new BestTimetoBuyandSellStock();
		int maxProfit = b.maxProfit(prices);
		System.out.println("max profit:" + maxProfit);
	}

	public int maxProfit(int[] prices) {
		int min = prices[0];
		int maxProfit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
				int profit = prices[i] - min;
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			} else {
				int profit = prices[i] - min;
				if (profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}

	public int maxProfitBruteForce(int[] prices) {
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
			int	maxDiff = prices[j] - prices[i];
				if (maxDiff > maxProfit) {
					maxProfit = maxDiff;
				}
			}
		}
		return maxProfit;
	}
}