package com.tmosest.competitiveprogramming.leetcode.medium;

class AlphabetBoardPath {

  String alphabetBoardPath(String target) {
    int[][] board = new int[26][2];
    int row = 0;
    int col = 0;
    for (int i = 0; i < 26; i++) {
      board[i] = new int[]{row, col};
      if ((i + 1) % 5 == 0) {
        row++;
        col = 0;
      } else {
        col++;
      }
    }
    row = 0;
    col = 0;

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < target.length(); i++) {
      char ch = target.charAt(i);
      int[] arr = board[ch - 'a'];
      int rdist = Math.abs(arr[0] - row);
      int cdist = Math.abs(arr[1] - col);
      if (ch == 'z') {
        rdist--;
      }

      if (row > arr[0]) {
        for (int j = 0; j < rdist; j++) {
          sb.append('U');
        }
      } else {
        for (int j = 0; j < rdist; j++) {
          sb.append('D');
        }
      }
      if (col > arr[1]) {
        for (int j = 0; j < cdist; j++) {
          sb.append('L');
        }
      } else {
        for (int j = 0; j < cdist; j++) {
          sb.append('R');
        }
      }

      if (ch == 'z') {
        if (row > arr[0]) {
          sb.append('U');
        } else if (row < arr[0]) {
          sb.append('D');
        }
      }
      sb.append('!');

      row = arr[0];
      col = arr[1];
    }

    return sb.toString();
  }
}
