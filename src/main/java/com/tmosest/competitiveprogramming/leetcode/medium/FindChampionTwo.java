package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class FindChampionTwo {
	/**
	 * https://leetcode.com/problems/find-champion-ii/
	 * 
	 * This was my original thought but not what I implemented.
	 * 
	 * Count ingresses and then if there is only one node with no ingresses he is the champion.
	 * 
	 * @param n
	 * @param edges
	 * @return
	 */
	public int findChampion(int n, int[][] edges) {
		int ans = -1;
		int count = 0;
		int[] inDegrees = new int[n];

		for (int[] edge : edges) {
			final int v = edge[1];
			++inDegrees[v];
		}

		for (int i = 0; i < n; ++i)
			if (inDegrees[i] == 0) {
				++count;
				ans = i;
			}

		return count > 1 ? -1 : ans;
	}

	/**
	 * Works but slower and requires DFS
	 * 
	 * @param n
	 * @param edges
	 * @return
	 */
	public int findChampionMine(int n, int[][] edges) {

		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}

		for (int[] edge : edges) {
			List<Integer> list = map.get(edge[0]);
			list.add(edge[1]);
		}

		for (int i = 0; i < n; i++) {
			boolean[] visited = new boolean[n];
			visited[i] = true;

			Stack<Integer> stack = new Stack<>();
			stack.addAll(map.get(i));

			boolean containsLoopToFirst = false;
			while (!stack.isEmpty()) {
				int next = stack.pop();

				if (visited[next] && next == i) {
					containsLoopToFirst = true;
					break;
				}

				if (visited[next]) {
					continue;
				}

				stack.addAll(map.get(next));
				visited[next] = true;
			}

			if (containsLoopToFirst) {
				continue;
			}

			boolean champion = true;
			for (int v = 0; v < n; v++) {
				if (!visited[v]) {
					champion = false;
				}
			}

			if (champion) {
				return i;
			}
		}

		return -1;
	}
}
