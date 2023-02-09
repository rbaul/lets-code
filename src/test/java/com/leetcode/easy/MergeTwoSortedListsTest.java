package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MergeTwoSortedListsTest {
	
	private final MergeTwoSortedLists test = new MergeTwoSortedLists();
	
	public MergeTwoSortedLists.ListNode create(List<Integer> list) {
		if (list.isEmpty()) {
			return new MergeTwoSortedLists.ListNode();
		} else {
			MergeTwoSortedLists.ListNode result = new MergeTwoSortedLists.ListNode(list.get(0));
			MergeTwoSortedLists.ListNode current = result;
			for (int i = 1; i < list.size(); i++) {
				current.next = new MergeTwoSortedLists.ListNode(list.get(i));
				current = current.next;
			}
			return result;
		}
	}
	
	public List<Integer> convertToList(MergeTwoSortedLists.ListNode list) {
		List<Integer> result = new ArrayList<>();
		MergeTwoSortedLists.ListNode curList = list;
		
		while (curList != null) {
			result.add(curList.val);
			curList = curList.next;
		}
		
		return result;
	}
	
	public boolean compareTwoLists(MergeTwoSortedLists.ListNode list1, MergeTwoSortedLists.ListNode list2) {
		MergeTwoSortedLists.ListNode curList1 = list1;
		MergeTwoSortedLists.ListNode curList2 = list2;
		
		while (curList1 != null && curList2 != null) {
			if (curList1.val != curList2.val) {
				return false;
			}
			curList1 = curList1.next;
			curList2 = curList2.next;
		}
		
		return curList1 == null && curList2 == null;
	}
	
	@Test
	void mergeTwoLists_1() {
		MergeTwoSortedLists.ListNode list1 = create(List.of(1, 2, 4));
		MergeTwoSortedLists.ListNode list2 = create(List.of(1, 3, 4));
		MergeTwoSortedLists.ListNode expectedResult = create(List.of(1, 1, 2, 3, 4, 4));
		Assertions.assertEquals(convertToList(expectedResult), convertToList(test.mergeTwoLists(list1, list2)));
	}
	
	@Test
	void mergeTwoLists_2() {
		MergeTwoSortedLists.ListNode list1 = null;
		MergeTwoSortedLists.ListNode list2 = null;
		MergeTwoSortedLists.ListNode expectedResult = null;
		Assertions.assertEquals(expectedResult, test.mergeTwoLists(list1, list2));
	}
	
	@Test
	void mergeTwoLists_3() {
		MergeTwoSortedLists.ListNode list1 = null;
		MergeTwoSortedLists.ListNode list2 = create(List.of(0));
		MergeTwoSortedLists.ListNode expectedResult = create(List.of(0));
		Assertions.assertEquals(convertToList(expectedResult), convertToList(test.mergeTwoLists(list1, list2)));
	}
}