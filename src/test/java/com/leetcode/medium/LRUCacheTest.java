package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {
	
	@Test
	void lruCache_1() {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		assertEquals(1, lRUCache.get(1));    // return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		assertEquals(-1, lRUCache.get(2));    // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		assertEquals(-1, lRUCache.get(1));    // return -1 (not found)
		assertEquals(3, lRUCache.get(3));    // return 3
		assertEquals(4, lRUCache.get(4));    // return 4
	}
	
	@Test
	void lruCache_2() {
		LRUCache lRUCache = new LRUCache(2);
		assertEquals(-1, lRUCache.get(2));    // returns -1 (not found)
		lRUCache.put(2, 6); // cache is {2=6}
		assertEquals(-1, lRUCache.get(1));    // returns -1 (not found)
		lRUCache.put(1, 5); // cache is {1=5}
		lRUCache.put(1, 2); // cache is {1=2}
		assertEquals(2, lRUCache.get(1));    // return 2
		assertEquals(6, lRUCache.get(2));    // return 6
	}
	
	@Test
	void lruCache_3() {
		LRUCache lRUCache = new LRUCache(1);
		lRUCache.put(2, 1); // cache is {2=1}
		assertEquals(1, lRUCache.get(2));    // return 1
	}
	
	@Test
	void lruCache_4() {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 0); // cache is {1=0}
		lRUCache.put(2, 2); // cache is {2=2, 1=0}
		assertEquals(0, lRUCache.get(1));    // return 0
		lRUCache.put(3, 3); // cache is {3=3, 2=2}
		assertEquals(-1, lRUCache.get(2));    // returns -1 (not found)
		lRUCache.put(4, 4); // cache is {4=4, 3=3}
		assertEquals(-1, lRUCache.get(1));    // returns -1 (not found)
		assertEquals(3, lRUCache.get(3));    // returns 3
		assertEquals(4, lRUCache.get(4));    // returns 4
	}
	
	@Test
	void lruCache_5() {
		LRUCache lRUCache = new LRUCache(10);
		lRUCache.put(10, 13);
		lRUCache.put(3, 17);
		lRUCache.put(6, 11);
		lRUCache.put(10, 5);
		lRUCache.put(9, 10);
		assertEquals(-1, lRUCache.get(13));
		lRUCache.put(2, 19);
		assertEquals(19, lRUCache.get(2));
		assertEquals(17, lRUCache.get(3));
		lRUCache.put(5, 25);
		assertEquals(-1, lRUCache.get(8));
		lRUCache.put(9, 22);
		lRUCache.put(5, 5);
		lRUCache.put(1, 30);
		assertEquals(-1, lRUCache.get(11));
		lRUCache.put(9, 12);
		assertEquals(-1, lRUCache.get(7));
		assertEquals(5, lRUCache.get(5));
		assertEquals(-1, lRUCache.get(8));
		assertEquals(12, lRUCache.get(9));
		lRUCache.put(4, 30);
		lRUCache.put(9, 3);
		assertEquals(3, lRUCache.get(9));
		assertEquals(5, lRUCache.get(10));
		assertEquals(5, lRUCache.get(10));
		lRUCache.put(6, 14);
		lRUCache.put(3, 1);
		assertEquals(1, lRUCache.get(3));
		lRUCache.put(10, 11);
		assertEquals(-1, lRUCache.get(8));
		lRUCache.put(2, 14);
		assertEquals(30, lRUCache.get(1));
		assertEquals(5, lRUCache.get(5));
		assertEquals(30, lRUCache.get(4));
		lRUCache.put(11, 4);
		lRUCache.put(12, 24);
		lRUCache.put(5, 18);
		assertEquals(-1, lRUCache.get(13));
		lRUCache.put(7, 23);
		assertEquals(-1, lRUCache.get(8));
		assertEquals(24, lRUCache.get(12));
		lRUCache.put(3, 27);
		lRUCache.put(2, 12);
		assertEquals(18, lRUCache.get(5));
		lRUCache.put(2, 9);
		lRUCache.put(13, 4);
		lRUCache.put(8, 18);
		lRUCache.put(1, 7);
		assertEquals(-1, lRUCache.get(6));
	}
	
	@Test
	void lruCache_6() {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(6, 1);
		lRUCache.put(1, 1);
		lRUCache.put(6, 1);
		lRUCache.put(2, 1);
		lRUCache.put(3, 1);
		assertEquals(-1, lRUCache.get(6));
	}
}