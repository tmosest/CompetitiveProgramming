package com.tmosest.competitiveprogramming.leetcode.easy;

class FindIndicesWithIndexAndValueDifferenceOne {
	/**
	 * https://leetcode.com/problems/find-indices-with-index-and-value-difference-i/description/
	 * 
	 * @param nums
	 * @param indexDifference
	 * @param valueDifference
	 * @return
	 */
	public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {

		int[] result = new int[] { -1, -1 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + indexDifference; j < nums.length; j++) {
				if (Math.abs(nums[i] - nums[j]) >= valueDifference) {
					result = new int[] { i, j };
					return result;
				}
			}
		}

		return result;
	}
}
