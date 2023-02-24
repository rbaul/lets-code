package com.leetcode.medium;

import com.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteNodeInALinkedListTest {
	
	@Test
	void deleteNode_1() {
		ListNode head = ListNode.create(4, 5, 1, 9);
		DeleteNodeInALinkedList test = new DeleteNodeInALinkedList(head);
		test.deleteNode(head.next);
		assertEquals(List.of(4, 1, 9), ListNode.convertToList(head));
	}
	
	@Test
	void deleteNode_2() {
		ListNode head = ListNode.create(4,5,1,9);
		DeleteNodeInALinkedList test = new DeleteNodeInALinkedList(head);
		test.deleteNode(head.next.next);
		assertEquals(List.of(4, 5, 9), ListNode.convertToList(head));
	}
}