package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class FindEdgesInShortestPaths {
	/**
	 * https://leetcode.com/problems/find-edges-in-shortest-paths/description/
	 * 
	 * @param n
	 * @param edges
	 * @return
	 */
	public boolean[] findAnswer(int n, int[][] edges) {
		Long[] dist = new Long[n];
		Arrays.fill(dist, Long.MAX_VALUE / 2);
		dist[0] = 0L;
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return dist[a].compareTo(dist[b]);
			}
		});
		pq.add(0);
		List<List<int[]>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++)
			graph.add(new ArrayList<int[]>());
		int pt = 0;
		for (int[] i : edges) {
			graph.get(i[0]).add(new int[] { i[1], i[2], pt });
			graph.get(i[1]).add(new int[] { i[0], i[2], pt });
			pt++;
		}
		while (!pq.isEmpty()) {
			int nxt = pq.remove();
			for (int[] i : graph.get(nxt)) {
				long nextDist = dist[nxt] + i[1];
				if (nextDist < dist[i[0]]) {
					dist[i[0]] = nextDist;
					pq.add(i[0]);
				}
			}
		}
		boolean[] ans = new boolean[edges.length];
		LinkedList<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[n];
		q.add(n - 1);
		visited[n - 1] = true;
		while (!q.isEmpty()) {
			int nxt = q.remove();
			for (int[] i : graph.get(nxt)) {
				if (dist[i[0]] == dist[nxt] - i[1]) {
					ans[i[2]] = true;
					if (!visited[i[0]]) {
						visited[i[0]] = true;
						q.add(i[0]);
					}
				}
			}
		}
		return ans;
	}
}
