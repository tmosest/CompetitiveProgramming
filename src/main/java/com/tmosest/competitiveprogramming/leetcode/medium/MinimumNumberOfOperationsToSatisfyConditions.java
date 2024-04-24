package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumNumberOfOperationsToSatisfyConditions {
	/**
	 * https://leetcode.com/problems/minimum-number-of-operations-to-satisfy-conditions/description/
	 * 
	 * Great explanation:
	 * https://leetcode.com/problems/minimum-number-of-operations-to-satisfy-conditions/solutions/5052486/dp-top-down-bottom-up-and-monster-style/
	 * 
	 * @param grid
	 * @return
	 */
	public int minimumOperations(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[][] dp = new int[n][10];
		for (int i = 0; i < n; i++) {
			int[] cnt = new int[10];
			for (int j = 0; j < m; j++) {
				cnt[grid[j][i]]++;
			}
			for (int j = 0; j < 10; j++) {
				dp[i][j] = m - cnt[j];
			}
		}
		int[][] dpp = new int[n][10];
		for (int i = 0; i < 10; i++)
			dpp[0][i] = dp[0][i];
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				int min = 1000000;
				for (int k = 0; k < 10; k++) {
					if (k != j)
						min = Math.min(min, dpp[i - 1][k]);
				}
				dpp[i][j] = min + dp[i][j];
			}
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 10; i++)
			ans = Math.min(ans, dpp[n - 1][i]);

		return ans;
	}
}
