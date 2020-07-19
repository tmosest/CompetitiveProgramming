package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class NumberOfNodesInTheSubtreeWithTheSameLabel {

  int[] res;

  int[] countSubTrees(int num, int[][] es, String vals) {
    Node root = build(num, es, vals);
    res = new int[num];
    dfs(root);
    return res;
  }

  private Map<Character, Integer> dfs(Node node) {
    Map<Character, Integer> map = new HashMap<>();
    if (node == null) {
      return map;
    }
    map.put(node.letter, 1);
    for (Node child : node.cs) {

      Map<Character, Integer> cmap = dfs(child);
      for (char c : cmap.keySet()) {
        map.put(c, map.getOrDefault(c, 0) + cmap.get(c));
      }
    }
    res[node.key] = map.get(node.letter);
    return map;
  }


  private Node build(int num, int[][] es, String pat) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int[] e : es) {
      map.computeIfAbsent(e[0], k -> new ArrayList<>());
      map.computeIfAbsent(e[1], k -> new ArrayList<>());
      map.get(e[1]).add(e[0]);
      map.get(e[0]).add(e[1]);
    }
    Node root = new Node(0);
    root.letter = pat.charAt(0);
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      Node curr = queue.poll();
      for (int neig : map.getOrDefault(curr.key, new ArrayList<>())) {
        if (curr.parent == null || neig != curr.parent.key) {
          Node next = new Node(neig);
          next.letter = pat.charAt(neig);
          next.parent = curr;
          curr.cs.add(next);
          queue.offer(next);
        }
      }
    }
    return root;
  }

  class Node {

    char letter;
    int key;
    List<Node> cs;
    Node parent;

    public Node(int key) {
      this.key = key;
      cs = new ArrayList<>();
      this.parent = null;
    }
  }
}
