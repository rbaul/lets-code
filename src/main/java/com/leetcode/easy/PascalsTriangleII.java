package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle II
 * <p>
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * Constraints:
 * <p>
 * 0 <= rowIndex <= 33
 * <p>
 * <p>
 * Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 * <p>
 * <a href="https://leetcode.com/problems/pascals-triangle-ii/description/">Pascal's Triangle II</a>
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex);
        result.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            Integer prev = result.get(0);
            for (int j = 1; j < i; j++) {
                Integer next = result.get(j);
                result.set(j, next + prev);
                prev = next;
            }
            result.add(1);
        }

        return result;
    }
}
