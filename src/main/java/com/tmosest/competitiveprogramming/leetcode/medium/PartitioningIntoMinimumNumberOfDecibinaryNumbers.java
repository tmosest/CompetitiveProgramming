package com.tmosest.competitiveprogramming.leetcode.medium;

class PartitioningIntoMinimumNumberOfDecibinaryNumbers {

  int minPartitions(String num) {
    int res = 0;
    for (int i = 0; i < num.length(); ++i) {
      res = Math.max(res, num.charAt(i) - '0');
    }
    return res;
  }
}
