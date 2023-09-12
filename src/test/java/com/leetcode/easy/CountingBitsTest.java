package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingBitsTest {

    private final CountingBits test = new CountingBits();

    @Test
    void countBits_1() {
        assertArrayEquals(new int[]{0, 1, 1}, test.countBits(2));
    }

    @Test
    void countBits_2() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, test.countBits(5));
    }

    @Test
    void countBits_3() {
        assertArrayEquals(new int[]{0, 1}, test.countBits(1));
    }
}