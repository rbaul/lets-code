package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountPrefixesGivenStringTest {

    private final CountPrefixesGivenString test = new CountPrefixesGivenString();

    @Test
    void countPrefixes_1() {
        assertEquals(3, test.countPrefixes(new String[]{"a", "b", "c", "ab", "bc", "abc"}, "abc"));
    }

    @Test
    void countPrefixes_2() {
        assertEquals(2, test.countPrefixes(new String[]{"a", "a"}, "aa"));
    }
}