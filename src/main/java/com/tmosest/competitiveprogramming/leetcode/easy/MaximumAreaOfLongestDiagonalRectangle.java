package com.tmosest.competitiveprogramming.leetcode.easy;

class MaximumAreaOfLongestDiagonalRectangle {
	/**
	 * https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/
	 * 
	 * @param dimensions
	 * @return
	 */
	public int areaOfMaxDiagonal(int[][] dimensions) {
		// [diagonal , area]
		int[] best = new int[2];
		for (int[] d : dimensions) {
			int p = d[0] * d[0] + d[1] * d[1];
			if (p > best[0] || (p == best[0] && d[0] * d[1] > best[1])) {
				best[0] = p;
				best[1] = d[0] * d[1];
			}
		}

		return best[1];
	}
}
