package com.leetcode.hard;

import com.leetcode.utils.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * Copy List with Random Pointer
 * <p>
 * A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
 * <p>
 * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
 * <p>
 * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.
 * <p>
 * Return the head of the copied linked list.
 * <p>
 * The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of [val, random_index] where:
 * <p>
 * val: an integer representing Node.val
 * random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does not point to any node.
 * Your code will only be given the head of the original linked list.
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 1000
 * -104 <= Node.val <= 104
 * Node.random is null or is pointing to some node in the linked list.
 * <p>
 * <a href="https://leetcode.com/problems/copy-list-with-random-pointer/">Copy List with Random Pointer</a>
 * <p>
 * // Definition for a Node.
 * class Node {
 *     int val;
 *     Node next;
 *     Node random;
 *     public Node(int val) {
 *         this.val = val;
 *         this.next = null;
 *         this.random = null;
 *     }
 * }
 */
public class CopyListWithRandomPointer {
	
	public Node copyRandomList(Node head) {
		Node copyHead = null;
		Node currentCopyHead = null;
		
		Node currStart = head;
		
		Map<Node, Integer> mapToIndex = new HashMap<>();
		
		Map<Integer, Node> copyNodeMap = new HashMap<>();
		
		int i = 0;
		while (currStart != null) {
			mapToIndex.put(currStart, i);
			Node node = new Node(currStart.val);
			copyNodeMap.put(i, node);
			
			if (copyHead == null) {
				copyHead = node;
				currentCopyHead = node;
			} else {
				currentCopyHead.next = node;
				currentCopyHead = currentCopyHead.next;
			}
			
			currStart = currStart.next;
			i++;
		}
		
		currStart = head;
		while (currStart != null) {
			Integer index = mapToIndex.get(currStart);
			Node random = currStart.random;
			if (random != null && index != null) {
				Integer indexOfRandom = mapToIndex.get(random);
				if (indexOfRandom != null) {
					copyNodeMap.get(index).random = copyNodeMap.get(indexOfRandom);
				}
			}
			currStart = currStart.next;
		}
		
		return copyHead;
	}
}
