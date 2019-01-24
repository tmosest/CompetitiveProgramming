package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class LongestWordInDictionary {

  /**
   * Find the longest word that can be made of other words.
   * @param words An array of strings.
   * @return The longest word that is also lexicographically smallest.
   */
  public String longestWord(String[] words) {
    Trie trie = new Trie();
    int index = 0;
    for (String word: words) {
      trie.insert(word, ++index); //indexed by 1
    }
    trie.words = words;
    return trie.dfs();
  }

  private class TrieNode {
    char letter;
    HashMap<Character, TrieNode> children;
    int end;

    public TrieNode(char letter) {
      this.letter = letter;
      children = new HashMap();
    }
  }

  private class Trie {
    TrieNode root;
    String[] words;

    Trie() {
      root = new TrieNode('-');
    }

    void insert(String word, int index) {
      TrieNode cur = root;
      for (char c : word.toCharArray()) {
        cur.children.putIfAbsent(c, new TrieNode(c));
        cur = cur.children.get(c);
      }
      cur.end = index;
    }

    String dfs() {
      String ans = "";
      Stack<TrieNode> stack = new Stack<>();
      stack.push(root);
      while (!stack.isEmpty()) {
        TrieNode node = stack.pop();
        if (node.end > 0 || node == root) {
          if (root != node) {
            String word = words[node.end - 1];
            if (word.length() > ans.length()
                || word.length() == ans.length() && word.compareTo(ans) < 0
                ) {
              ans = word;
            }
          }
          for (TrieNode nei: node.children.values()) {
            stack.push(nei);
          }
        }
      }
      return ans;
    }
  }
}
