package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class AutocompleteSystem {
  //UtilTrieNode class
  class TrieNode {
    public boolean end;
    public Map<Character, TrieNode> children;
    public Map<String, Integer> counts;

    public TrieNode() {
      children = new HashMap<>();
      counts = new HashMap<>();
    }
  }

  public class Pair {
    String str;
    int val;

    public Pair(String str, int val) {
      this.str = str;
      this.val = val;
    }
  }

  TrieNode root;
  TrieNode cur;
  String prefix;

  public AutocompleteSystem(String[] sentences, int[] times) {
    //empty the sentences in root
    root = new TrieNode();
    prefix = "";
    for (int i = 0; i < sentences.length; i++) {
      insert(sentences[i], times[i]);
    }
    cur = root;
  }

  public void insert(String word, int count) {
    TrieNode node = root;
    for (char c: word.toCharArray()) {
      if (!node.children.containsKey(c)) {
        node.children.put(c, new TrieNode());
      }
      node = node.children.get(c);
      node.counts.put(word, node.counts.getOrDefault(word, 0) + count);
    }
  }

  public List<String> input(char letter) {
    if (letter == '#') {
      insert(prefix, 1);
      //reset cur!!
      cur = root;
      prefix = "";
      return new ArrayList<>();
    }
    prefix += letter;
    if (cur == null) {
      return new ArrayList<>();
    }
    if (!cur.children.containsKey(letter)) {
      cur = null;
      return new ArrayList<>();
    }
    cur = cur.children.get(letter);
    PriorityQueue<Pair> heap = new PriorityQueue<>(
        (o1, o2) -> o1.val == o2.val ? o1.str.compareTo(o2.str) : o2.val - o1.val
    );
    for (String str: cur.counts.keySet()) {
      heap.add(new Pair(str, cur.counts.get(str)));
    }
    List<String> res = new ArrayList<>();
    for (int i = 0; i < 3 && !heap.isEmpty(); i++) {
      res.add(heap.poll().str);
    }
    return res;
  }
}
