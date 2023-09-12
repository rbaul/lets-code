package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseBitsTest {

    private final ReverseBits test = new ReverseBits();

    @Test
    void reverseBits_1() {
        assertEquals(964176192, test.reverseBits(43261596));
    }

    @Test
    void reverseBits_2() {
        assertEquals(-1073741825, test.reverseBits(-3));
    }

    @Test
    void reverseBits_3() {
        assertEquals(0, test.reverseBits(0));
    }

    @Test
    void reverseBits_4() {
        assertEquals(-2147483648, test.reverseBits(1));
    }
}