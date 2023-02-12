package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PathSumTest {
	
	private final PathSum test = new PathSum();
	
	@Test
	void hasPathSum_1() {
		TreeNode root = new TreeNode(5,
				new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
				new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1))));
		
		Assertions.assertTrue(test.hasPathSum(root, 22));
	}
	
	@Test
	void hasPathSum_2() {
		TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		
		Assertions.assertFalse(test.hasPathSum(root, 5));
	}
	
	@Test
	void hasPathSum_3() {
		Assertions.assertFalse(test.hasPathSum(null, 0));
	}
	
	@Test
	void hasPathSum_4() {
		TreeNode root = new TreeNode(1, new TreeNode(2), null);
		Assertions.assertFalse(test.hasPathSum(root, 1));
	}
	
	@Test
	void hasPathSum_5() {
		TreeNode root = new TreeNode(1, null, null);
		Assertions.assertTrue(test.hasPathSum(root, 1));
	}
	
	@Test
	void hasPathSum_6() {
		TreeNode root = new TreeNode(-2, null, new TreeNode(-3));
		Assertions.assertFalse(test.hasPathSum(root, -2));
	}
	
	@Test
	void hasPathSum_7() {
		TreeNode root = new TreeNode(1,
				new TreeNode(2, new TreeNode(3, new TreeNode(4, new TreeNode(5, null, null), null), null), null), null);
		Assertions.assertFalse(test.hasPathSum(root, 6));
	}
	
	@Test
	void hasPathSum_8() {
		TreeNode root = new TreeNode(1, new TreeNode(2), null);
		Assertions.assertFalse(test.hasPathSum(root, 2));
	}
}