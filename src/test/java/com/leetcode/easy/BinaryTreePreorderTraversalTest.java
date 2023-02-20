package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePreorderTraversalTest {
	
	private final BinaryTreePreorderTraversal test = new BinaryTreePreorderTraversal();
	
	@Test
	void preorderTraversal_1() {
		assertEquals(Arrays.asList(1, 2, 3), test.preorderTraversal(TreeNode.createFromList(1, null, 2, null, null, 3, null)));
	}
	
	@Test
	void preorderTraversal_2() {
		assertEquals(List.of(), test.preorderTraversal(null));
	}
	
	@Test
	void preorderTraversal_3() {
		assertEquals(List.of(1), test.preorderTraversal(TreeNode.createFromList(1)));
	}
	
	@Test
	void preorderTraversal_4() {
		assertEquals(List.of(2,1,4,3), test.preorderTraversal(TreeNode.createFromList(2,1,3,null,4, null, null)));
	}
}