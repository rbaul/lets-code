package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

/**
 * Validate Binary Search Tree
 * <p>
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * <p>
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 104].
 * -231 <= Node.val <= 231 - 1
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 * <p>
 * <a href="https://leetcode.com/problems/validate-binary-search-tree/">Validate Binary Search Tree</a>
 */
public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return isValidBSTRecursion(root, null, null);
	}
	
	private boolean isValidBSTRecursion(TreeNode root, Integer minValue, Integer maxValue) {
		if (root == null) {
			return true;
		}
		int value = root.val;
		boolean isValid = (minValue == null || value > minValue)  && (maxValue == null || value < maxValue);
		
		return isValid && isValidBSTRecursion(root.left, minValue, value) && isValidBSTRecursion(root.right, value, maxValue);
	}
	
}
