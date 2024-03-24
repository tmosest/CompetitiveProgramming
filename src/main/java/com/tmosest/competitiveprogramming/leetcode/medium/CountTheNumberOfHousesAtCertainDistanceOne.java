package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CountTheNumberOfHousesAtCertainDistanceOne {
	/**
	 * https://leetcode.com/problems/count-the-number-of-houses-at-a-certain-distance-i/solutions/4600661/java-easy-optimized-o-n-2-floyd-warshal-standard-step-by-step-clean-simple/
	 * 
	 * Floyd Warshal
	 * 
	 * https://en.wikipedia.org/wiki/Floyd–Warshall_algorithm
	 * 
	 * @param n
	 * @param x
	 * @param y
	 * @return
	 */
	public int[] countOfPairs(int n, int x, int y) {
		// Initialization of Distance Matrix (dist):
		int[][] dist = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
			dist[i][i] = 0; // The distance from a house to itself is zero.
			if (i < n)
				dist[i][i + 1] = 1; // there's a street connecting house i to house i + 1 with distance 1.
			if (i > 1)
				dist[i][i - 1] = 1; // there's a street connecting house i - 1 to house i with distance 1.

		}
		dist[x][y] = dist[y][x] = 1; // An additional street connects the house numbered x with the house numbered y.

		for (int k = 1; k <= n; k++) { // Floyd-Warshall algorithm to calculate all-pairs shortest paths
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
						dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					}
				}
			}
		}

		// Counts the number of pairs of houses for each distance and stores it in a map
		// (countMap).
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (dist[i][j] != Integer.MAX_VALUE && i != j) {
					countMap.put(dist[i][j], countMap.getOrDefault(dist[i][j], 0) + 1);
				}
			}
		}

		// Convert the map to the result array
		// result array where result[k - 1] stores the total number of pairs with
		// minimum distance k.
		int[] result = new int[n];
		for (int k = 1; k <= n; k++) {
			result[k - 1] = countMap.getOrDefault(k, 0);
		}

		return result;
	}
}
