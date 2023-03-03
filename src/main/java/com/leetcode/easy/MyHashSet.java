package com.leetcode.easy;

import java.util.Arrays;

/**
 * Design HashSet
 * <p>
 * Design a HashSet without using any built-in hash table libraries.
 * <p>
 * Implement MyHashSet class:
 * <p>
 * void add(key) Inserts the value key into the HashSet.
 * bool contains(key) Returns whether the value key exists in the HashSet or not.
 * void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 * <p>
 * Constraints:
 * <p>
 * 0 <= key <= 10^6
 * At most 10^4 calls will be made to add, remove, and contains.
 * <p>
 * <a href="https://leetcode.com/problems/design-hashset/">Design HashSet</a>
 */
public class MyHashSet {
	
	private final int[] array;
	
	public MyHashSet() {
		this.array = new int[1000001];
		Arrays.fill(array, -1);
	}
	
	public void add(int key) {
		array[key] = key;
	}
	
	public void remove(int key) {
		array[key] = -1;
	}
	
	public boolean contains(int key) {
		return array[key] >= 0;
	}
}
