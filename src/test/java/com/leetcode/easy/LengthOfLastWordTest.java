package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    private final LengthOfLastWord test = new LengthOfLastWord();

    @Test
    void lengthOfLastWord_1() {
        assertEquals(5, test.lengthOfLastWord("Hello World"));
    }

    @Test
    void lengthOfLastWord_2() {
        assertEquals(4, test.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void lengthOfLastWord_3() {
        assertEquals(6, test.lengthOfLastWord("luffy is still joyboy"));
    }

    @Test
    void lengthOfLastWord_4() {
        assertEquals(1, test.lengthOfLastWord("a"));
    }
}