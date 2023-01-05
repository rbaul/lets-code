package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
	
	@Test
	void addTwoNumbers() {
		AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2, new AddTwoNumbers.ListNode(4, new AddTwoNumbers.ListNode(3)));
		AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5, new AddTwoNumbers.ListNode(6, new AddTwoNumbers.ListNode(4)));
		AddTwoNumbers.ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
		
		Assertions.assertEquals(7, result.val);
		Assertions.assertEquals(0, result.next.val);
		Assertions.assertEquals(8, result.next.next.val);
		Assertions.assertNull(result.next.next.next);
	}
	
	@Test
	void addTwoNumbers_9() {
		AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9))));
		AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9,
				new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9, new AddTwoNumbers.ListNode(9)))))));
		AddTwoNumbers.ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
		
		Assertions.assertEquals(8, result.val);
		Assertions.assertEquals(9, result.next.val);
		Assertions.assertEquals(9, result.next.next.val);
		Assertions.assertEquals(9, result.next.next.next.val);
		Assertions.assertEquals(0, result.next.next.next.next.val);
		Assertions.assertEquals(0, result.next.next.next.next.next.val);
		Assertions.assertEquals(0, result.next.next.next.next.next.next.val);
		Assertions.assertEquals(1, result.next.next.next.next.next.next.next.val);
		Assertions.assertNull(result.next.next.next.next.next.next.next.next);
	}
}