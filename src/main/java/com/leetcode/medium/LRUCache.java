package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU Cache
 * <p>
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * <p>
 * Implement the LRUCache class:
 * <p>
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 * <p>
 * Constraints:
 * <p>
 * 1 <= capacity <= 3000
 * 0 <= key <= 104
 * 0 <= value <= 105
 * At most 2 * 105 calls will be made to get and put.
 * <p>
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 *
 * <p>
 * <a href="https://leetcode.com/problems/lru-cache/">LRU Cache</a>
 */
class LRUCache {

//	private final Map<Integer, Integer> map;
//
//	public LRUCache(int capacity) {
//		map = new LinkedHashMap<>(capacity + 1, 1, true) {
//			@Override
//			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
//				return size() > capacity;
//			}
//		};
//	}
//
//	public int get(int key) {
//		return map.getOrDefault(key, -1);
//	}
//
//	public void put(int key, int value) {
//		map.put(key, value);
//	}
	
	private final int capacity;
	
	public final Map<Integer, LinkedNode> map;
	
	public final LinkedNodeList linkedNodeList;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>(capacity);
		linkedNodeList = new LinkedNodeList();
	}
	
	public int get(int key) {
		LinkedNode linkedNode = map.get(key);
		if (linkedNode == null) {
			return -1;
		} else {
			linkedNodeList.toFirst(linkedNode);
			return linkedNode.value;
		}
	}
	
	public void put(int key, int value) {
		LinkedNode linkedNode = map.get(key);
		if (linkedNode == null) {
			if (map.size() == capacity) {
				LinkedNode linkedNode1 = linkedNodeList.removeLast();
				if (linkedNode1 != null) {
					map.remove(linkedNode1.key);
				}
			}
			linkedNode = new LinkedNode(key, value);
			map.put(key, linkedNode);
		} else {
			linkedNode.value = value;
		}
		linkedNodeList.toFirst(linkedNode);
	}
	
	
	private static class LinkedNode {
		public int key;
		public int value;
		public LinkedNode prev;
		public LinkedNode next;
		
		public LinkedNode() {
		}
		
		public LinkedNode(int key, int value) {
			this.key = key;
			this.value = value;
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
		
		public void toFirst(LinkedNode linkedNode) {
			LinkedNode prevUsed = linkedNode.prev;
			if (prevUsed != first) {
				if (prevUsed != null) { // exist
					prevUsed.next = linkedNode.next;
					linkedNode.next.prev = prevUsed;
				}
				
				linkedNode.prev = first;
				linkedNode.next = first.next;
				first.next.prev = linkedNode;
				first.next = linkedNode;
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
	}
}