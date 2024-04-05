package com.tmosest.competitiveprogramming.leetcode.easy;

class FindChampionOne {
	/**
	 * https://leetcode.com/problems/find-champion-i/
	 * 
	 * Team i is stronger than team j if grid[i][j] == 1
	 * 
	 * @param grid
	 * @return
	 */
	public int findChampion(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			boolean champion = true;

			for (int j = 0; j < grid.length; j++) {
				if (i == j)
					continue;

				if (grid[i][j] == 0) {
					champion = false;
					break;
				}

			}

			if (champion)
				return i;
		}

		return -1;
	}
}
