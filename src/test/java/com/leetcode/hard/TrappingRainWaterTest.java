package com.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {

    private final TrappingRainWater test = new TrappingRainWater();

    @Test
    void trap_1() {
        assertEquals(6, test.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void trap_2() {
        assertEquals(9, test.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    @Test
    void trap_3() {
        assertEquals(2, test.trap(new int[]{0, 2, 0, 1, 0, 1}));
    }

    @Test
    void trap_4() {
        assertEquals(6, test.trap(new int[]{0, 2, 0, 1, 0, 1, 3}));
    }

    @Test
    void trap_5() {
        assertEquals(10, test.trap(new int[]{0, 5, 0, 4, 0, 3, 0, 2, 0, 1}));
    }

    @Test
    void trap_6() {
        assertEquals(1, test.trap(new int[]{4, 2, 3}));
    }

    @Test
    void trap_7() {
        assertEquals(3, test.trap(new int[]{9, 6, 8, 8, 5, 6, 3}));
    }

    @Test
    void trap_8() {
        assertEquals(0, test.trap(new int[]{0,2,0}));
    }
}