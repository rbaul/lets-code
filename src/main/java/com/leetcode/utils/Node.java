package com.leetcode.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Definition for a Node.
 */
public class Node {
	public int val;
	public Node next;
	public Node random;
	
	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
	
	public static List<List<Integer>> convertToList(Node node) {
		List<List<Integer>> result = new ArrayList<>();
		
		Node currNode = node;
		
		Map<Node, Integer> mapToIndex = new HashMap<>();
		
		int i = 0;
		while (currNode != null) {
			mapToIndex.put(currNode, i);
			result.add(Arrays.asList(currNode.val, null));
			
			i++;
			currNode = currNode.next;
		}
		
		currNode = node;
		while (currNode != null) {
			Integer index = mapToIndex.get(currNode);
			Node random = currNode.random;
			if (random != null && index != null) {
				Integer indexOfRandom = mapToIndex.get(random);
				if (indexOfRandom != null) {
					result.get(index).set(1, indexOfRandom);
				}
			}
			currNode = currNode.next;
		}
		
		return result;
	}
}