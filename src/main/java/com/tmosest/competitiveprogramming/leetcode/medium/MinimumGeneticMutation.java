package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Hello world!
 */
class MinimumGeneticMutation {

  /**
   * Determine the minimum number of mutations needed to get to the end.
   *
   * @param start The starting genome.
   * @param end The ending genome.
   * @param bank The bank of valid genomes.
   * @return The minimum number of mutations needed.
   */
  int minMutation(String start, String end, String[] bank) {
    if (!Arrays.stream(bank).anyMatch(gene -> gene.equals(end))) {
      return -1;
    }
    Map<String, Integer> distanceMap = new HashMap<>();
    distanceMap.put(start, 0);
    Queue<String> queue = new LinkedList<>();
    queue.add(start);
    while (!queue.isEmpty()) {
      String current = queue.poll();
      int dist = distanceMap.get(current);
      if (current.equals(end)) {
        return dist;
      }
      for (String gene : bank) {
        if (!distanceMap.keySet().contains(gene) && isOneAway(current, gene)) {
          queue.add(gene);
          distanceMap.put(gene, dist + 1);
        }
      }
    }
    return -1;
  }

  private boolean isOneAway(String one, String two) {
    int diff = 0;
    for (int i = 0; i < one.length(); i++) {
      if (one.charAt(i) != two.charAt(i)) {
        ++diff;
      }
      if (diff > 1) {
        return false;
      }
    }
    return diff == 1;
  }
}
