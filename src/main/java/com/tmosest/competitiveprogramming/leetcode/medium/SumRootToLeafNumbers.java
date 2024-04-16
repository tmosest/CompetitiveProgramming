package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tmosest.competitiveprogramming.leetcode.common.TreeNode;

class SumRootToLeafNumbers {
	private int sum;
	/**
	 * https://leetcode.com/problems/sum-root-to-leaf-numbers/?envType=daily-question&envId=2024-04-15
	 * 
	 * @param root
	 * @return
	 */
	public int sumNumbers(TreeNode root) {
		sum = 0;

		sumLeafs(root, new ArrayList<>());

		return sum;
	}

	private void sumLeafs(TreeNode node, List<Integer> list) {
		if (node == null) {
			return;
		}

		if (node.left == null && node.right == null) {
			// is leaf
			int localSum = node.val;
			int powTen = 10;

			Collections.reverse(list);

			for (int num : list) {
				localSum += powTen * num;
				powTen *= 10;
			}

			sum += localSum;

			return;
		}

		if (node.left != null) {
			List<Integer> newList = new ArrayList<>(list);
			newList.add(node.val);
			sumLeafs(node.left, newList);
		}

		if (node.right != null) {
			List<Integer> newList = new ArrayList<>(list);
			newList.add(node.val);
			sumLeafs(node.right, newList);
		}
	}
}
