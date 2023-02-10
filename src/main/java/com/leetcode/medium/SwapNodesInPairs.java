package com.leetcode.medium;

import com.leetcode.utils.ListNode;

/**
 * Swap Nodes in Pairs
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 100].
 * 0 <= Node.val <= 100
 * <p>
 * <a href="https://leetcode.com/problems/swap-nodes-in-pairs/">Swap Nodes in Pairs</a>
 */
public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
		ListNode result = head;
		ListNode startHead = head;
		ListNode prevNode = null;
		
		boolean flag = true;
		while (startHead != null && startHead.next != null) {
			ListNode temp = startHead.next;
			
			startHead.next = temp.next;
			temp.next = startHead;
			
			if (prevNode != null) {
				prevNode.next = temp;
			}
			
			if (flag) {
				result = temp;
				flag = false;
			}
			
			prevNode = startHead;
			startHead = startHead.next;
		}
		
		return result;
	}
}
