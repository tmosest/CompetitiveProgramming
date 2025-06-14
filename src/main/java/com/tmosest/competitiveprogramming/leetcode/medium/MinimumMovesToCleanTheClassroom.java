package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

class MinimumMovesToCleanTheClassroom {

	public int minMoves(String[] classroom, int energy) {
		int m = classroom.length, n = classroom[0].length();
		int litterCount = 0, startRow = 0, startCol = 0;
		Map<Integer, Integer> litterMap = new HashMap<>();
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				char c = classroom[i].charAt(j);
				if (c == 'S') {
					startRow = i;
					startCol = j;
				}
				if (c == 'L')
					litterMap.put(i * n + j, litterCount++);
			}
		int target = (1 << litterCount) - 1;
		int[][][] vis = new int[m][n][1 << litterCount];
		for (int[][] a : vis)
			for (int[] b : a)
				Arrays.fill(b, -1);

		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] { startRow, startCol, energy, 0, 0 });
		vis[startRow][startCol][0] = energy;

		int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int r = cur[0], c = cur[1], e = cur[2], mask = cur[3], moves = cur[4];
			if (mask == target)
				return moves;
			for (int[] d : dirs) {
				int nr = r + d[0], nc = c + d[1], ne = e - 1;
				if (nr < 0 || nr >= m || nc < 0 || nc >= n)
					continue;
				char cell = classroom[nr].charAt(nc);
				if (cell == 'X' || ne < 0)
					continue;
				int nmask = mask;
				if (cell == 'L')
					nmask |= (1 << litterMap.get(nr * n + nc));
				if (cell == 'R')
					ne = energy;
				if (vis[nr][nc][nmask] < ne) {
					vis[nr][nc][nmask] = ne;
					q.offer(new int[] { nr, nc, ne, nmask, moves + 1 });
				}
			}
		}
		return -1;
	}
}
