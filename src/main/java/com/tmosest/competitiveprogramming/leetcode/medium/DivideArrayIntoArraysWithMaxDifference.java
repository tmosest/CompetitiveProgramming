package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class DivideArrayIntoArraysWithMaxDifference {
	/**
	 * https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/
	 * @param nums
	 * @param k
	 * @return
	 */
	public int[][] divideArray(int[] nums, int k) {
		
		Arrays.sort(nums);

		int[][] results = new int[nums.length / 3][3];

		int row = 0;
		for (int i = 0; i < nums.length - 2; i+= 3) {
			int[] col = new int[3];
			int diff = 0;
			col[diff] = nums[i];
			for (int j = i; j < i + 2; j++) {
				if (nums[j + 1] - nums[i] > k) {
					return new int[0][0];
				}
				col[++diff] = nums[j + 1];
			}
			results[row++] = col;
		}

		return results;
	}
}
