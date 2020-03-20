package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class QueensThatCanAttackTheKing {

  List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
    List<List<Integer>> ans = new ArrayList<>();
    int[][] dir = {{-1, 0}, {0, -1}, {-1, -1}, {-1, 1}, {1, 0}, {0, 1}, {1, 1}, {1, -1}};
    boolean[][] queen = new boolean[8][8];

    for (int i = 0; i < queens.length; i++) {
      int row = queens[i][0];
      int col = queens[i][1];
      queen[row][col] = true;
    }

    for (int i = 0; i < dir.length; i++) {
      for (int rad = 1; rad < 8; rad++) {
        int nx = king[0] + rad * dir[i][0];
        int ny = king[1] + rad * dir[i][1];
        if (nx < 0 || ny < 0 || nx > 7 || ny > 7) {
          break;
        }
        if (queen[nx][ny]) {
          List<Integer> smans = new ArrayList<>();
          smans.add(nx);
          smans.add(ny);
          ans.add(smans);
          break;
        }
      }

    }
    return ans;
  }
}
