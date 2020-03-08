package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1310. XOR Queries of a Subarray")
class XorQueriesOfSubarrayTest {

  private XorQueriesOfSubarray xorQueriesOfSubarray =
      new XorQueriesOfSubarray();

  @Test
  void testCase0() {
    int[] arr = {1,3,4,8};
    int[][] queries = {{0,1},{1,2},{0,3},{3,3}};
    int[] expected = {2,7,14,8};
    Assertions.assertArrayEquals(expected, xorQueriesOfSubarray.xorQueries(arr, queries));
  }
}
