package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumDepthOfBinaryTreeTest {
	
	private final MaximumDepthOfBinaryTree test = new MaximumDepthOfBinaryTree();
	
	@Test
	void maxDepth_1() {
		TreeNode treeNode1 = new TreeNode(15);
		TreeNode treeNode2 = new TreeNode(7);
		TreeNode treeNode3 = new TreeNode(20, treeNode1, treeNode2);
		TreeNode treeNode4 = new TreeNode(9);
		TreeNode treeNode0 = new TreeNode(3, treeNode4, treeNode3);
		
		Assertions.assertEquals(3, test.maxDepth(treeNode0));
	}
	
	@Test
	void maxDepth_2() {
		TreeNode treeNode1 = new TreeNode(2);
		TreeNode treeNode0 = new TreeNode(1, null, treeNode1);
		
		Assertions.assertEquals(2, test.maxDepth(treeNode0));
	}
}