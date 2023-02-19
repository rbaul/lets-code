package com.leetcode.hard;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeMaximumPathSumTest {
	
	private final BinaryTreeMaximumPathSum test = new BinaryTreeMaximumPathSum();
	
	@Test
	void maxPathSum_1() {
		assertEquals(6, test.maxPathSum(TreeNode.createFromList(1, 2, 3)));
	}
	
	@Test
	void maxPathSum_2() {
		assertEquals(42, test.maxPathSum(TreeNode.createFromList(-10, 9, 20, null, null, 15, 7)));
	}
	
	@Test
	void maxPathSum_3() {
		assertEquals(-3, test.maxPathSum(TreeNode.createFromList(-3)));
	}
	
	@Test
	void maxPathSum_4() {
		assertEquals(2, test.maxPathSum(TreeNode.createFromList(2, -1)));
	}
}