package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class NumberOfOperationsToMakeNetworkConnected {

  Map<Integer, Set<Integer>> setToNode = new HashMap<>();
  Map<Integer, Integer> nodeToSet = new HashMap<>();

  int makeConnected(int size, int[][] connections) {
    if (connections.length == 0) {
      return 0;
    }

    if (connections.length < size - 1) {
      return -1;
    }

    for (int i = 0; i < size; i++) {
      Set<Integer> singletonSet = new HashSet<>();
      singletonSet.add(i);
      setToNode.put(i, singletonSet);
      nodeToSet.put(i, i);
    }

    for (int i = 0; i < connections.length; i++) {
      int leftNode = connections[i][0];
      int rightNode = connections[i][1];
      union(leftNode, rightNode);
    }

    return setToNode.keySet().size() - 1;
  }

  private void union(int leftNode, int rightNode) {
    int leftSet = nodeToSet.get(leftNode);
    int rightSet = nodeToSet.get(rightNode);
    if (leftSet == rightSet) {
      return;
    }

    Set<Integer> leftNodes = setToNode.get(leftSet);
    Set<Integer> rightNodes = setToNode.get(rightSet);
    for (Integer node : rightNodes) {
      nodeToSet.put(node, leftSet);
      leftNodes.add(node);
    }
    setToNode.put(leftSet, leftNodes);
    setToNode.remove(rightSet);
  }
}
