package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

class FindThePeaks {
	/**
	 * https://leetcode.com/problems/find-the-peaks/description/
	 * 
	 * @param mountain
	 * @return
	 */
	public List<Integer> findPeaks(int[] mountain) {
		List<Integer> peaks = new ArrayList<>();

		for (int i = 1; i < mountain.length - 1; i++) {
			if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
				peaks.add(i);
			}
		}

		return peaks;
	}
}
