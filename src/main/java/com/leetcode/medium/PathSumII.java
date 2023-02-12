package com.leetcode.medium;

import com.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Path Sum II
 * <p>
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
 * <p>
 * A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5000].
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 * <p>
 * <a href="https://leetcode.com/problems/path-sum-ii/">Path Sum II</a>
 */
public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> result = new ArrayList<>();
		
		if (root != null) {
			pathSum(root, 0, targetSum, new ArrayList<>(), result);
		}
		
		return result;
	}
	
	private void pathSum(TreeNode root, int curSum, int targetSum, List<Integer> currentList, List<List<Integer>> result) {
		if (root.right == null && root.left == null) {
			if (curSum + root.val == targetSum) {
				currentList.add(root.val);
				result.add(new ArrayList<>(currentList));
				currentList.remove(currentList.size() - 1);
			}
		} else {
			curSum += root.val;
			currentList.add(root.val);
			if (root.left != null) {
				pathSum(root.left, curSum, targetSum, currentList, result);
			}
			
			if (root.right != null) {
				pathSum(root.right, curSum, targetSum, currentList, result);
			}
			currentList.remove(currentList.size() - 1);
		}
	}
}
