package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ANumberAfterADoubleReversalTest {

    private final ANumberAfterADoubleReversal test = new ANumberAfterADoubleReversal();

    @Test
    void isSameAfterReversals_1() {
        assertTrue(test.isSameAfterReversals(526));
    }

    @Test
    void isSameAfterReversals_2() {
        assertFalse(test.isSameAfterReversals(1800));
    }

    @Test
    void isSameAfterReversals_3() {
        assertTrue(test.isSameAfterReversals(0));
    }
}