package com.tmosest.competitiveprogramming.utils;

import java.util.HashMap;
import java.util.Map;

public class UtilTrieNode {
  public char letter = '-';
  public boolean isWord = false;
  public int endIndex = -1;
  public Map<Character, UtilTrieNode> children = new HashMap<>();

  UtilTrieNode() {
  }

  UtilTrieNode(char letter) {
    this.letter = letter;
    this.isWord = false;
  }

  UtilTrieNode(char letter, boolean isWord) {
    this.letter = letter;
    this.isWord = isWord;
  }
}
