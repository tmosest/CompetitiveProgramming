package com.tmosest.competitiveprogramming.utils;

import java.util.HashMap;
import java.util.Map;

public class UtilTrieNode {
  public char letter;
  public boolean isWord;
  public int endIndex = -1;
  public Map<Character, UtilTrieNode> children = new HashMap<>();

  public UtilTrieNode() {
    letter = '-';
  }

  public UtilTrieNode(char letter) {
    this.letter = letter;
    this.isWord = false;
  }

  public UtilTrieNode(char letter, boolean isWord) {
    this.letter = letter;
    this.isWord = isWord;
  }
}
