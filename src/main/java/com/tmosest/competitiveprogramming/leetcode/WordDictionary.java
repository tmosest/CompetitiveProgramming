package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary {
  boolean debugMode = false;

  /**
   * Inner UtilTrie Node class.
   */
  private class TrieNode {
    char letter;
    Map<Character, TrieNode> children;
    boolean isWord;

    public TrieNode(char letter) {
      this.letter = letter;
      children = new HashMap<>();
      isWord = false;
    }
  }

  private TrieNode root;

  /** Initialize your data structure here. */
  public WordDictionary() {
    root = new TrieNode('-');
  }

  /** Adds a word into the data structure. */
  public void addWord(String word) {
    TrieNode runner = root;
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      TrieNode child = runner.children.get(letter);
      if (child == null) {
        child = new TrieNode(letter);
      }
      runner.children.put(letter, child);
      runner = child;
    }
    runner.isWord = true;
  }

  /**
   * Returns if the word is in the data structure.
   * A word could contain the dot character '.' to represent any one letter.
   */
  public boolean search(String word) {
    if (debugMode) {
      System.out.println("word: " + word);
    }
    TrieNode runner = root;
    return search(word, runner);
  }

  private boolean search(String word, TrieNode node) {
    TrieNode runner = node;
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      if (debugMode) {
        System.out.println("letter: " + letter);
      }
      if (letter == '.') {
        String remainder = word.substring(i + 1, word.length());
        if (debugMode) {
          System.out.println("remainder: " + remainder);
        }
        for (TrieNode child : runner.children.values()) {
          if (debugMode) {
            System.out.println("child: " + child.letter + " isWord: " + child.isWord);
          }
          if (remainder.length() == 0 && child.isWord) {
            return true;
          }
          if (search(remainder, child)) {
            return true;
          }
        }
      }
      TrieNode child = runner.children.get(letter);
      if (child == null) {
        return false;
      }
      runner = child;
    }
    return runner.isWord;
  }
}
