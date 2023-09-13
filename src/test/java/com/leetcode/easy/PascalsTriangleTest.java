package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalsTriangleTest {

    private final PascalsTriangle test = new PascalsTriangle();

    @Test
    void generate_1() {
        assertEquals(List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1)), test.generate(5));
    }

    @Test
    void generate_2() {
        assertEquals(List.of(List.of(1)), test.generate(1));
    }
}