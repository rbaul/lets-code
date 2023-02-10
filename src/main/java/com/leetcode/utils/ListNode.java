package com.leetcode.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
	public int val;
	public ListNode next;
	
	ListNode() {
	}
	
	ListNode(int val) {
		this.val = val;
	}
	
	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof ListNode listNode)) return false;
		
		if (val != listNode.val) return false;
		return Objects.equals(next, listNode.next);
	}
	
	@Override
	public int hashCode() {
		int result = val;
		result = 31 * result + (next != null ? next.hashCode() : 0);
		return result;
	}
	
	public static ListNode create(List<Integer> list) {
		if (list.isEmpty()) {
			return new ListNode();
		} else {
			ListNode result = new ListNode(list.get(0));
			ListNode current = result;
			for (int i = 1; i < list.size(); i++) {
				current.next = new ListNode(list.get(i));
				current = current.next;
			}
			return result;
		}
	}
	
	public static List<Integer> convertToList(ListNode list) {
		List<Integer> result = new ArrayList<>();
		ListNode curList = list;
		
		while (curList != null) {
			result.add(curList.val);
			curList = curList.next;
		}
		
		return result;
	}
	
	public boolean compareTwoLists(ListNode list1, ListNode list2) {
		ListNode curList1 = list1;
		ListNode curList2 = list2;
		
		while (curList1 != null && curList2 != null) {
			if (curList1.val != curList2.val) {
				return false;
			}
			curList1 = curList1.next;
			curList2 = curList2.next;
		}
		
		return curList1 == null && curList2 == null;
	}
	
}