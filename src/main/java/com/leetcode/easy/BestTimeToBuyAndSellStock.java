package com.leetcode.easy;

/**
 * Best Time to Buy and Sell Stock
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Constraints:
 * <p>
 * 1 <= prices.length <= 105
 * 0 <= prices[i] <= 104
 * <p>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">...</a>
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxDiff = 0;

        int i = prices.length - 1;
        int j = prices.length - 2;

        int max = 0;

        while (j >= 0) {
            if (prices[i] > max) {
                max = prices[i];
            }
            int diff = max - prices[j];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
            i--;
            j--;
        }

        return maxDiff;
    }
}
