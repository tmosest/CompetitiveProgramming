package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumAbsoluteDifferenceInSlidingSubmatrix {

	public int[][] minAbsDiff(int[][] grid, int k) {
		int m = grid.length, n = grid[0].length;
		int[][] ans = new int[m - k + 1][n - k + 1];
		// generate all submatrix
		for (int i = 0; i <= m - k; i++) {
			for (int j = 0; j <= n - k; j++) {
				int temp = getMin(grid, k, i, j);
				ans[i][j] = temp == Integer.MAX_VALUE ? 0 : temp;
			}
		}
		return ans;
	}

	int getMin(int[][] g, int k, int x, int y) {
		int m = g.length, n = g[0].length;
		int[] temp = new int[k * k];
		int st = 0;
		// linearize the submatrix
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				temp[st++] = g[i + x][j + y];
			}
		}
		// sort the linear array
		Arrays.sort(temp);
		int diff = Integer.MAX_VALUE;
		for (int i = 1; i < k * k; i++) {
			// skip the same elements
			while (i < k * k && temp[i] == temp[i - 1])
				i++;
			if (i < k * k)
				diff = Math.min(diff, Math.abs(temp[i] - temp[i - 1]));
		}
		// return min diff
		return diff;
	}
}
