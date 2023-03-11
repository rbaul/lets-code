package com.leetcode.easy;

/**
 * Climbing Stairs
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 45
 * <p>
 * <a href="https://leetcode.com/problems/climbing-stairs/description/">Climbing Stairs</a>
 */
public class ClimbingStairs {
	public int climbStairs(int n) {
		if (n == 1 || n == 2) return n;
		int prev = 2;
		int prevPrev = 1;
		int temp;
		
		for (int i = 3; i <= n; i++) {
			temp = prev;
			prev += prevPrev;
			prevPrev = temp;
		}
		
		return prev;
	}
}
