package com.tmosest.competitiveprogramming.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AutoSuggester {

  private class TrieNode {
    char letter;
    boolean isWord;
    Map<Character, TrieNode> children;

    public TrieNode(char letter) {
      this.letter = letter;
      isWord = false;
      children = new HashMap<>();
    }
  }

  private TrieNode root;

  private void addWord(String str) {
    if (str == null || str.length() < 1) {
      return;
    }
    char[] strArray = str.toCharArray();
    TrieNode runner = root;
    for (Character c : strArray) {
      TrieNode child = runner.children.get(c);
      if (child == null) {
        child = new TrieNode(c);
        runner.children.put(c, child);
      }
      runner = child;
    }
    runner.isWord = true;
  }

  private boolean isPrefix(String str) {
    if (str == null || str.length() < 1) {
      return false;
    }
    char[] strArray = str.toCharArray();
    TrieNode runner = root;
    for (Character c : strArray) {
      TrieNode child = runner.children.get(c);
      if (child == null) {
        return false;
      }
      runner = child;
    }
    return true;
  }

  private void findWordsWithPrefix(String prefix, List<String> results) {
    if (prefix == null || prefix.length() < 1) {
      return;
    }
    char[] strArray = prefix.toCharArray();
    TrieNode runner = root;
    // Loop through to the end of the prefix.
    for (Character c : strArray) {
      TrieNode child = runner.children.get(c);
      runner = child;
    }
    for (TrieNode child : runner.children.values()) {
      generateWords(prefix, child, results);
    }
  }

  private void generateWords(String wordSoFar, TrieNode node, List<String> results) {
    wordSoFar += node.letter;
    if (node.isWord) {
      results.add(wordSoFar);
    }
    for (TrieNode child : node.children.values()) {
      generateWords(wordSoFar, child, results);
    }
  }

  /**
   * Creates a new AutoSuggester.
   * @param dictionary A dictionary of allowed words.
   */
  public AutoSuggester(Set<String> dictionary) {
    root = new TrieNode('-');
    for (String str : dictionary) {
      addWord(str);
    }
  }

  /**
   * Suggests word from dictionary based on input string.
   * @param str The str we are searching.
   * @return Words that start with the string.
   */
  public List<String> suggest(String str) {
    List<String> result = new ArrayList<>();
    if (!isPrefix(str)) {
      return result;
    }
    findWordsWithPrefix(str, result);
    return result;
  }
}
