package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveNodesFromLinkedListTest {
	
	private final RemoveNodesFromLinkedList test = new RemoveNodesFromLinkedList();
	
	@Test
	void removeNodes_1() {
		assertEquals(Arrays.asList(13, 8), ListNode.convertToList(test.removeNodes(ListNode.create(5, 2, 13, 3, 8))));
	}
	
	@Test
	void removeNodes_2() {
		assertEquals(Arrays.asList(1, 1, 1, 1), ListNode.convertToList(test.removeNodes(ListNode.create(1, 1, 1, 1))));
	}
	
	@Test
	void removeNodes_3() {
		assertEquals(Arrays.asList(16, 13, 8), ListNode.convertToList(test.removeNodes(ListNode.create(16, 5, 2, 13, 3, 8))));
	}
	
	@Test
	void removeNodes_4() {
		assertEquals(Arrays.asList(13, 8), ListNode.convertToList(test.removeNodes(ListNode.create(10, 5, 2, 13, 3, 8))));
	}
}