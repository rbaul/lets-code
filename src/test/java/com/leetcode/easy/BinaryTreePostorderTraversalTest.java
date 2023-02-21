package com.leetcode.easy;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePostorderTraversalTest {
	
	private final BinaryTreePostorderTraversal test = new BinaryTreePostorderTraversal();
	
	@Test
	void postorderTraversal_1() {
		assertEquals(Arrays.asList(3, 2, 1), test.postorderTraversal(TreeNode.createFromList(1, null, 2, null, null, 3, null)));
	}
	
	@Test
	void postorderTraversal_2() {
		assertEquals(List.of(), test.postorderTraversal(null));
	}
	
	@Test
	void postorderTraversal_3() {
		assertEquals(List.of(1), test.postorderTraversal(TreeNode.createFromList(1)));
	}
	
	@Test
	void postorderTraversal_4() {
		assertEquals(List.of(4, 1, 3, 2), test.postorderTraversal(TreeNode.createFromList(2, 1, 3, null, 4, null, null)));
	}
}