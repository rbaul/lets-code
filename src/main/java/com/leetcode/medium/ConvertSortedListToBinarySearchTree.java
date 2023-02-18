package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert Sorted List to Binary Search Tree
 * <p>
 * Given the head of a singly linked list where elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in head is in the range [0, 2 * 10^4].
 * -10^5 <= Node.val <= 10^5
 * <p>
 * * Definition for singly-linked list.
 * * public class ListNode {
 * *     int val;
 * *     ListNode next;
 * *     ListNode() {}
 * *     ListNode(int val) { this.val = val; }
 * *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * * }
 * <p>
 * * Definition for a binary tree node.
 * * public class TreeNode {
 * *     int val;
 * *     TreeNode left;
 * *     TreeNode right;
 * *     TreeNode() {}
 * *     TreeNode(int val) { this.val = val; }
 * *     TreeNode(int val, TreeNode left, TreeNode right) {
 * *         this.val = val;
 * *         this.left = left;
 * *         this.right = right;
 * *     }
 * * }
 * <p>
 * <p>
 * <a href="https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/">Convert Sorted List to Binary Search Tree</a>
 */
public class ConvertSortedListToBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) return null;
		ListNode start = head;
		
		List<Integer> list = new ArrayList<>();
		while (start != null) {
			list.add(start.val);
			start = start.next;
		}
		return sortedArrayToBST(list);
	}
	
	public TreeNode sortedArrayToBST(List<Integer> nums) {
		if (nums.size() == 0) {
			return null;
		}
		int rootIndex = nums.size() / 2;
		TreeNode result = new TreeNode(nums.get(rootIndex));
		result.right = sortedArrayToBST(nums.subList(rootIndex + 1, nums.size()));
		result.left = sortedArrayToBST(nums.subList(0, rootIndex));
		return result;
	}
}
