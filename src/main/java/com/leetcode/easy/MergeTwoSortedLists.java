package com.leetcode.easy;

/**
 * Merge Two Sorted Lists
 * <p>
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 * <p>
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode result = null;
		
		ListNode curResult = null;
		ListNode curList1 = list1;
		ListNode curList2 = list2;
		
		while (curList1 != null || curList2 != null) {
			int resultToSet;
			
			if (curList1 != null && curList2 != null) {
				if (curList1.val < curList2.val) {
					resultToSet = curList1.val;
					curList1 = curList1.next;
				} else {
					resultToSet = curList2.val;
					curList2 = curList2.next;
				}
			} else if (curList1 != null) {
				resultToSet = curList1.val;
				curList1 = curList1.next;
			} else {
				resultToSet = curList2.val;
				curList2 = curList2.next;
			}
			ListNode listNode = new ListNode(resultToSet);
			
			if (result == null) {
				result = listNode;
			} else {
				curResult.next = listNode;
			}
			curResult = listNode;
		}
		
		return result;
	}
	
	public static class ListNode {
		int val;
		ListNode next;
		
		ListNode() {
		}
		
		ListNode(int val) {
			this.val = val;
		}
		
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
		
	}
}
