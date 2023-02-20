package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Binary Tree Preorder Traversal
 * <p>
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 * <p>
 * <p>
 * Follow up: Recursive solution is trivial, could you do it<a href=" iteratively?
 * <p>
 * https://leetcode.com/problems/binary-tree-preorde">Binary Tree Preorder Traversal</a>r-traversal/description/
 */
public class BinaryTreePreorderTraversal {
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		LinkedList<TreeNode> queue = new LinkedList<>();
		
		TreeNode currentR = root;
		while (currentR != null) {
			list.add(currentR.val);
			queue.add(currentR);
			currentR = currentR.left;
			while (currentR == null && !queue.isEmpty()) {
				currentR = queue.removeLast().right;
			}
		}
		
		return list;
	}
	
//	public List<Integer> preorderTraversal(TreeNode root) {
//		List<Integer> list = new ArrayList<>();
//		preorderTraversal(root, list);
//		return list;
//	}
//
//	private void preorderTraversal(TreeNode root, List<Integer> list) {
//		if (root == null) {
//			return;
//		}
//
//		list.add(root.val);
//
//		preorderTraversal(root.left, list);
//		preorderTraversal(root.right, list);
//	}
}
