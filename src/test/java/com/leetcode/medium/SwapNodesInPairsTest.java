package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SwapNodesInPairsTest {
	
	private final SwapNodesInPairs test = new SwapNodesInPairs();
	
	@Test
	void swapPairs_1() {
		Assertions.assertEquals(ListNode.convertToList(ListNode.create(List.of(2,1,4,3))), ListNode.convertToList(test.swapPairs(ListNode.create(List.of(1, 2, 3, 4)))));
	}
	
	@Test
	void swapPairs_2() {
		Assertions.assertNull(test.swapPairs(null));
	}
	
	@Test
	void swapPairs_3() {
		Assertions.assertEquals(ListNode.create(List.of(1)), test.swapPairs(ListNode.create(List.of(1))));
	}
}