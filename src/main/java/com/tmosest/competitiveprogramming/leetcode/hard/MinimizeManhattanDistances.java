package com.tmosest.competitiveprogramming.leetcode.hard;

class MinimizeManhattanDistances {
	/**
	 * https://leetcode.com/problems/minimize-manhattan-distances/description/
	 * 
	 * @param points
	 * @return
	 */
	public int minimumDistance(int[][] A) {
		int minsum, maxsum, mindiff, maxdiff;
		int n = A.length;

		minsum = maxsum = A[0][0] + A[0][1];
		int minidx = 0;
		int maxidx = 0;
		mindiff = maxdiff = A[0][0] - A[0][1];
		int mindidx = 0;
		int maxdidx = 0;
		for (int i = 1; i < n; i++) {
			int sum = A[i][0] + A[i][1];
			int diff = A[i][0] - A[i][1];
			if (sum < minsum) {
				minidx = i;
				minsum = sum;
			}

			else if (sum > maxsum) {
				maxidx = i;
				maxsum = sum;
			}
			if (diff < mindiff) {
				mindidx = i;
				mindiff = diff;
			} else if (diff > maxdiff) {
				maxdidx = i;
				maxdiff = diff;
			}
		}
		if (maxsum - minsum > maxdiff - mindiff) {
			int ans1 = fun(maxidx, A);
			int ans2 = fun(minidx, A);

			return Math.min(ans1, ans2);
		} else {
			int ans1 = fun(mindidx, A);
			int ans2 = fun(maxdidx, A);
			return Math.min(ans1, ans2);
		}

	}

	// https://www.geeksforgeeks.org/maximum-manhattan-distance-between-a-distinct-pair-from-n-coordinates/
	private int fun(int idx, int[][] A) {
		int minsum, maxsum, mindiff, maxdiff;
		int N = A.length;
		minsum = maxsum = A[0][0] + A[0][1];
		mindiff = maxdiff = A[0][0] - A[0][1];
		if (idx == 0) {
			minsum = maxsum = A[1][0] + A[1][1];
			mindiff = maxdiff = A[1][0] - A[1][1];
		}
		if (idx != 0) {
			for (int i = 1; i < N; i++) {
				if (i == idx)
					continue;
				int sum = A[i][0] + A[i][1];
				int diff = A[i][0] - A[i][1];
				if (sum < minsum)
					minsum = sum;
				else if (sum > maxsum)
					maxsum = sum;
				if (diff < mindiff)
					mindiff = diff;
				else if (diff > maxdiff)
					maxdiff = diff;
			}
		} else {
			for (int i = 2; i < N; i++) {
				if (i == idx)
					continue;
				int sum = A[i][0] + A[i][1];
				int diff = A[i][0] - A[i][1];
				if (sum < minsum)
					minsum = sum;
				else if (sum > maxsum)
					maxsum = sum;
				if (diff < mindiff)
					mindiff = diff;
				else if (diff > maxdiff)
					maxdiff = diff;
			}
		}

		int maximum = Math.max(maxsum - minsum, maxdiff - mindiff);

		return maximum;
	}
}
