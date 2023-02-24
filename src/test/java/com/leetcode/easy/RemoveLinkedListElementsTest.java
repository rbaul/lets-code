package com.leetcode.easy;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveLinkedListElementsTest {
	
	private final RemoveLinkedListElements test = new RemoveLinkedListElements();
	
	@Test
	void removeElements_1() {
		Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5), ListNode.convertToList(test.removeElements(ListNode.create(1, 2, 6, 3, 4, 5, 6), 6)));
	}
	
	@Test
	void removeElements_2() {
		Assertions.assertNull(test.removeElements(null, 1));
	}
	
	@Test
	void removeElements_3() {
		Assertions.assertNull(test.removeElements(ListNode.create(7, 7, 7, 7), 7));
	}
}