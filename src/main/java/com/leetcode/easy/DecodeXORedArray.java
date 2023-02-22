package com.leetcode.easy;

/**
 * Decode XORed Array
 * <p>
 * There is a hidden integer array arr that consists of n non-negative integers.
 * <p>
 * It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].
 * <p>
 * You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].
 * <p>
 * Return the original array arr. It can be proved that the answer exists and is unique.
 * <p>
 * Constraints:
 * <p>
 * 2 <= n <= 10^4
 * encoded.length == n - 1
 * 0 <= encoded[i] <= 10^5
 * 0 <= first <= 10^5
 * <p>
 * <a href="https://leetcode.com/problems/decode-xored-array/">Decode XORed Array</a>
 */
public class DecodeXORedArray {
	public int[] decode(int[] encoded, int first) {
		int[] result = new int[encoded.length + 1];
		result[0] = first;
		
		for (int i = 0; i < encoded.length; i++) {
			result[i + 1] = encoded[i] ^ result[i];
		}
		
		return result;
	}
}
