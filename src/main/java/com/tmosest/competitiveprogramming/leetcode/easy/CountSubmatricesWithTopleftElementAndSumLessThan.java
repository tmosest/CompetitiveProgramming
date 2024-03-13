package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

class CountSubmatricesWithTopleftElementAndSumLessThan {
	/**
	 * https://leetcode.com/contest/weekly-contest-387/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/
	 * Uses a greedy trick of prefix sums
	 * 
	 * @param grid
	 * @param k
	 * @return
	 */
	public int countSubmatrices(int[][] grid, int k) {
		int row = grid.length;
		int col = grid[0].length;
		int res = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i > 0)
					grid[i][j] += grid[i - 1][j];
				if (j > 0)
					grid[i][j] += grid[i][j - 1];
				if (i > 0 && j > 0)
					grid[i][j] -= grid[i - 1][j - 1];

				if (grid[i][j] <= k)
					res++;
				else
					break;
			}
		}

		return res;
	}
}
