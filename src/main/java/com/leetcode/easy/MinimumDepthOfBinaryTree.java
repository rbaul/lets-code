package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

/**
 * Minimum Depth of Binary Tree
 * <p>
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 105].
 * -1000 <= Node.val <= 1000
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
 * <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">Minimum Depth of Binary Tree</a>
 */
public class MinimumDepthOfBinaryTree {
	
	public int minDepth(TreeNode root) {
		if (root == null) return 0;
		int[] min = new int[]{Integer.MAX_VALUE};
		minDepth(root, 1, min);
		return min[0];
	}
	
	private void minDepth(TreeNode root, int currentDepth, int[] min) {
		if (root.left == null && root.right == null) {
			if (min[0] > currentDepth) {
				min[0] = currentDepth;
			}
		}
		
		if (currentDepth > min[0]) return;
		
		if (root.left != null) {
			minDepth(root.left, currentDepth + 1, min);
		}
		
		if (root.right != null) {
			minDepth(root.right, currentDepth + 1, min);
		}
	}
}
