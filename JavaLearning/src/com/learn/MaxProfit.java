package com.learn;

public class MaxProfit {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		int smallest = prices[0]; // The minimum price seen so far
        int maxProfit = 0;        // The maximum profit calculated

        for (int i = 1; i < prices.length; i++) {
            // Update the smallest price
            if (prices[i] < smallest) {
                smallest = prices[i];
            }

            // Calculate potential profit and update maxProfit if it's larger
            int profit = prices[i] - smallest;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}
