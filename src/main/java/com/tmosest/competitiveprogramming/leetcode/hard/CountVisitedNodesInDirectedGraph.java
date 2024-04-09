package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.List;

class CountVisitedNodesInDirectedGraph {
	private int[] res;
	private int[] steps;
	private int step = 1;

	/**
	 * https://leetcode.com/problems/count-visited-nodes-in-a-directed-graph/description/
	 * 
	 * @param edges
	 * @return
	 */
	public int[] countVisitedNodes(List<Integer> edges) {
		int n = edges.size();
		res = new int[n];
		steps = new int[n];

		for (int i = 0; i < n; i++) {
			if (steps[i] > 0) {
				continue;
			}
			dfs(i, edges);
		}
		return res;
	}

	private int dfs(int u, List<Integer> edges) {
		steps[u] = step;
		step++;
		int v = edges.get(u);
		if (res[v] > 0) {
			res[u] = res[v] + 1;
			return steps[u];
		}
		if (steps[v] > 0) {
			res[u] = steps[u] - steps[v] + 1;
			return steps[v];
		}

		int maxStep = dfs(v, edges);
		if (steps[u] < maxStep) {
			res[u] = res[v] + 1;
		} else {
			res[u] = res[v];
		}
		return maxStep;
	}
}
