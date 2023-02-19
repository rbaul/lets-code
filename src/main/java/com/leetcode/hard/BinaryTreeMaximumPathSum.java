package com.leetcode.hard;

import com.leetcode.utils.TreeNode;

/**
 * Binary Tree Maximum Path Sum
 * <p>
 * A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
 * <p>
 * The path sum of a path is the sum of the node's values in the path.
 * <p>
 * Given the root of a binary tree, return the maximum path sum of any non-empty path.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 3 * 104].
 * -1000 <= Node.val <= 1000
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
 * <a href="https://leetcode.com/problems/binary-tree-maximum-path-sum/">Binary Tree Maximum Path Sum</a>
 */
public class BinaryTreeMaximumPathSum {
	public int maxPathSum(TreeNode root) {
		int[] sumMax = new int[]{Integer.MIN_VALUE};
		maxPathSum(root, sumMax);
		return sumMax[0];
	}
	
	public int maxPathSum(TreeNode root, int[] sumMax) {
		if (root == null) {
			return 0;
		}
		int leftSum = maxPathSum(root.left, sumMax);
		int rightSum = maxPathSum(root.right, sumMax);
		sumMax[0] = Math.max(root.val + leftSum + rightSum, sumMax[0]);
		int ret = root.val + Math.max(leftSum, rightSum);
		return Math.max(ret, 0);
	}
}
