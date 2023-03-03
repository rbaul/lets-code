package com.leetcode.easy;

import java.util.Arrays;

/**
 * Design HashMap
 * <p>
 * Design a HashMap without using any built-in hash table libraries.
 * <p>
 * Implement the MyHashMap class:
 * <p>
 * MyHashMap() initializes the object with an empty map.
 * void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
 * int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
 * <p>
 * Constraints:
 * <p>
 * 0 <= key, value <= 10^6
 * At most 10^4 calls will be made to put, get, and remove.
 * <p>
 * <a href="https://leetcode.com/problems/design-hashmap/">Design HashMap</a>
 */
public class MyHashMap {
	
	private final int[] array;
	
	public MyHashMap() {
		this.array = new int[1000001];
		Arrays.fill(array, -1);
	}
	
	public void put(int key, int value) {
		array[key] = value;
	}
	
	public int get(int key) {
		return array[key];
	}
	
	public void remove(int key) {
		array[key] = -1;
	}
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */