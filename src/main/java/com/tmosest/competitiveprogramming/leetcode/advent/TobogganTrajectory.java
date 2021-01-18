package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.List;

class TobogganTrajectory {

  int countIntersectingTrees(List<String> inputs, int right, int down) {
    return RightRepeatingMap.fromLines(inputs).countTrees(right, down);
  }

  long multiplyIntersectingTrees(List<String> inputs, int[][] slopes) {
    if (slopes == null || slopes.length < 1) {
      return -1;
    }

    RightRepeatingMap rightRepeatingMap = RightRepeatingMap.fromLines(inputs);

    long mult = 1L;
    for (int[] slope : slopes) {
      if (slope.length != 2) {
        continue;
      }
      mult *= rightRepeatingMap.countTrees(slope[0], slope[1]);
    }

    return mult;
  }

  private static class RightRepeatingMap {

    private static char TREE = '#';
    private char[][] map;

    private RightRepeatingMap(char[][] map) {
      this.map = map;
    }

    private static RightRepeatingMap fromLines(List<String> lines) {
      char[][] map = new char[lines.size()][lines.get(0).length()];

      for (int i = 0; i < map.length; i++) {
        char[] line = lines.get(i).toCharArray();
        map[i] = line;
      }

      return new RightRepeatingMap(map);
    }

    private int countTrees(int right, int down) {
      int trees = 0;

      int[] pos = new int[]{0, 0};

      while (pos[0] < map.length) {
        char spot = map[pos[0]][pos[1]];
        if (spot == TREE) {
          trees++;
        }
        pos[1] += right;
        pos[1] %= map[0].length;
        pos[0] += down;
      }

      return trees;
    }
  }
}
