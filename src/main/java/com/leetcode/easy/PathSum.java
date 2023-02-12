package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

/**
 * Path Sum
 * <p>
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * <p>
 * A leaf is a node with no children.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
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
 * <a href="https://leetcode.com/problems/path-sum/">Path Sum</a>
 */
public class PathSum {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) return false;
		return pathSum(root, 0, targetSum);
	}
	
	public boolean pathSum(TreeNode root, int curSum, int targetSum) {
		if (root.right == null && root.left == null) {
			return curSum + root.val == targetSum;
		} else {
			curSum += root.val;
			return (root.left != null && pathSum(root.left, curSum, targetSum)) || (root.right != null && pathSum(root.right, curSum, targetSum));
		}
	}
	
}
