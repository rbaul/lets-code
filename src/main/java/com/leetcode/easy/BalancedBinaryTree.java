package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

/**
 * Balanced Binary Tree
 * <p>
 * Given a binary tree, determine if it is height-balanced
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * -10^4 <= Node.val <= 10^4
 * <p>
 * <a href="https://leetcode.com/problems/balanced-binary-tree/">Balanced Binary Tree</a>
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int[] maxLevelRight = new int[]{0};
		int[] maxLevelLeft = new int[]{0};
		maxLevel(root.left, 1, maxLevelLeft);
		maxLevel(root.right, 1, maxLevelRight);
		
		return Math.abs(maxLevelRight[0] - maxLevelLeft[0]) <= 1 && isBalanced(root.right) && isBalanced(root.left);
	}
	
	private void maxLevel(TreeNode root, Integer level, int[] maxLevel) {
		if (root == null) return;
		
		if (level > maxLevel[0]) {
			maxLevel[0] = level;
		}
		maxLevel(root.left, level + 1, maxLevel);
		maxLevel(root.right, level + 1, maxLevel);
	}
}
