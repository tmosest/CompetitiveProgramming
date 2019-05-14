package com.tmosest.competitiveprogramming.leetcode.easy;

class SumOfEvenNumbersAfterQueries {
  /* Write code here. */

  /**
   * Find sum of even numbers after an array queries.
   *
   * @param input The input array.
   * @param queries An array of queries.
   * @return An array of results after queries.
   */
  public int[] sumEvenAfterQueries(int[] input, int[][] queries) {
    int[] results = new int[queries.length];
    int sum = 0;
    for (int i : input) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    for (int i = 0; i < queries.length; i++) {
      int[] query = queries[i];
      int value = query[0];
      int index = query[1];
      if (input[index] % 2 == 0) {
        sum -= input[index];
      }
      input[index] += value;
      if (input[index] % 2 == 0) {
        sum += input[index];
      }
      results[i] = sum;
    }
    return results;
  }


}
