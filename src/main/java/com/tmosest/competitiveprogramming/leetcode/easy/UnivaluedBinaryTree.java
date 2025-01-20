package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Stack;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class UnivaluedBinaryTree {
	/**
	 * A binary tree is uni-valued if every node in the tree has the same value.
	 * Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
	 * @param root
	 * @return
	 */
	public boolean isUnivalTree(TreeNode root) {
		// No values would mean the tree is only one value?
		if (root == null) {
			return true;
		}

		int rootVal = root.val;

		// Use a stack to traverse the Binary Tree
		Stack<TreeNode> stack = new Stack<>();
		stack.add(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node.val != rootVal) {
				return false;
			}
			if (node.left != null) {
				stack.push(node.left);
			}
			if (node.right != null) {
				stack.push(node.right);
			}
		}

		return true;
	}
}
