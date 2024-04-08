package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Comparator;
import java.util.PriorityQueue;

class ShortestAndLexicographicallySmallestBeautifulString {
	/**
	 * https://leetcode.com/problems/shortest-and-lexicographically-smallest-beautiful-string/description/
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public String shortestBeautifulSubstring(String s, int k) {

		PriorityQueue<String> priorityQueue = new PriorityQueue<>(5, new Comparator<String>() {
			@Override
			public int compare(String e1, String e2) {
				if (e1.length() != e2.length()) {
					return Integer.compare(e1.length(), e2.length());
				}
				return e1.compareTo(e2);
			}
		});
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);

				int count = 0;
				for (int c = 0; c < sub.length(); c++) {
					if (sub.charAt(c) == '1') {
						++count;
					}
				}
				if (count == k) {
					priorityQueue.add(sub);
				}
			}
		}

		return priorityQueue.isEmpty() ? "" : priorityQueue.poll();
	}
}
