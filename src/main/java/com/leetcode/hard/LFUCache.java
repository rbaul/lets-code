package com.leetcode.hard;

import java.util.HashMap;
import java.util.Map;

/**
 * LFU Cache
 * <p>
 * Design and implement a data structure for a Least Frequently Used (LFU) cache.
 * <p>
 * Implement the LFUCache class:
 * <p>
 * LFUCache(int capacity) Initializes the object with the capacity of the data structure.
 * int get(int key) Gets the value of the key if the key exists in the cache. Otherwise, returns -1.
 * void put(int key, int value) Update the value of the key if present, or inserts the key if not already present. When the cache reaches its capacity, it should invalidate and remove the least frequently used key before inserting a new item. For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.
 * To determine the least frequently used key, a use counter is maintained for each key in the cache. The key with the smallest use counter is the least frequently used key.
 * <p>
 * When a key is first inserted into the cache, its use counter is set to 1 (due to the put operation). The use counter for a key in the cache is incremented either a get or put operation is called on it.
 * <p>
 * The functions get and put must each run in O(1) average time complexity.
 * <p>
 * Constraints:
 * <p>
 * 1 <= capacity <= 10^4
 * 0 <= key <= 10^5
 * 0 <= value <= 10^9
 * At most 2 * 10^5 calls will be made to get and put.
 * <p>
 * <a href="https://leetcode.com/problems/lfu-cache/">LFU Cache</a>
 */
public class LFUCache {
	private final Map<Integer, LinkedNode> map;
	private final LinkedNodeList cache;
	private final int capacity;
	
	public LFUCache(int capacity) {
		this.capacity = capacity;
		this.map = new HashMap<>(capacity);
		this.cache = new LinkedNodeList();
	}
	
	public int get(int key) {
		LinkedNode linkedNode = map.get(key);
		if (linkedNode == null) {
			return -1;
		} else {
			linkedNode.increase();
			cache.moveToNextCount(linkedNode);
			return linkedNode.value;
		}
	}
	
	public void put(int key, int value) {
		LinkedNode linkedNode = map.get(key);
		if (linkedNode == null) {
			if (map.size() == capacity) {
				LinkedNode linkedNode1 = cache.removeLast();
				if (linkedNode1 != null) {
					map.remove(linkedNode1.key);
				}
			}
			linkedNode = new LinkedNode(key, value);
			map.put(key, linkedNode);
			cache.addToLatest(linkedNode);
		} else {
			linkedNode.value = value;
			linkedNode.increase();
		}
		cache.moveToNextCount(linkedNode);
	}
	
	private static class LinkedNode {
		public int key;
		public int value;
		public int count = 1;
		public LinkedNode prev;
		public LinkedNode next;
		
		public LinkedNode() {
		}
		
		public LinkedNode(int key, int value) {
			this.key = key;
			this.value = value;
		}
		
		public void increase() {
			count++;
		}
		
		@Override
		public String toString() {
			return "{" + key +
					"=" + value +
					'}';
		}
	}
	
	private static class LinkedNodeList {
		public LinkedNode first;
		public LinkedNode last;
		
		public LinkedNodeList() {
			first = new LinkedNode();
			last = new LinkedNode();
			
			first.next = last;
			last.prev = first;
		}
		
//		public void toFirst(LinkedNode linkedNode) {
//			LinkedNode prevUsed = linkedNode.prev;
//			if (prevUsed != first) {
//				if (prevUsed != null) { // exist
//					prevUsed.next = linkedNode.next;
//					linkedNode.next.prev = prevUsed;
//				}
//
//				linkedNode.prev = first;
//				linkedNode.next = first.next;
//				first.next.prev = linkedNode;
//				first.next = linkedNode;
//			}
//		}
		
		public void moveToNextCount(LinkedNode linkedNode) {
			LinkedNode prevUsed = linkedNode.prev;
			while (prevUsed != first && prevUsed.count <= linkedNode.count) {
				LinkedNode lastBounder = linkedNode.next;
				LinkedNode firstBounder = prevUsed.prev;
				
				prevUsed.next = lastBounder;
				lastBounder.prev = prevUsed;
				
				firstBounder.next = linkedNode;
				linkedNode.prev = firstBounder;
				
				linkedNode.next = prevUsed;
				prevUsed.prev = linkedNode;
				
				prevUsed = linkedNode.prev;
			}
		}
		
		public LinkedNode removeLast() {
			LinkedNode toRemove = last.prev;
			if (toRemove != first) {
				toRemove.prev.next = last;
				last.prev = toRemove.prev;
				return toRemove;
			} else {
				return null;
			}
		}
		
		@Override
		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			LinkedNode starter = first.next;
			while (starter != last) {
				stringBuilder.append(starter.toString());
				starter = starter.next;
			}
			return stringBuilder.toString();
		}
		
		public void addToLatest(LinkedNode linkedNode) {
			linkedNode.next = last;
			linkedNode.prev = last.prev;
			last.prev.next = linkedNode;
			last.prev = linkedNode;
		}
		
	}
}
