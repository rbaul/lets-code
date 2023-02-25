package com.leetcode.easy;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {
	
	private final ReverseLinkedList test = new ReverseLinkedList();
	
	@Test
	void reverseList_1() {
		assertEquals(Arrays.asList(5, 4, 3, 2, 1), ListNode.convertToList(test.reverseList(ListNode.create(1, 2, 3, 4, 5))));
	}
	
	@Test
	void reverseList_2() {
		assertEquals(Arrays.asList(2, 1), ListNode.convertToList(test.reverseList(ListNode.create(1, 2))));
	}
	
	@Test
	void reverseList_3() {
		assertNull(test.reverseList(null));
	}
}