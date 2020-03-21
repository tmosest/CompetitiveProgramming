package com.tmosest.competitiveprogramming.leetcode.medium;

class CinemaSeatAllocation {

  int maxNumberOfFamilies(int rows, int[][] reservedSeats) {
    int fams = 0;

    boolean[][] reserved = new boolean[rows][10];

    for (int[] reservedSeat : reservedSeats) {
      reserved[reservedSeat[0] - 1][reservedSeat[1] - 1] = true;
    }

    for (int r = 0; r < rows; r++) {
      if (!reserved[r][1] && !reserved[r][2] && !reserved[r][3] && !reserved[r][4]) {
        ++fams;
        reserved[r][1] = true;
        reserved[r][2] = true;
        reserved[r][3] = true;
        reserved[r][2] = true;
      }

      if (!reserved[r][3] && !reserved[r][4] && !reserved[r][5] && !reserved[r][6]) {
        ++fams;
        reserved[r][3] = true;
        reserved[r][4] = true;
        reserved[r][5] = true;
        reserved[r][6] = true;
      }

      if (!reserved[r][5] && !reserved[r][6] && !reserved[r][7] && !reserved[r][8]) {
        ++fams;
        reserved[r][5] = true;
        reserved[r][6] = true;
        reserved[r][7] = true;
        reserved[r][8] = true;
      }
    }

    return fams;
  }
}
