package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class Combinations {

	List<List<Integer>> combine(int nums, int groupSize) {
		List<List<Integer>> combinations = new ArrayList<>();
		for (int i = 1; i <= nums; i++) {
			combine(nums, groupSize, i, new ArrayList<>(), combinations);
		}
		return combinations;
	}

	private void combine(
			int nums,
			int groupSize,
			int index,
			List<Integer> combination,
			List<List<Integer>> combinations
	) {
		if (index > nums) {
			return;
		}
		combination.add(index);
		if (combination.size() == groupSize) {
			combinations.add(combination);
			return;
		}
		for (int i = index + 1; i <= nums; i++) {
			List<Integer> copy = new ArrayList<>();
			copy.addAll(combination);
			combine(nums, groupSize, i, copy, combinations);
		}
	}
}
