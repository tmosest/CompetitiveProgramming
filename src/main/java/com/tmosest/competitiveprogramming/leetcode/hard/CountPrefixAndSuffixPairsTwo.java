package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.HashMap;
import java.util.List;

class CountPrefixAndSuffixPairsTwo {
	/**
	 * https://leetcode.com/contest/weekly-contest-385/problems/count-prefix-and-suffix-pairs-ii/
	 * 
	 * @param words
	 * @return
	 */
	public long countPrefixSuffixPairs(String[] words) {
		Node root = new Node();
		long count = 0;
		for (String word : words) {
			Node node = root;
			for (int i = 0; i < word.length(); i++) {
				count += (node = node.map.computeIfAbsent(List.of(word.charAt(i), word.charAt(word.length() - i - 1)),
						t -> new Node())).count;
			}
			node.count++;
		}
		return count;
	}

	private class Node {
		private HashMap<List<Character>, Node> map = new HashMap<>();
		private int count;
	}
}
