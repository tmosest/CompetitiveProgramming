package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;

class DefuseTheBomb {

  int[] decrypt(int[] code, int diff) {
    if (diff == 0) {
      Arrays.fill(code, 0);
    } else {
      int dir = diff > 0 ? 1 : -1;
      int sum = 0;
      // calculate first sum
      for (int i = 0; i < dir * diff; i++) {
        int idx = (dir * (i + 1) + code.length) % code.length;
        sum += code[idx];
      }
      // use upper bits to save sum
      code[0] += sum * 1000;
      for (int i = 1; i < code.length; i++) {
        int newIdx;
        if (dir > 0) {
          // exclude self
          sum -= code[i];
          newIdx = (i + diff) % code.length;
          sum += code[newIdx] % 1000;
        } else {
          sum += code[(i - 1 + code.length) % code.length] % 1000;
          // k is negative
          newIdx = (i - 1 + diff + code.length) % code.length;
          sum -= code[newIdx] % 1000;
        }
        code[i] += sum * 1000;
      }
      // keep sums
      for (int i = 0; i < code.length; i++) {
        code[i] /= 1000;
      }
    }
    return code;
  }
}
