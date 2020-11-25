package com.tmosest.competitiveprogramming.leetcode.easy;

class CrawlerLogFolder {

  int minOperations(String[] logs) {
    int len = logs.length;
    int sum = 0;
    for (int i = 0; i < len; ++i) {
      if (logs[i].equals("../")) {
        if (sum > 0) {
          sum--;
        }
        continue;
      }
      if (logs[i].equals("./")) {
        continue;
      }
      sum++;
    }
    return sum;
  }
}
