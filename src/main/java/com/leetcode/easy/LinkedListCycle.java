package com.leetcode.easy;

import com.leetcode.utils.ListNode;

/**
 * Linked List Cycle
 * <p>
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the list is in the range [0, 104].
 * -10^5 <= Node.val <= 10^5
 * pos is -1 or a valid index in the linked-list.
 * <p>
 * <p>
 * Follow up: Can you solve it using O(1) (i.e. constant) memory?
 *  * Definition for singly-linked list.
 *  * class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode(int x) {
 *  *         val = x;
 *  *         next = null;
 *  *     }
 *  * }
 * <p>
 * <a href="https://leetcode.com/problems/linked-list-cycle/">Linked List Cycle</a>
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if (head == null) return false;
		ListNode faster = head.next;
		while (head != null && faster != null) {
			if (head == faster) {
				return true;
			}
			head = head.next;
			if (faster.next == null) {
				return false;
			}
			faster = faster.next.next;
		}
		return false;
	}
}
