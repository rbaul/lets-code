package com.leetcode.medium;

/**
 * Count Triplets That Can Form Two Arrays of Equal XOR
 * <p>
 * Given an array of integers arr.
 * <p>
 * We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).
 * <p>
 * Let's define a and b as follows:
 * <p>
 * a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
 * b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
 * Note that ^ denotes the bitwise-xor operation.
 * <p>
 * Return the number of triplets (i, j and k) Where a == b.
 * <p>
 * Constraints:
 * <p>
 * 1 <= arr.length <= 300
 * 1 <= arr[i] <= 10^8
 * <p>
 * <a href=" https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor">Count Triplets That Can Form Two Arrays of Equal XOR</a>/
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXOR {
	
	public int countTriplets(int[] arr) {
		int count = 0;
		int i = 0;
		int k = arr.length - 1;
		while (i < k) {
			while (i < k) {
				for (int j = i + 1; j <= k; j++) {
					int a = arrXor(arr, i, j - 1);
					int b = arrXor(arr, j, k);
					if (a == b) count++;
				}
				i++;
			}
			i = 0;
			k--;
		}
		
		return count;
	}
	
	private int arrXor(int[] arr, int start, int end) {
		int a = arr[start];
		for (int i = start + 1; i <= end; i++) {
			a = a ^ arr[i];
		}
		return a;
	}
}
