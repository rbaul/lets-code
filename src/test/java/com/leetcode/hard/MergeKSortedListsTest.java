package com.leetcode.hard;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeKSortedListsTest {
	
	private final MergeKSortedLists test = new MergeKSortedLists();
	
	@Test
	void mergeKLists_1() {
		Assertions.assertEquals(ListNode.convertToList(ListNode.create(1, 1, 2, 3, 4, 4, 5, 6)),
				ListNode.convertToList(test.mergeKLists(new ListNode[]{
						ListNode.create(1, 4, 5),
						ListNode.create(1, 3, 4),
						ListNode.create(2, 6)
				})));
	}
	
	@Test
	void mergeKLists_2() {
		Assertions.assertNull(test.mergeKLists(new ListNode[]{}));
	}
	
	@Test
	void mergeKLists_3() {
		Assertions.assertNull(test.mergeKLists(new ListNode[]{null}));
	}
}