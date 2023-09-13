package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTriangularSumOfAnArrayTest {

    private final FindTriangularSumOfAnArray test = new FindTriangularSumOfAnArray();

    @Test
    void triangularSum_1() {
        assertEquals(8, test.triangularSum(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void triangularSum_2() {
        assertEquals(5, test.triangularSum(new int[]{5}));
    }
}