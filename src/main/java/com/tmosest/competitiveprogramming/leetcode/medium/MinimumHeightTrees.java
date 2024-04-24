package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;


class MinimumHeightTrees {

	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
		List<Integer> result = new ArrayList<>();

		Map<Integer, List<Integer>> edgeMap = new HashMap<>();

		for (int[] edge : edges) {
			List<Integer> edgeList = edgeMap.getOrDefault(edge[0], new ArrayList<>());
			edgeList.add(edge[1]);
			edgeMap.put(edge[0], edgeList);

			List<Integer> edgeListOther = edgeMap.getOrDefault(edge[1], new ArrayList<>());
			edgeListOther.add(edge[0]);
			edgeMap.put(edge[1], edgeListOther);
		}
		
		TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			int heigth = getTreeHeight(i, edgeMap);
			List<Integer> list = treeMap.getOrDefault(heigth, new ArrayList<>());
			list.add(i);
			treeMap.put(heigth, list);
		}

		int min = Integer.MAX_VALUE;

		for (Integer key : treeMap.keySet()) {
			min = Math.min(key, min);
		}

		return (min == Integer.MAX_VALUE) ? result : treeMap.get(min);
	}

	private int getTreeHeight(int root, Map<Integer, List<Integer>> edgeMap) {
		int height = 0;

		Set<Integer> visited = new HashSet<>();

		Queue<Pos> queue = new LinkedList<>();
		queue.add(new Pos(root, 0));

		while (!queue.isEmpty()) {
			Pos node = queue.poll();
			visited.add(node.node);
			height = Math.max(height, node.pos);
			List<Integer> edges = edgeMap.getOrDefault(node.pos, new ArrayList<>());
			for (int edge : edges) {
				if (visited.contains(edge)) {
					continue;
				}
				queue.add(new Pos(edge, node.pos + 1));
			}
			if (queue.isEmpty()) {
				continue;
			}
		}

		return height;
	}

	private static class Pos {
		int node;
		int pos;

		private Pos(int node, int pos) {
			this.node = node;
			this.pos = pos;
		}
	}
}
