package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingWordsWithGivenPrefixTest {

    private final CountingWordsWithGivenPrefix test = new CountingWordsWithGivenPrefix();

    @Test
    void prefixCount_1() {
        assertEquals(2, test.prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at"));
    }

    @Test
    void prefixCount_2() {
        assertEquals(0, test.prefixCount(new String[]{"leetcode", "win", "loops", "success"}, "code"));
    }

}