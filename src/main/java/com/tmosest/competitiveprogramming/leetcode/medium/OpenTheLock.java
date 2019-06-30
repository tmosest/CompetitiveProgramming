package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class OpenTheLock {

  private class CombinationFactory {

    private Set<String> deadEnds;

    private CombinationFactory(String[] deadends) {
      deadEnds = new HashSet<>();
      deadEnds.addAll(Arrays.asList(deadends));
    }

    private List<Combination> generateNextMoves(Combination combo) {
      List<Combination> moves = new ArrayList<>();

      if (deadEnds.contains(combo.combination)) {
        return moves;

      }
      int len = combo.combination.length();
      for (int i = 0; i < len; i++) {
        int digit = (int) combo.combination.charAt(i) - '0';
        String prefix = combo.combination.substring(0, i);
        String up = prefix + (digit > 8 ? 0 : digit + 1);
        String down = prefix + (digit < 1 ? 9 : digit - 1);
        if (i < len - 1) {
          up += combo.combination.substring(i + 1, len);
          down += combo.combination.substring(i + 1, len);
        }
        if (!deadEnds.contains(up)) {
          moves.add(new Combination(up, combo.movesAway + 1));
        }
        if (!deadEnds.contains(down)) {
          moves.add(new Combination(down, combo.movesAway + 1));
        }
      }

      return moves;
    }
  }

  private class Combination {
    String combination;
    int movesAway;

    private Combination(String combination, int movesAway) {
      this.combination = combination;
      this.movesAway = movesAway;
    }
  }

  /**
   * Determine if we can open the lock.
   *
   * @param deadends The dead-end combinations.
   * @param target The target code.
   * @return The minimum number of moves needed or -1.
   */
  int openLock(String[] deadends, String target) {
    Set<String> visited = new HashSet<>();
    CombinationFactory combinationFactory = new CombinationFactory(deadends);
    Queue<Combination> queue = new LinkedList<>();
    queue.add(new Combination("0000", 0));
    while (!queue.isEmpty()) {
      Combination combination = queue.poll();

      if (combination.combination.equals(target)) {
        return combination.movesAway;
      }

      if (visited.contains(combination.combination)) {
        continue;
      }

      visited.add(combination.combination);

      List<Combination> moves = combinationFactory.generateNextMoves(combination);
      queue.addAll(moves);
    }
    return -1;
  }
}
