package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 985. Sum of Even Numbers After Queries")
class SumOfEvenNumbersAfterQueriesTest {
	/* Write code here. */

  SumOfEvenNumbersAfterQueries sumOfEvenNumbersAfterQueries = new SumOfEvenNumbersAfterQueries();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {1,2,3,4};
    int[][] queiries = {
        {1,0},{-3,1},{-4,0},{2,3}
    };
    int[] expected = {8,6,2,4};
    Assertions.assertArrayEquals(expected, sumOfEvenNumbersAfterQueries.sumEvenAfterQueries(input, queiries));
  }


}
