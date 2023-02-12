package com.leetcode.medium;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class PathSumIITest {
	
	private final PathSumII test = new PathSumII();
	
	@Test
	void pathSum_1() {
		TreeNode root = new TreeNode(5,
				new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
				new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
		Assertions.assertEquals(List.of(
				List.of(5, 4, 11, 2),
				List.of(5, 8, 4, 5)
		), test.pathSum(root, 22));
	}
	
	@Test
	void pathSum_2() {
		TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		Assertions.assertEquals(List.of(), test.pathSum(root, 5));
	}
	
	@Test
	void pathSum_3() {
		TreeNode root = new TreeNode(1, new TreeNode(2), null);
		Assertions.assertEquals(List.of(), test.pathSum(root, 0));
	}
}