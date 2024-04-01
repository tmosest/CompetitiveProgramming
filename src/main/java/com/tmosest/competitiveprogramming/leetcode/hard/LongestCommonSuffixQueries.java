package com.tmosest.competitiveprogramming.leetcode.hard;

import com.tmosest.competitiveprogramming.leetcode.hard.AutocompleteSystem.TrieNode;

class LongestCommonSuffixQueries {
	/**
	 * https://leetcode.com/problems/longest-common-suffix-queries/
	 * 
	 * @param wordsContainer
	 * @param wordsQuery
	 * @return
	 */
	public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {
		TrieNode trie = new TrieNode();
		for (int i = 0; i < wordsContainer.length; ++i) {
			String word = new StringBuilder(wordsContainer[i]).reverse().toString();
			TrieNode node = trie;
			if (node.val == -1 || word.length() < node.val) {
				node.idx = i;
				node.val = word.length();
			}
			for (char ch : word.toCharArray()) {
				if (node.next[ch - 'a'] == null)
					node.next[ch - 'a'] = new TrieNode();
				node = node.next[ch - 'a'];
				if (node.val == -1 || word.length() < node.val) {
					node.idx = i;
					node.val = word.length();
				}
			}
		}
		int n = wordsQuery.length;
		int[] ans = new int[n];
		for (int i = 0; i < n; ++i) {
			String word = new StringBuilder(wordsQuery[i]).reverse().toString();
			TrieNode node = trie;
			for (char ch : word.toCharArray()) {
				if (node.next[ch - 'a'] == null)
					break;
				node = node.next[ch - 'a'];
			}
			ans[i] = node.idx;
		}
		return ans;
	}

	private static class TrieNode {
		public TrieNode[] next = new TrieNode[26];
		public int idx = -1;
		public int val = -1;
	}
}
