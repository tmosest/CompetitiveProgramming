package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

class AppleRedistributionIntoBoxes {

	public int minimumBoxes(int[] apple, int[] capacity) {

		int apples = Arrays.stream(apple).sum();

		Arrays.sort(capacity);

		for (int i = 0; i < capacity.length; i++) {
			apples -= capacity[capacity.length - 1 - i];

			if (apples <= 0)
				return i + 1;
		}

		return -1;
	}
}
