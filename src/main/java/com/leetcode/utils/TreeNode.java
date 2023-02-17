package com.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode() {
	}
	
	public TreeNode(int val) {
		this.val = val;
	}
	
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static List<Integer> convertToListLevel(TreeNode treeNode) {
		List<Integer> result = new ArrayList<>();
		populateLevelList(treeNode, result);
		return result;
	}
	
	private static void populateLevelList(TreeNode treeNode, List<Integer> result) {
		Integer value = treeNode == null ? null : treeNode.val;
		result.add(value);
		if (treeNode != null && (treeNode.left != null || treeNode.right != null)) {
			populateLevelList(treeNode.left, result);
			populateLevelList(treeNode.right, result);
		}
	}
}