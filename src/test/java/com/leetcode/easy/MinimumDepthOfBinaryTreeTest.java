package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumDepthOfBinaryTreeTest {
	
	private final MinimumDepthOfBinaryTree test = new MinimumDepthOfBinaryTree();
	
	@Test
	void minDepth_1() {
		TreeNode root = new TreeNode(3,
				new TreeNode(9), new TreeNode(20,
				new TreeNode(15), new TreeNode(7)));
		
		Assertions.assertEquals(2, test.minDepth(root));
	}
	
	@Test
	void minDepth_2() {
		TreeNode root = new TreeNode(2,
				null, new TreeNode(3,
				null, new TreeNode(4,
				null, new TreeNode(5,
				null, new TreeNode(6)))));
		
		Assertions.assertEquals(5, test.minDepth(root));
	}
}