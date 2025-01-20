package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class BinaryTreePostorderTraversal {
	/**
	 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
	 * @param root The root of the tree.
	 * @return A list of values in the tree. Using Post Order traversal.
	 */
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();

		helper(root, result);

		return result;
	}

	private void helper(TreeNode rootNode, List<Integer> list) {
		if (rootNode == null) {
			return;
		}
		
		helper(rootNode.left, list);
		helper(rootNode.right, list);

		list.add(rootNode.val);
	}
}
