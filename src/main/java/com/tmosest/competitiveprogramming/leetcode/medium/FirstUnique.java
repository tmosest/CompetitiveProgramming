package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FirstUnique {

	private List<Integer> list;
	private Map<Integer, Integer> counts;

	FirstUnique(int[] nums) {
		list = new ArrayList<>();
		counts = new HashMap<>();

		for (int num : nums) {
			this.add(num);
		}
	}

	int showFirstUnique() {
		for (int value : list) {
			int count = counts.getOrDefault(value, 0);
			if (count == 1) {
				return value;
			}
		}
		return -1;
	}

	void add(int value) {
		list.add(value);
		int count = counts.getOrDefault(value, 0);
		counts.put(value, count + 1);
	}
}
