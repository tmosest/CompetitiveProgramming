package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.LinkedList;
import java.util.List;

class MinimumSwapsToArrangeBinaryGrid {

  int minSwaps(int[][] grid) {
    int len = grid.length;
    int res = 0;
    List<Integer> row = new LinkedList<>();
    for (int i = 0; i < len; i++) {
      int trailingZeroCnt = 0;
      for (int j = len - 1; j > -1 && grid[i][j] == 0; j--) {
        trailingZeroCnt++;
      }
      row.add(trailingZeroCnt);
    }
    for (int curRowIdx = 0, minTrailingZeros = len - 1; curRowIdx < len;
        curRowIdx++, minTrailingZeros--) {
      int satisfiedRowIdx = curRowIdx;
      while (satisfiedRowIdx < len && row.get(satisfiedRowIdx) < minTrailingZeros) {
        satisfiedRowIdx++;
      }
      if (satisfiedRowIdx == len) {
        return -1;
      }
      int toRemove = row.remove(satisfiedRowIdx);
      row.add(curRowIdx, toRemove);
      res += satisfiedRowIdx - curRowIdx;
    }
    return res;
  }
}
