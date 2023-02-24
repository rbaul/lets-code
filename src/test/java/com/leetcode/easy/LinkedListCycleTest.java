package com.leetcode.easy;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
	
	private final LinkedListCycle test = new LinkedListCycle();
	
	@Test
	void hasCycle_1() {
		ListNode last = new ListNode(-4);
		ListNode next = new ListNode(2, new ListNode(0, last));
		last.next = next;
		ListNode head = new ListNode(3, next);
		assertTrue(test.hasCycle(head));
	}
	
	@Test
	void hasCycle_2() {
		ListNode next = new ListNode(2);
		ListNode head = new ListNode(1, next);
		next.next = head;
		assertTrue(test.hasCycle(head));
	}
	
	@Test
	void hasCycle_3() {
		assertFalse(test.hasCycle(new ListNode(1)));
	}
}