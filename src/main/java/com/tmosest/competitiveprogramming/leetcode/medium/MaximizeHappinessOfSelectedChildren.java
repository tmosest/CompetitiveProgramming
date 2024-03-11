package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MaximizeHappinessOfSelectedChildren {

	public long maximumHappinessSum(int[] happiness, int k) {

		long totalHappiness = 0;
		int selections = 0;

		Arrays.sort(happiness);

		for (int i = 0; i < Math.min(happiness.length, k); i++) {
			long currentHappiness = happiness[happiness.length - 1 - i] - selections;
			if (currentHappiness < 0)
				currentHappiness = 0;
			totalHappiness += currentHappiness;
			selections++;
		}

		return totalHappiness;
	}
}
