package com.tmosest.competitiveprogramming.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class UtilTrie implements Iterable<UtilTrieNode>, Iterator<UtilTrieNode> {

  private UtilTrieNode root = new UtilTrieNode('-');
  private UtilTrieNode runner = root;
  private List<String> words = new ArrayList<>();

  public UtilTrie() {}

  /**
   * Creates all possible words after deletion.
   * @param word A word where we can delete any characters from it.
   */
  public UtilTrie(String word) {
    char[] strArray = word.toCharArray();
    for (int i = strArray.length - 1; i >= 0; i--) {
      int size = words.size();
      for (int j = 0; j < size; j++) {
        addWord("" + strArray[i] + words.get(j));
      }
      addWord("" + strArray[i]);
    }
  }

  /**
   * Creates a trie out of an array of words.
   * @param words An array of words.
   */
  public UtilTrie(String[] words) {
    for (String word: words) {
      addWord(word);
    }
  }

  /**
   * Add a new word to the prefix tree.
   * @param word The word to add.
   */
  public void addWord(String word) {
    addPrefix(word);
    runner.isWord = true;
    if (runner.endIndex == -1) {
      words.add(word);
      runner.endIndex = words.size() - 1;
    }
  }

  /**
   * Add a new prefix to the tree.
   * @param prefix the new prefix
   */
  public void addPrefix(String prefix) {
    runner = root;
    for (char letter : prefix.toCharArray()) {
      runner.children.putIfAbsent(letter, new UtilTrieNode(letter));
      runner = runner.children.get(letter);
    }
  }

  /**
   * Determine if a word is a prefix in the tree.
   * @param prefix the word we are looking for.
   * @return Is this word a prefix or not.
   */
  public boolean isPrefix(String prefix) {
    setSearch(prefix);
    int index = 0;
    for (UtilTrieNode trieNodes : this) {
      index++;
    }
    return index == prefix.length() - 1;
  }

  /**
   * Determine if this is a word (.'s can be any character).
   * @param search The word to look for.
   * @return Is this word in the trie.
   */
  public boolean isWord(String search) {
    for (String word : words) {
      if (word.length() != search.length()) {
        continue;
      }
      for (int i = 0; i < word.length(); i++) {
        if (search.charAt(i) != '.' && search.charAt(i) != word.charAt(i)) {
          break;
        }
        if (i == search.length() - 1) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Get the longest word in the dictionary.
   * @param dictionary A list of words, the dictionary.
   * @return The longest string that is a word in this dictionary.
   */
  public String getLongestWord(List<String> dictionary) {
    String result = "";
    for (String word : dictionary) {
      if (isWord(word)) {
        if (word.length() > result.length()) {
          result = word;
        } else if (word.length() == result.length()) {
          result = (word.compareTo(result) < 0) ? word : result;
        }
      }
    }
    return result;
  }

  /**
   * Get the longest word in the dictionary that can be made from a sequence of smaller words.
   * @return The longest word.
   */
  public String getLongestWordMadeOfOtherWords() {
    // Assume all the words have already been added.
    String ans = "";
    runner = root;
    Stack<UtilTrieNode> stack = new Stack<>();
    stack.add(runner);
    while (!stack.isEmpty()) {
      runner = stack.pop();
      if (runner.endIndex >= 0 || runner == root) {
        if (root != runner) {
          String word = words.get(runner.endIndex);
          if (word.length() > ans.length()
              || word.length() == ans.length() && word.compareTo(ans) < 0) {
            ans = word;
          }
        }
        for (UtilTrieNode nei: runner.children.values()) {
          stack.push(nei);
        }
      }
    }
    return ans;
  }

  /**
   * Get words that start with a given prefix.
   * @param prefix The prefix the words should start with.
   * @return A list of words that start with this word.
   */
  public List<String> getWordsWithPrefix(String prefix) {
    List<String> result = new ArrayList<>();
    for (String word : words) {
      if (word.indexOf(prefix) == 0) {
        result.add(word);
      }
    }
    return result;
  }

  private String search;
  private int searchIndex;

  public void setSearch(String search) {
    this.search = search;
    searchIndex = 0;
  }

  @Override
  public Iterator<UtilTrieNode> iterator() {
    runner = root;
    return this;
  }

  @Override
  public boolean hasNext() {
    return runner != null
        && searchIndex < search.length()
        && runner.children.containsKey(search.charAt(searchIndex));
  }

  @Override
  public UtilTrieNode next() {
    runner = runner.children.get(search.charAt(searchIndex));
    return runner;
  }
}
