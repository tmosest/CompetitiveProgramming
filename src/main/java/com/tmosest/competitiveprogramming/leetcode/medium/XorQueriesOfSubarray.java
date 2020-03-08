package com.tmosest.competitiveprogramming.leetcode.medium;

class XorQueriesOfSubarray {

  int[] xorQueries(int[] arr, int[][] queries) {
    int length = arr.length;
    int queryLength = queries.length;
    int[] prefix = new int[length];
    int[] out = new int[queryLength];

    prefix[0] = arr[0];
    for (int i = 1; i < length; ++i) {
      prefix[i] = prefix[i - 1] ^ arr[i];
    }

    for (int i = 0; i < queryLength; ++i) {
      int xor = (prefix[queries[i][1]] ^ prefix[queries[i][0]]) ^ arr[queries[i][0]];
      out[i] = xor;
    }
    return out;
  }
}
