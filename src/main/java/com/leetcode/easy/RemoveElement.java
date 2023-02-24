package com.leetcode.easy;

/**
 * Remove Element
 * <p>
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
 * <p>
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 * <p>
 * <a href="https://leetcode.com/problems/remove-element/">Remove Element</a>
 */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int firstIndex = 0;
		int lastIndex = nums.length - 1;
		while (firstIndex <= lastIndex) {
			if (nums[firstIndex] == val) {
				nums[firstIndex] = nums[lastIndex];
				nums[lastIndex] = val;
				lastIndex--;
			} else {
				firstIndex++;
			}
		}
		return lastIndex >= 0 ? firstIndex : 0;
	}
}
