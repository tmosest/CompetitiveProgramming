package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;

class MinimumCostWalkInWeightedGraph {
	/**
	 * https://leetcode.com/problems/minimum-cost-walk-in-weighted-graph/description/
	 * 
	 * https://www.geeksforgeeks.org/minimum-cost-of-simple-path-between-two-nodes-in-a-directed-and-weighted-graph/
	 * 
	 * https://leetcode.com/problems/minimum-cost-walk-in-weighted-graph/solutions/4985451/c-java-python3-union-find/
	 * 
	 * @param n
	 * @param edges
	 * @param query
	 * @return
	 */
	public int[] minimumCost(int n, int[][] edges, int[][] query) {
		DSU uf = new DSU(n);
		for (int[] edge : edges)
			uf.union(edge[0], edge[1], edge[2]);
		int[] result = new int[query.length];
		for (int i = 0; i < query.length; i++)
			result[i] = uf.minimum_cost_of_walk(query[i][0], query[i][1]);
		return result;
	}

	private static class DSU {
		int[] parent, rank, weights;

		public DSU(int n) {
			parent = new int[n];
			rank = new int[n];
			weights = new int[n];
			Arrays.fill(weights, 131071);
			for (int i = 0; i < n; i++)
				parent[i] = i;
		}

		public int find(int x) {
			if (x != parent[x])
				parent[x] = find(parent[x]);
			return parent[x];
		}

		public void union(int x, int y, int weight) {
			int xx = find(x);
			int yy = find(y);
			if (rank[xx] < rank[yy])
				parent[xx] = yy;
			else
				parent[yy] = xx;
			weights[xx] = weights[yy] = weights[xx] & weights[yy] & weight;
			if (rank[xx] == rank[yy])
				rank[xx]++;
		}

		public int minimum_cost_of_walk(int x, int y) {
			if (x == y)
				return 0;
			if (find(x) != find(y))
				return -1;
			return weights[find(x)];
		}
	}
}
