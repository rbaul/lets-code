package com.leetcode.medium;

/**
 * Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 *
 * <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 */
public class AddTwoNumbers {
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode accamulation = null;
		int temp = 0;
		ListNode pointerL1 = l1;
		ListNode pointerL2 = l2;
		ListNode pointerPrevAcc = null;
		
		do {
			ListNode current = new ListNode();
			if (accamulation == null) {
				accamulation = current;
			} else {
				pointerPrevAcc.next = current;
			}
			int sum = pointerL1.val + pointerL2.val + temp;
			current.val = sum % 10;
			temp = sum / 10;
			
			pointerL1 = pointerL1.next;
			pointerL2 = pointerL2.next;
			pointerPrevAcc = current;
		} while (pointerL1 != null && pointerL2 != null);
		
		while (pointerL1 != null) {
			ListNode current = new ListNode();
			pointerPrevAcc.next = current;
			
			int sum = pointerL1.val + temp;
			current.val = sum % 10;
			temp = sum / 10;
			
			pointerL1 = pointerL1.next;
			pointerPrevAcc = current;
		}
		
		while (pointerL2 != null) {
			ListNode current = new ListNode();
			pointerPrevAcc.next = current;
			
			int sum = pointerL2.val + temp;
			current.val = sum % 10;
			temp = sum / 10;
			
			pointerL2 = pointerL2.next;
			pointerPrevAcc = current;
		}
		
		if (temp > 0) {
			pointerPrevAcc.next = new ListNode(temp);
		}
		
		return accamulation;
	}
	
	public static class ListNode {
		int val;
		ListNode next;
		
		public ListNode() {
		}
		
		public ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
