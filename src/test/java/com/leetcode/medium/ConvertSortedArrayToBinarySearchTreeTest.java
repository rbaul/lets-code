package com.leetcode.medium;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertSortedArrayToBinarySearchTreeTest {
	
	private final ConvertSortedArrayToBinarySearchTree test = new ConvertSortedArrayToBinarySearchTree();
	
	@Test
	void sortedArrayToBST_1() {
		TreeNode treeNode = test.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});
		assertEquals(Arrays.asList(0, -10, null, -3, 5, null, 9), TreeNode.convertToListLevel(treeNode));
	}
	
	@Test
	void sortedArrayToBST_2() {
		TreeNode treeNode = test.sortedArrayToBST(new int[]{1, 3});
		assertEquals(Arrays.asList(1, null, 3), TreeNode.convertToListLevel(treeNode));
	}
}