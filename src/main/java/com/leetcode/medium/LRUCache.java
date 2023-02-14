package com.leetcode.medium;

import java.util.LinkedHashMap;
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
	
	private final Map<Integer, Integer> map;
	
	public LRUCache(int capacity) {
		map = new LinkedHashMap<>(capacity + 1, 1, true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
				return size() > capacity;
			}
		};
	}
	
	public int get(int key) {
		return map.getOrDefault(key, -1);
	}
	
	public void put(int key, int value) {
		map.put(key, value);
	}
}