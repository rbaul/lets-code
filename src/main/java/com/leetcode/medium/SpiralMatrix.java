package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Spiral Matrix
 * <p>
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * <p>
 * Constraints:
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 10
 * -100 <= matrix[i][j] <= 100
 * <p>
 * <a href="https://leetcode.com/problems/spiral-matrix/">Spiral Matrix</a>
 */
public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		
		int x = 0;
		int y = 0;
		int m = matrix.length;
		int n = matrix[0].length;
		
		while (y < m && x < n) {
			
			
			for (int i = x; i < n; i++) {
				result.add(matrix[y][i]);
			}
			
			for (int i = y + 1; i < m - 1; i++) {
				result.add(matrix[i][n - 1]);
			}
			
			if (m > y + 1) {
				for (int i = n - 1; i >= x; i--) {
					result.add(matrix[m - 1][i]);
				}
			}
			
			if (n > x + 1) {
				for (int i = m - 2; i > y; i--) {
					result.add(matrix[i][x]);
				}
			}
			x++;
			y++;
			m--;
			n--;
		}
		return result;
	}
}
