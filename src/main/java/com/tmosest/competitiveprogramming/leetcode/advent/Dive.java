package com.tmosest.competitiveprogramming.leetcode.advent;

import java.util.List;

class Dive {

  long multiplyPosition(List<String> input, boolean withAim) {
    int[] pos = {0, 0};
    long aimDepth = 0;

    for (String line : input) {
      String[] cmdValue = line.split(" ");
      switch (cmdValue[0]) {
        case "up":
          pos[1] -= Integer.parseInt(cmdValue[1]);
          break;
        case "down":
          pos[1] += Integer.parseInt(cmdValue[1]);
          break;
        default:
          int forwardAmount = Integer.parseInt(cmdValue[1]);
          pos[0] += forwardAmount;
          aimDepth += (pos[1] * forwardAmount);
      }
    }

    return ((long) pos[0]) * (withAim ? aimDepth : ((long) pos[1]));
  }
}
