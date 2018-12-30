package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MapSum {

  private class TrieNode {
    char letter;
    Map<Character, TrieNode> children;
    int sum;
    boolean isWord;

    TrieNode(char letter) {
      this.letter = letter;
      children = new HashMap<>();
      this.sum = 0;
      this.isWord = false;
    }
  }

  private TrieNode root;

  public MapSum() {
    root = new TrieNode('-');
  }

  /**
   * Insert a new word into the MapSum.
   * @param key A string.
   * @param val A value for this string.
   */
  public void insert(String key, int val) {
    TrieNode run = root;
    for (int i = 0; i < key.length(); i++) {
      char letter = key.charAt(i);
      TrieNode child = run.children.get(letter);
      if (child == null) {
        child = new TrieNode(letter);
        run.children.put(letter, child);
      }
      run = child;
    }
    run.sum = val;
    run.isWord = true;
  }

  /**
   * The sum of all words with this prefix.
   * @param prefix The prefix string.
   * @return The sum of all values for words with the prefix.
   */
  public int sum(String prefix) {
    TrieNode run = root;
    for (int i = 0; i < prefix.length(); i++) {
      char letter = prefix.charAt(i);
      TrieNode child = run.children.get(letter);
      if (child == null) {
        return 0;
      }
      run = child;
    }
    return sum(run);
  }

  private int sum(TrieNode node) {
    int sum = 0;

    if (node == null) {
      return sum;
    }

    if (node.isWord) {
      sum += node.sum;
    }

    for (TrieNode child : node.children.values()) {
      sum += sum(child);
    }

    return sum;
  }
}
