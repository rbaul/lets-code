package com.leetcode.medium;

import java.util.ArrayList;

/**
 * Multiply Strings
 * <p>
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 * <p>
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * <p>
 * https://leetcode.com/problems/multiply-strings/
 * <p>
 * Constraints:
 * <p>
 * 1 <= num1.length, num2.length <= 200
 * num1 and num2 consist of digits only.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 */
public class MultiplyStrings {
	
	public static String multiply(String num1, String num2) {
		
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		
		ArrayList<String> numSum = new ArrayList<>();
		int maxNumSumLength = 0;
		for (int i = num1.length() - 1; i >= 0; i--) {
			int remainder = 0;
			int numOf1 = num1.charAt(i) - '0';
			
			StringBuilder sb = new StringBuilder();
			
			// Padding with 0
			for (int j = 0; j < num1.length() - i - 1; j++) {
				sb.append(0);
			}
			
			for (int j = num2.length() - 1; j >= 0; j--) {
				int numOf2 = num2.charAt(j) - '0';
				
				int multi = numOf1 * numOf2 + remainder;
				
				int div = multi % 10;
				if (multi > 9) {
					remainder = multi / 10;
				} else {
					remainder = 0;
				}
				
				sb.append(div);
			}
			
			if (remainder > 0) {
				sb.append(remainder);
			}
			
			String sum = sb.toString();
			maxNumSumLength = Math.max(maxNumSumLength, sum.length());
			numSum.add(sum);
		}
		
		// Sum all numbers
		StringBuilder reverseResult = new StringBuilder();
		
		int remainder = 0;
		int index = 0;
		while (index < maxNumSumLength) {
			int sum = 0;
			for (int i = 0; i < numSum.size(); i++) {
				String num = numSum.get(i);
				if (num.length() > index) {
					sum += num.charAt(index) - '0';
				}
			}
			sum += remainder;
			
			int div = sum % 10;
			if (sum > 9) {
				remainder = sum / 10;
			} else {
				remainder = 0;
			}
			reverseResult.append(div);
			index++;
		}
		
		if (remainder > 0) {
			reverseResult.append(remainder);
		}
		
		return reverseResult.reverse().toString();
	}
}
