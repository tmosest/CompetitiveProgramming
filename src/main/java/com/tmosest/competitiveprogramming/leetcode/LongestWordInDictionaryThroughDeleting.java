package com.tmosest.competitiveprogramming.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestWordInDictionaryThroughDeleting {

  /**
   * Determine the longest word that can be created from the dictionary.
   * Using deletion only.
   * @param str The string that can have characters deleted from it.
   * @param dictionary The dictionary of words.
   * @return The longest word from the dictionary that can be made from str.
   */
  public String findLongestWord(String str, List<String> dictionary) {
    root = new TrieNode('-');
    char[] strArray = str.toCharArray();
    for (int i = strArray.length - 1; i >= 0; i--) {
      TrieNode node = new TrieNode(strArray[i]);
      for (char oldLetter : root.nodes.keySet()) {
        node.nodes.put(oldLetter, root.nodes.get(oldLetter));
      }
      root.nodes.put(node.letter, node);
    }
    String result = "";
    for (String word : dictionary) {
      if (root.isWord(word)) {
        if (word.length() > result.length()) {
          result = word;
        } else if (word.length() == result.length()) {
          result = (word.compareTo(result) < 0) ? word : result;
        }
      }
    }
    return result;
  }

  private TrieNode root;

  private class TrieNode {
    char letter;
    Map<Character, TrieNode> nodes;

    private TrieNode(char letter) {
      this.letter = letter;
      this.nodes = new HashMap<>();
    }

    private boolean isWord(String word) {
      TrieNode runner = this;
      for (int i = 0; i < word.length(); i++) {
        char letter = word.charAt(i);
        if (runner == null || !runner.nodes.containsKey(letter)) {
          return false;
        }
        runner = runner.nodes.get(letter);
      }
      return true;
    }
  }
}
