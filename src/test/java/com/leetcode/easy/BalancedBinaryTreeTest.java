package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBinaryTreeTest {
	
	private final BalancedBinaryTree test = new BalancedBinaryTree();
	
	@Test
	void isBalanced_1() {
		assertTrue(test.isBalanced(TreeNode.createFromList(3, 9, 20, null, null, 15, 7)));
	}
	
	@Test
	void isBalanced_2() {
		assertFalse(test.isBalanced(TreeNode.createFromList(1, 2, 2, 3, 3, null, null, 4, 4, null, null)));
	}
	
	@Test
	void isBalanced_3() {
		assertTrue(test.isBalanced(null));
	}
}