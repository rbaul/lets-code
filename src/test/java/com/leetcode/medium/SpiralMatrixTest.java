package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrixTest {
	
	private final SpiralMatrix test = new SpiralMatrix();
	
	@Test
	void spiralOrder_1() {
		int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), test.spiralOrder(matrix));
	}
	
	@Test
	void spiralOrder_2() {
		int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		
		assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), test.spiralOrder(matrix));
	}
	
	@Test
	void spiralOrder_3() {
		int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};
		
		assertEquals(Arrays.asList(1, 2, 3, 6, 5, 4), test.spiralOrder(matrix));
	}
	
	@Test
	void spiralOrder_4() {
		int[][] matrix = new int[][]{{1, 2}, {4, 5}, {6, 7}};
		
		assertEquals(Arrays.asList(1, 2, 5, 7, 6, 4), test.spiralOrder(matrix));
	}
	
	@Test
	void spiralOrder_5() {
		int[][] matrix = new int[][]{{3}, {2}};
		
		assertEquals(Arrays.asList(3, 2), test.spiralOrder(matrix));
	}
	
	@Test
	void spiralOrder_6() {
		int[][] matrix = new int[][]{{3, 2}};
		
		assertEquals(Arrays.asList(3, 2), test.spiralOrder(matrix));
	}
	
	@Test
	void spiralOrder_7() {
		int[][] matrix = new int[][]{{1}};
		
		assertEquals(List.of(1), test.spiralOrder(matrix));
	}
	
	@Test
	void spiralOrder_8() {
		int[][] matrix = new int[][]{{6, 9, 7}};
		
		assertEquals(List.of(6, 9, 7), test.spiralOrder(matrix));
	}
	
}