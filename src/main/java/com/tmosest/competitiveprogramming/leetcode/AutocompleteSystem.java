package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class AutocompleteSystem {

  private class TrieNode {
    char letter;
    Map<Character, TrieNode> children;
    boolean isWord;
    int times;

    public TrieNode(char letter) {
      this.letter = letter;
      children = new HashMap<>();
      isWord = false;
      times = 0;
    }
  }

  private class SearchPhrase {
    String word;
    int times;

    public SearchPhrase(String word, int times) {
      this.word = word;
      this.times = times;
    }
  }

  private class SearchPhraseComparator implements Comparator<SearchPhrase> {

    @Override
    public int compare(SearchPhrase o1, SearchPhrase o2) {
      int compareTimes = Integer.compare(o1.times, o2.times);
      if (compareTimes == 0) {
        int compareString = o1.word.compareTo(o2.word);
        if (compareString < 0) {
          return -1;
        } else if (compareString > 0) {
          return 1;
        }
        return 0;
      }
      return -1 * compareTimes;
    }
  }

  private TrieNode root;
  private StringBuilder sb;

  public AutocompleteSystem(String[] sentences, int[] times) {
    root = new TrieNode('-');
    for (int i = 0; i < sentences.length; i++) {
      insertWord(sentences[i], times[i]);
    }
    sb = new StringBuilder();
  }

  private void insertWord(String word, int times) {
    TrieNode run = root;
    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);
      TrieNode child = run.children.get(letter);
      if (child == null) {
        child = new TrieNode(letter);
        run.children.put(letter, child);
      }
      run = child;
    }
    run.isWord = true;
    if (run.times != 0) {
      times += run.times;
    }
    run.times = times;
  }

  private PriorityQueue<SearchPhrase> findSearchPhrases(String phrase) {
    TrieNode run = root;
    PriorityQueue<SearchPhrase> queue = new PriorityQueue<>(10, new SearchPhraseComparator());
    StringBuilder word = new StringBuilder();
    for (int i = 0; i < phrase.length(); i++) {
      char letter = phrase.charAt(i);
      TrieNode child = run.children.get(letter);
      if (child == null) {
        return queue;
      }
      word.append(letter);
      if (child.isWord) {
        SearchPhrase searchPhrase = new SearchPhrase(word.toString(), child.times);
        queue.add(searchPhrase);
      }
      run = child;
    }
    constructSearchPhrases(word, queue, run);
    return queue;
  }

  private void constructSearchPhrases(StringBuilder phrase, PriorityQueue<SearchPhrase> queue, TrieNode trieNode) {
    if (trieNode == null) {
      return;
    }
    for (TrieNode child : trieNode.children.values()) {
      StringBuilder newPhrase = new StringBuilder(phrase.toString());
      newPhrase.append(child.letter);
      if (child.isWord) {
        SearchPhrase searchPhrase = new SearchPhrase(newPhrase.toString(), child.times);
        queue.add(searchPhrase);
      }
      constructSearchPhrases(newPhrase, queue, child);
    }
  }

  public List<String> input(char c) {
    if (c == '#') {
      insertWord(sb.toString(), 1);
      sb = new StringBuilder();
      return new ArrayList<>();
    }
    sb.append(c);
    PriorityQueue<SearchPhrase> queue = findSearchPhrases(sb.toString());
    List<String> result = new ArrayList<>();
    String search = sb.toString();
    while(!queue.isEmpty() && result.size() < 3) {
      String word = queue.poll().word;
      if (word.length() >= search.length()) {
        result.add(word);
      }
    }
    return result;
  }
}
