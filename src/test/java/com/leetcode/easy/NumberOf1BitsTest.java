package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {

    private final NumberOf1Bits test = new NumberOf1Bits();
    @Test
    void hammingWeight_1() {
        assertEquals(3, test.hammingWeight(7));
    }

    @Test
    void hammingWeight_2() {
        assertEquals(1, test.hammingWeight(128));
    }

    @Test
    void hammingWeight_3() {
        assertEquals(31, test.hammingWeight(-3));
    }
}