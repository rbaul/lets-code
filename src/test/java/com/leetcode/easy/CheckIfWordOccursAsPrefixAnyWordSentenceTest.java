package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfWordOccursAsPrefixAnyWordSentenceTest {

    private final CheckIfWordOccursAsPrefixAnyWordSentence test = new CheckIfWordOccursAsPrefixAnyWordSentence();

    @Test
    void isPrefixOfWord_1() {
        assertEquals(4, test.isPrefixOfWord("i love eating burger", "burg"));
    }

    @Test
    void isPrefixOfWord_2() {
        assertEquals(2, test.isPrefixOfWord("this problem is an easy problem", "pro"));
    }

    @Test
    void isPrefixOfWord_3() {
        assertEquals(-1, test.isPrefixOfWord("i am tired", "you"));
    }

    @Test
    void isPrefixOfWord_4() {
        assertEquals(-1, test.isPrefixOfWord("hello from the other side", "they"));
    }
}