package com.leetcode.medium;

import com.leetcode.utils.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {
	
	private final ValidateBinarySearchTree test = new ValidateBinarySearchTree();
	
	@Test
	void isValidBST_1() {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(3);
		TreeNode treeNode0 = new TreeNode(2, treeNode1, treeNode2);
		
		Assertions.assertTrue(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_2() {
		TreeNode treeNode1 = new TreeNode(3);
		TreeNode treeNode2 = new TreeNode(6);
		TreeNode treeNode3 = new TreeNode(4, treeNode1, treeNode2);
		TreeNode treeNode4 = new TreeNode(1);
		TreeNode treeNode0 = new TreeNode(5, treeNode4, treeNode3);
		
		Assertions.assertFalse(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_3() {
		TreeNode treeNode1 = new TreeNode(3);
		TreeNode treeNode2 = new TreeNode(7);
		TreeNode treeNode3 = new TreeNode(6, treeNode1, treeNode2);
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode0 = new TreeNode(5, treeNode4, treeNode3);
		
		Assertions.assertFalse(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_4() {
		TreeNode treeNode3 = new TreeNode(5, new TreeNode(4), new TreeNode(6));
		TreeNode treeNode4 = new TreeNode(1, new TreeNode(0), new TreeNode(2));
		TreeNode treeNode0 = new TreeNode(3, treeNode4, treeNode3);
		
		Assertions.assertTrue(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_5() {
		TreeNode treeNode3 = new TreeNode(70, new TreeNode(50, new TreeNode(20), new TreeNode(55)), new TreeNode(100, new TreeNode(75), new TreeNode(110)));
		TreeNode treeNode4 = new TreeNode(140, new TreeNode(130, new TreeNode(119), new TreeNode(135)), new TreeNode(160, new TreeNode(150), new TreeNode(200)));
		TreeNode treeNode0 = new TreeNode(120, treeNode3, treeNode4);
		
		Assertions.assertFalse(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_6() {
		TreeNode treeNode3 = new TreeNode(26, new TreeNode(19, null, new TreeNode(27)), null);
		TreeNode treeNode4 = new TreeNode(47, null, new TreeNode(56));
		TreeNode treeNode0 = new TreeNode(32, treeNode4, treeNode3);
		
		Assertions.assertFalse(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_7() {
		TreeNode treeNode3 = new TreeNode(-57, null, new TreeNode(58, new TreeNode(31), null));
		TreeNode treeNode0 = new TreeNode(98, treeNode3, null);
		
		Assertions.assertTrue(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_8() {
		TreeNode treeNode3 = new TreeNode(30, new TreeNode(10, null, new TreeNode(15, null, new TreeNode(45))), null);
		TreeNode treeNode0 = new TreeNode(3, null, treeNode3);
		
		Assertions.assertFalse(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_9() {
		TreeNode treeNode0 = new TreeNode(2147483647);
		
		Assertions.assertTrue(test.isValidBST(treeNode0));
	}
	
	@Test
	void isValidBST_10() {
		TreeNode treeNode0 = new TreeNode(2147483647, new TreeNode(2147483647), new TreeNode(2147483647));
		
		Assertions.assertFalse(test.isValidBST(treeNode0));
	}
}