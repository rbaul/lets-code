package com.leetcode.hard;

import com.leetcode.utils.ListNode;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Merge k Sorted Lists
 * <p>
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * <p>
 * Merge all the linked-lists into one sorted linked-list and return it.
 * <p>
 * Constraints:
 * <p>
 * k == lists.length
 * 0 <= k <= 104
 * 0 <= lists[i].length <= 500
 * -104 <= lists[i][j] <= 104
 * lists[i] is sorted in ascending order.
 * The sum of lists[i].length will not exceed 104.
 * <p>
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">Merge k Sorted Lists</a>
 * <p>
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
public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode result = null;
		ListNode curResult = null;
		
		List<ListNode> listNodes = Arrays.stream(lists)
				.filter(Objects::nonNull).collect(Collectors.toList());
		
		while (listNodes.size() > 0) {
			
			// Find Minimum
			ListNode minListNode = new ListNode(Integer.MAX_VALUE);
			int index = 0;
			for (int i = 0; i < listNodes.size(); i++) {
				ListNode listNode = listNodes.get(i);
				if (listNode != null && minListNode.val > listNode.val) {
					minListNode = listNode;
					index = i;
				}
			}
			
			if (result == null) {
				result = minListNode;
			} else {
				curResult.next = minListNode;
			}
			curResult = minListNode;
			
			// Next for index and remove if not relevant
			if (minListNode.next == null) {
				listNodes.remove(index);
			} else {
				listNodes.set(index, minListNode.next);
			}
		}
		
		return result;
	}
}
