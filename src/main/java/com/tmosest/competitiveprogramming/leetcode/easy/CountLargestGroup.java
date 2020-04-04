package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CountLargestGroup {

	int countLargestGroup(int num) {
		Map<Integer, List<Integer>> digitSumMap = new HashMap<>();

		int maxSize = 0;

		for (int i = 1; i <= num; i++) {
			int sum = sumDigits(i);
			List<Integer> sums = digitSumMap.getOrDefault(sum, new ArrayList<>());
			sums.add(i);
			digitSumMap.put(sum, sums);
			maxSize = Math.max(maxSize, sums.size());
		}

		int res = 0;

		for (List<Integer> list : digitSumMap.values()) {
			if (list.size() == maxSize) {
				++res;
			}
		}

		return res;
	}

	private int sumDigits(int num) {
		int res = 0;

		while (num > 0) {
			res += num % 10;
			num /= 10;
		}

		return res;
	}
}
