package com.leetcode.easy;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Binary Tree Postorder Traversal
 * <p>
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 * <p>
 * <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/description/">Binary Tree Postorder Traversal</a>
 */
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		
		if (root == null) return list;
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			list.add(0, cur.val);
			if (cur.left != null)
				stack.push(cur.left);
			if (cur.right != null)
				stack.push(cur.right);
		}
		
		return list;
	}

//	public List<Integer> postorderTraversal(TreeNode root) {
//		List<Integer> list = new ArrayList<>();
//		postorderTraversal(root, list);
//		return list;
//	}
//
//	private void postorderTraversal(TreeNode root, List<Integer> list) {
//		if (root == null) {
//			return;
//		}
//
//		postorderTraversal(root.left, list);
//		postorderTraversal(root.right, list);
//		list.add(root.val);
//	}
}
