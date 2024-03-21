package com.tmosest.competitiveprogramming.leetcode.easy;

class AntOnTheBoundary {
	/**
	 * https://leetcode.com/problems/ant-on-the-boundary/
	 * @param nums
	 * @return
	 */
	public int returnToBoundaryCount(int[] nums) {
		int steps = 0;
		int counts = 0;

		for (int num : nums) {
			steps += num;
			if (steps == 0)
				++counts;
		}

		return counts;
	}
}
