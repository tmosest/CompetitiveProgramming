package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ThroneInheritance {

  private Tree root;
  private Map<String, Tree> map;

  ThroneInheritance(String kingName) {
    root = new Tree(kingName);
    map = new HashMap<>();
    map.put(kingName, root);
  }

  void birth(String parentName, String childName) {
    if (!map.containsKey(parentName)) {
      return;
    }

    Tree node = map.get(parentName);
    Tree child = new Tree(childName);
    node.children.add(child);
    map.put(childName, child);
  }

  void death(String name) {
    if (!map.containsKey(name)) {
      return;
    }
    Tree node = map.get(name);
    node.isAlive = false;
  }

  List<String> getInheritanceOrder() {
    List<String> res = new ArrayList<>();
    helper(root, res);
    return res;
  }

  private void helper(Tree node, List<String> res) {
    if (node == null) {
      return;
    }

    if (node.isAlive) {
      res.add(node.name);
    }

    for (Tree next : node.children) {
      helper(next, res);
    }
  }

  private class Tree {

    private String name;
    private List<Tree> children;
    private boolean isAlive;

    private Tree(String name) {
      this.name = name;
      children = new ArrayList<>();
      isAlive = true;
    }
  }
}
