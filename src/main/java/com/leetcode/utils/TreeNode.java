package com.leetcode.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
	
	public static List<Integer> convertToListLevel2(TreeNode treeNode) {
		List<List<Integer>> result = new ArrayList<>();
		populateLevelList(treeNode, result, 0);
		
		return result.stream().flatMap(List::stream).collect(Collectors.toList());
	}
	
	private static void populateLevelList(TreeNode treeNode, List<List<Integer>> result, int level) {
		Integer value = treeNode == null ? null : treeNode.val;
		if (level == result.size()) {
			result.add(new ArrayList<>());
		}
		result.get(level).add(value);
		
		if (treeNode != null && (treeNode.left != null || treeNode.right != null)) {
			populateLevelList(treeNode.left, result, level + 1);
			populateLevelList(treeNode.right, result, level + 1);
		}
	}
	
	public static TreeNode createFromList(Integer... nums) {
		if (nums == null) {
			return null;
		}
		
		TreeNode root = new TreeNode(nums[0]);
		createFromList(root, 2, 0, Arrays.copyOfRange(nums, 1, nums.length));
		return root;
	}
	
	public static void createFromList(TreeNode root, int level, int index, Integer... nums) {
		if (nums == null || nums.length == 0) {
			return;
		}
		
		Integer leftVal = nums[index];
		if (leftVal != null) {
			root.left = new TreeNode(leftVal);
			if (level < nums.length) {
				createFromList(root.left, level * 2, index * 2, Arrays.copyOfRange(nums, level, nums.length));
			}
		}
		
		if (index + 1 < nums.length) {
			Integer rightVal = nums[index + 1];
			if (rightVal != null) {
				root.right = new TreeNode(rightVal);
				if (level < nums.length) {
					createFromList(root.right, level * 2, index * 2 + 2, Arrays.copyOfRange(nums, level, nums.length));
				}
			}
		}
	}
	
}