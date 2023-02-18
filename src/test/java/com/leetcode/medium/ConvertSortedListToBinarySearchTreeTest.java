package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConvertSortedListToBinarySearchTreeTest {
	
	private final ConvertSortedListToBinarySearchTree test = new ConvertSortedListToBinarySearchTree();
	
	@Test
	void sortedListToBST_1() {
		assertEquals(Arrays.asList(0, -3, 9, -10, null, 5, null), TreeNode.convertToListLevel2(test.sortedListToBST(ListNode.create(-10, -3, 0, 5, 9))));
	}
	
	@Test
	void sortedListToBST_2() {
		assertNull(test.sortedListToBST(null));
	}
	
	@Test
	void sortedListToBST_3() {
		assertEquals(Arrays.asList(3, 1, 5, 0, 2, 4, null), TreeNode.convertToListLevel2(test.sortedListToBST(ListNode.create(0, 1, 2, 3, 4, 5))));
	}
}