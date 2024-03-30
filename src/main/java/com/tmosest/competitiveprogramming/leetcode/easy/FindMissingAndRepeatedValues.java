package com.tmosest.competitiveprogramming.leetcode.easy;

class FindMissingAndRepeatedValues {
	/**
	 * https://leetcode.com/problems/find-missing-and-repeated-values/
	 * 
	 * @param grid
	 * @return
	 */
	public int[] findMissingAndRepeatedValues(int[][] grid) {

		int[] counts = new int[grid.length * grid.length];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				counts[grid[i][j] - 1]++;
			}
		}

		int[] result = new int[2];

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 2) {
				result[0] = i + 1;
			}

			if (counts[i] == 0) {
				result[1] = i + 1;
			}
		}

		return result;
	}
}
