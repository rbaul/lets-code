package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

/**
 * Maximum Depth of Binary Tree
 * <p>
 * Given the root of a binary tree, return its maximum depth.
 * <p>
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 104].
 * -100 <= Node.val <= 100
 * <p>
 *
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">...</a>
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
 */
public class MaximumDepthOfBinaryTree {
	
	public int maxDepth(TreeNode root) {
		int[] maxLevel = new int[]{0};
		maxLevel(root, 1, maxLevel);
		return maxLevel[0];
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
