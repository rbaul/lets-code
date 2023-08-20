package com.leetcode.easy;

/**
 * Merge Sorted Array
 * <p>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * Constraints:
 * <p>
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 * <p>
 * <p>
 * Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 * <p>
 * <a href="https://leetcode.com/problems/merge-sorted-array/">...</a>
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        int k = m - 1;
        int j = n - 1;

        while (k >= 0 && j >= 0) {
            if (nums1[k] > nums2[j]) {
                nums1[i] = nums1[k];
                nums1[k] = 0;
                --k;
            } else {
                nums1[i] = nums2[j];
                --j;
            }
            --i;
        }

        while (j >= 0) {
            nums1[i--] = nums2[j--];
        }
    }
}
