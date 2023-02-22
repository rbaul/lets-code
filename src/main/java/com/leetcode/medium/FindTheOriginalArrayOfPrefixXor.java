package com.leetcode.medium;

/**
 * Find The Original Array of Prefix Xor
 * <p>
 * You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:
 * <p>
 * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
 * Note that ^ denotes the bitwise-xor operation.
 * <p>
 * It can be proven that the answer is unique.
 * <p>
 * Constraints:
 * <p>
 * 1 <= pref.length <= 10^5
 * 0 <= pref[i] <= 10^6
 * <p>
 * <a href="https://leetcode.com/problems/find-the-original-array-of-prefix-xor/">Find The Original Array of Prefix Xor</a>
 */
public class FindTheOriginalArrayOfPrefixXor {
//	public int[] findArray2(int[] pref) {
//		int[] result = new int[pref.length];
//
//		if (pref.length == 1) {
//			return pref;
//		} else {
//			result[0] = pref[0];
//			BitSet prev = BitSet.valueOf(new long[]{pref[0]});
//			for (int i = 1; i < pref.length; i++) {
//				BitSet bitSet = BitSet.valueOf(new long[]{pref[i]});
//				prev.xor(bitSet);
//				long[] longs = prev.toLongArray();
//				result[i] = longs.length == 0 ? 0 : (int) longs[0];
//				prev = bitSet;
//			}
//		}
//		return result;
//	}
	
	public int[] findArray(int[] pref) {
		int[] result = new int[pref.length];
		
		if (pref.length == 1) {
			return pref;
		} else {
			result[0] = pref[0];
			for (int i = 1; i < pref.length; i++) {
				result[i] = pref[i] ^ pref[i - 1];
			}
		}
		return result;
	}
	
}
