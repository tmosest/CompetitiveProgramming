package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.*;

class FindWeightedMedianNodeInTree {

	static final int M = 25;
	static List<List<long[]>> adj;
	static int[] dep;
	static long[][] Par, Sum;

	public static void dfs(int cur, int parent) {
		if (parent != -1)
			dep[cur] = dep[parent] + 1;
		if (parent != -1)
			Par[0][cur] = parent;
		for (long[] ne : adj.get(cur)) {
			if ((int) ne[0] == parent) {
				Sum[0][cur] = ne[1];
				break;
			}
		}
		for (int j = 1; j < M; j++) {
			int y = (int) Par[j - 1][cur];
			Par[j][cur] = Par[j - 1][y];
			Sum[j][cur] = Sum[j - 1][cur] + Sum[j - 1][y];
		}
		for (long[] x : adj.get(cur)) {
			if ((int) x[0] != parent)
				dfs((int) x[0], cur);
		}
	}

	public static int LCA(int u, int v) {
		if (u == v)
			return u;
		if (dep[u] < dep[v]) {
			int temp = u;
			u = v;
			v = temp;
		}
		int diff = dep[u] - dep[v];
		for (int j = M - 1; j >= 0; j--) {
			if (((diff >> j) & 1) == 1)
				u = (int) Par[j][u];
		}
		for (int j = M - 1; j >= 0; j--) {
			if (Par[j][u] != Par[j][v]) {
				u = (int) Par[j][u];
				v = (int) Par[j][v];
			}
		}
		return u != v ? (int) Par[0][u] : u;
	}

	public static int kthParent(int k, int x) {
		for (int bit = M - 1; bit >= 0; bit--) {
			if (((k >> bit) & 1) == 1) {
				x = (int) Par[bit][x];
				if (x == -1)
					return x;
			}
		}
		return x;
	}

	public static long Wt(int a, int b, int lca) {
		int dep1 = dep[a] - dep[lca], dep2 = dep[b] - dep[lca];
		int node = a;
		long tot = 0;
		for (int bit = M - 1; bit >= 0; bit--) {
			if (((dep1 >> bit) & 1) == 1) {
				tot += Sum[bit][node];
				node = (int) Par[bit][node];
			}
		}
		node = b;
		for (int bit = M - 1; bit >= 0; bit--) {
			if (((dep2 >> bit) & 1) == 1) {
				tot += Sum[bit][node];
				node = (int) Par[bit][node];
			}
		}
		return tot;
	}

	public static long dist(int a, int b, int lca) {
		return dep[a] + dep[b] - 2L * dep[lca];
	}

	public static long[] get(int a, int k, int b, long req, int lca) {
		int dep1 = dep[a] - dep[lca], dep2 = dep[b] - dep[lca];
		if (k > dep1) {
			k -= dep1;
			int node = kthParent(dep2 - k, b);
			return new long[] { Wt(b, lca, lca) + Wt(a, lca, lca) - Wt(b, node, node), node };
		}
		int node = kthParent(k, a);
		return new long[] { Wt(a, node, node), node };
	}

	public int[] findMedian(int n, List<List<Integer>> edges, List<List<Integer>> queries) {
		adj = new ArrayList<>();
		for (int i = 0; i < n; i++)
			adj.add(new ArrayList<>());

		Par = new long[M][n];
		Sum = new long[M][n];
		dep = new int[n];

		for (List<Integer> edge : edges) {
			int x = edge.get(0), y = edge.get(1), w = edge.get(2);
			adj.get(x).add(new long[] { y, w });
			adj.get(y).add(new long[] { x, w });
		}

		dfs(0, -1);

		List<Integer> ans = new ArrayList<>();
		for (List<Integer> query : queries) {
			int a = query.get(0), b = query.get(1);
			int lca = LCA(a, b);
			long totWt = Wt(a, b, lca);
			long distance = dist(a, b, lca);
			long req = (totWt + 1) / 2;
			long s = 0, e = distance;
			int node = -1;
			while (s <= e) {
				long mid = (s + e) / 2;
				long[] sum = get(a, (int) mid, b, req, lca);
				if (sum[0] >= req) {
					node = (int) sum[1];
					e = mid - 1;
				} else {
					s = mid + 1;
				}
			}
			ans.add(node);
		}
		int[] result = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			result[i] = ans.get(i);
		}
		return result;

	}

	public int[] findMedian(int n, int[][] edges, int[][] queries) {
		List<List<Integer>> edgeList = new ArrayList<>();
		for (int[] edge : edges) {
			edgeList.add(Arrays.asList(edge[0], edge[1], edge[2]));
		}
		List<List<Integer>> queryList = new ArrayList<>();
		for (int[] query : queries) {
			queryList.add(Arrays.asList(query[0], query[1]));
		}
		return findMedian(n, edgeList, queryList);
	}
}
