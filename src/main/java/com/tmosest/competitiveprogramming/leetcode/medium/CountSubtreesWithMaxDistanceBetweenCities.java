package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class CountSubtreesWithMaxDistanceBetweenCities {

  private int max = 0;

  int[] countSubgraphsForEachDiameter(int size, int[][] edges) {
    int[] result = new int[size - 1];
    // build graph
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for (int[] e : edges) {
      graph.computeIfAbsent(e[0], (val) -> (new ArrayList<>())).add(e[1]);
      graph.computeIfAbsent(e[1], (val) -> (new ArrayList<>())).add(e[0]);
    }

    // Get all the valid subtrees/subsets
    for (int i = 0; i < (1 << size); i++) {
      List<Integer> subtree = new ArrayList<>();
      // use bitmasking to construct every single subset/subtree
      for (int j = 0; j < size; j++) {
        // this bit is 1, means this node is chosen
        if ((i & (1 << j)) != 0) {
          subtree.add(j + 1); // cities numbered from 1
        }
      }

      // now we need to evaluate if this subtree is valid
      int edgeNumber = 0;
      for (int[] e : edges) {
        if (subtree.contains(e[0]) && subtree.contains(e[1])) {
          edgeNumber++;
        }
      }

      if (edgeNumber < 1 || subtree.size() != edgeNumber + 1) {
        continue; // not valid subtree
      }

      // till here, we have a valid subtree, and we need to use DFS to get the max diameter
      Set<Integer> visited = new HashSet<>();
      max = 0;
      visited.add(subtree.get(0));
      dfs(subtree.get(0), graph, subtree, visited);
      result[max - 1]++;
    }

    return result;
  }

  private int dfs(int current, Map<Integer, List<Integer>> graph, List<Integer> subtree,
      Set<Integer> visited) {

    int tmp1 = 0;
    int tmp2 = 0;

    for (int neighbor : graph.get(current)) {
      if (!visited.contains(neighbor) && subtree.contains(neighbor)) {
        visited.add(neighbor);
        int depth = dfs(neighbor, graph, subtree, visited);
        if (depth > tmp1) {
          tmp2 = tmp1;
          tmp1 = depth;
        } else if (depth > tmp2) {
          tmp2 = depth;
        }
      }

    }

    max = Math.max(max, tmp1 + tmp2);
    return tmp1 + 1;
  }
}
