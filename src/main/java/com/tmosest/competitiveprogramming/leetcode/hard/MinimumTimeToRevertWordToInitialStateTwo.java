package com.tmosest.competitiveprogramming.leetcode.hard;

class MinimumTimeToRevertWordToInitialStateTwo {
	/**
	 * https://leetcode.com/problems/minimum-time-to-revert-word-to-initial-state-ii/
	 * 
	 * @param word
	 * @param k
	 * @return
	 */
	public int minimumTimeToInitialState(String word, int k) {
		int N = word.length();
		int[] zArr = getZarr(word);

		int minOps = N / k + ((N % k == 0) ? 0 : 1);
		for (int i = k; i < N; i += k) {
			if (zArr[i] == 0)
				continue;
			if (N - i == zArr[i])
				minOps = Math.min(minOps, i / k);
		}

		return minOps;
	}

	private int[] getZarr(String text) {
		int N = text.length();
		int[] arr = new int[N];
		int low = 0, high = 0;

		for (int i = 1; i < N; ++i) {
			// Kickstart to the current value
			if (i <= high)
				arr[i] = Math.min(high - i + 1, arr[i - low]);
			// Brute-force
			while (i + arr[i] < N && text.charAt(arr[i]) == text.charAt(i + arr[i]))
				arr[i]++;
			if (i + arr[i] - 1 >= high) {
				high = i + arr[i] - 1;
				low = i;
			}
		}

		return arr;
	}
}
