package com.leetcode.hard;

import com.leetcode.utils.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;


class CopyListWithRandomPointerTest {
	
	private final CopyListWithRandomPointer test = new CopyListWithRandomPointer();
	
	@Test
	@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
	void copyRandomList_1() {
		Node node1 = new Node(7);
		Node node2 = new Node(13);
		Node node3 = new Node(11);
		Node node4 = new Node(10);
		Node node5 = new Node(1);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		node5.random = node1;
		node2.random = node1;
		node3.random = node5;
		node4.random = node3;
		
		Assertions.assertEquals(Node.convertToList(node1), Node.convertToList(test.copyRandomList(node1)));
	}
	
	@Test
	void copyRandomList_2() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		
		node1.next = node2;
		node1.random = node2;
		node2.random = node2;
		
		Assertions.assertEquals(Node.convertToList(node1), Node.convertToList(test.copyRandomList(node1)));
	}
	
	@Test
	void copyRandomList_3() {
		Node node1 = new Node(3);
		Node node2 = new Node(3);
		Node node3 = new Node(3);
		
		node1.next = node2;
		node2.next = node3;
		
		node2.random = node1;
		
		Assertions.assertEquals(Node.convertToList(node1), Node.convertToList(test.copyRandomList(node1)));
	}
}