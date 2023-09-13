package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleIITest {

    private final PascalsTriangleII test = new PascalsTriangleII();

    @Test
    void getRow_1() {
        assertEquals(List.of(1, 3, 3, 1), test.getRow(3));
    }

    @Test
    void getRow_2() {
        assertEquals(List.of(1), test.getRow(0));
    }

    @Test
    void getRow_3() {
        assertEquals(List.of(1, 1), test.getRow(1));
    }
}