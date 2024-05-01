package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class LongestWordInDictionary {
	/**
	 * https://leetcode.com/problems/longest-word-in-dictionary/description/
	 * 
	 * @param words
	 * @return
	 */
	public String longestWord(String[] words) {
		Trie trie = new Trie();

		for (String word : words) {
			trie.addWord(word);
		}

		int max = 0;
		String result = "";

		Queue<TrieNode> trieNodes = new LinkedList<>();
		trieNodes.add(trie.root);

		while (!trieNodes.isEmpty()) {
			TrieNode trieNode = trieNodes.poll();
			for (TrieNode next : trieNode.map.values()) {
				if (next.ending) {
					trieNodes.add(next);
					if (next.word.length() > max || (next.word.length() == max && next.word.compareTo(result) < 0)) {
						max = next.word.length();
						result = next.word;
					}
				}
			}
		}

		return result;
	}

	private static class TrieNode {
		public String word;
        public boolean ending = false;
        public Map<Character, TrieNode> map;
        
        public TrieNode(String word) {
            this.map = new HashMap<>();
			this.word = word;
        }
    }
    
    private static class Trie {

        public TrieNode root = new TrieNode("");
        
        public void addWord(String word) {
            TrieNode current = root;
            for (char letter : word.toCharArray()) {
                TrieNode next = current.map.getOrDefault(letter, new TrieNode(current.word + letter));
                current.map.put(letter, next);
				current = next;
            }
            current.ending = true;
        }
    }
}
