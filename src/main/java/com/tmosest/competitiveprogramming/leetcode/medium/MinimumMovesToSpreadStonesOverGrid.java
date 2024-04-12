package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class MinimumMovesToSpreadStonesOverGrid {
	/**
	 * https://leetcode.com/problems/minimum-moves-to-spread-stones-over-grid/
	 * 
	 * https://leetcode.com/problems/minimum-moves-to-spread-stones-over-grid/solutions/4024641/java-dfs-backtrack-easy-to-undertand/
	 * 
	 * @param grid
	 * @return
	 */
	public int minimumMoves(int[][] grid) {
		List<int[]> consumers = new ArrayList<>();
		List<int[]> suppliers = new ArrayList<>();

		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				if (grid[r][c] == 0)
					consumers.add(new int[] { r, c });
				else if (grid[r][c] > 1)
					suppliers.add(new int[] { r, c, 1 });
			}
		}

		return dfs(0, consumers, suppliers, grid);
	}

	private int dfs(int pos, List<int[]> consumers, List<int[]> suppliers, int[][] grid) {
		if (pos == consumers.size())
			return 0;

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < suppliers.size(); i++) {
			int[] s = suppliers.get(i);
			if (s[2] == 0)
				continue;
			grid[s[0]][s[1]]--;
			if (grid[s[0]][s[1]] == 1) {
				s[2] = 0;
			}
			min = Math.min(min, dfs(pos + 1, consumers, suppliers, grid) + getDis(consumers.get(pos), s));
			grid[s[0]][s[1]]++;
			s[2] = 1;
		}
		return min;
	}

	private int getDis(int[] a, int[] b) {
		return Math.abs(a[0] - b[0]) + Math.abs(a[1] - b[1]);
	}
}
