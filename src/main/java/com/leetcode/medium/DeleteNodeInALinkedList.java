package com.leetcode.medium;

import com.leetcode.utils.ListNode;

/**
 * Delete Node in a Linked List
 * <p>
 * There is a singly-linked list head and we want to delete a node node in it.
 * <p>
 * You are given the node to be deleted node. You will not be given access to the first node of head.
 * <p>
 * All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.
 * <p>
 * Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
 * <p>
 * The value of the given node should not exist in the linked list.
 * The number of nodes in the linked list should decrease by one.
 * All the values before node should be in the same order.
 * All the values after node should be in the same order.
 * Custom testing:
 * <p>
 * For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
 * We will build the linked list and pass the node to your function.
 * The output will be the entire list after calling your function.
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the given list is in the range [2, 1000].
 * -1000 <= Node.val <= 1000
 * The value of each node in the list is unique.
 * The node to be deleted is in the list and is not a tail node.
 * <p>
 * * Definition for singly-linked list.
 * * public class ListNode {
 * *     int val;
 * *     ListNode next;
 * *     ListNode(int x) { val = x; }
 * * }
 * <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/description/">Delete Node in a Linked List</a>
 */
public class DeleteNodeInALinkedList {
	
	ListNode head;
	
	public DeleteNodeInALinkedList(ListNode head) {
		this.head = head;
	}
	
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
