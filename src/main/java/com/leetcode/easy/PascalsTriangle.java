package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * Constraints:
 * <p>
 * 1 <= numRows <= 30
 * <p>
 * <a href="https://leetcode.com/problems/pascals-triangle/">Pascal's Triangle</a>
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1)); // First element
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> rowArray = new ArrayList<>(i);
            rowArray.add(1);

            List<Integer> prevArray = result.get(i - 1);
            for (int j = 1; j < i; j++) {
                rowArray.add(prevArray.get(j - 1) + prevArray.get(j));
            }
            rowArray.add(1);

            result.add(rowArray);
        }
        return result;
    }
}
