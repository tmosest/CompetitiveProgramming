package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

class RestoreIpAddresses {

  static List<String> restoreIpAddresses(String str) {
    List<String> result = new ArrayList<>();
    int[] splitPosition = new int[5];
    splitPosition[4] = str.length();
    back(str, splitPosition, 0, result);
    return result;
  }

  static void back(String str, int[] splitPosition, int numOfJoin, List<String> result) {
    if (numOfJoin == 3) {
      if (splitPosition[3] >= str.length()) {
        return;
      }
      if (str.length() - splitPosition[3] > 3) {
        return;
      }
      String ip = "";
      for (int i = 0; i < 4; i++) {
        String temp = str.substring(splitPosition[i], splitPosition[i + 1]);
        if (temp.length() > 1 && temp.startsWith("0")) {
          return;
        }
        int tempNum = Integer.parseInt(temp);
        if (tempNum < 0 || tempNum > 255) {
          return;
        }
        ip += i == 3 ? temp : temp + ".";
      }

      result.add(ip);
      return;
    }

    for (int i = 1; i <= 3; i++) {
      splitPosition[numOfJoin + 1] = splitPosition[numOfJoin] + i;
      back(str, splitPosition, numOfJoin + 1, result);
      splitPosition[numOfJoin + 1] = 0;
    }
  }
}
