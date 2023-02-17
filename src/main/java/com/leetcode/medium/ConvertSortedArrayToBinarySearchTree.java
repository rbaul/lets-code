package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

import java.util.Arrays;

/**
 * Convert Sorted Array to Binary Search Tree
 * <p>
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -104 <= nums[i] <= 10^4
 * nums is sorted in a strictly increasing order.
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * <p>
 * <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/">Convert Sorted Array to Binary Search Tree</a>
 */
public class ConvertSortedArrayToBinarySearchTree {
	
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		
		int rootIndex = nums.length % 2 == 0 ? nums.length / 2 - 1 : nums.length / 2;
		TreeNode result = new TreeNode(nums[rootIndex]);
		result.right = sortedArrayToBST(Arrays.copyOfRange(nums, rootIndex + 1, nums.length));
		result.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, rootIndex));
		return result;
	}
}
