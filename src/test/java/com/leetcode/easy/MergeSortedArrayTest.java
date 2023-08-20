package com.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArrayTest {

    private final MergeSortedArray test = new MergeSortedArray();

    @Test
    void merge_1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        test.merge(nums1, 3, nums2, nums2.length);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void merge_2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        test.merge(nums1, 1, nums2, nums2.length);
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void merge_3() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        test.merge(nums1, 0, nums2, nums2.length);
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }
}