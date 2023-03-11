package com.leetcode.easy;

/**
 * Sqrt(x)
 * <p>
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <p>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * <p>
 * Constraints:
 * <p>
 * 0 <= x <= 2^31 - 1
 * <p>
 * <a href="https://leetcode.com/problems/sqrtx/">Sqrt(x)</a>
 */
public class SqrtX {
	
	public int mySqrt(int x) {
		int i = 0;
		while (x > i * i && i <= 46340) {
			i++;
		}
		return x == i * i ? i : i - 1;
	}
}
