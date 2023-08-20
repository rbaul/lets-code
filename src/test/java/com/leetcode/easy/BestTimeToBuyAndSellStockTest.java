package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();

    @Test
    void maxProfit_1() {
        assertEquals(5, test.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    void maxProfit_2() {
        assertEquals(0, test.maxProfit(new int[]{7,6,4,3,1}));
    }
}