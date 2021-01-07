package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("greedy")
@Tag("wc221")
@DisplayName("LeetCode: 1705. Maximum Number of Eaten Apples")
class MaximumNumberOfEatenApplesTest {

  private MaximumNumberOfEatenApples maximumNumberOfEatenApples;

  @BeforeEach
  void setup() {
    maximumNumberOfEatenApples = new MaximumNumberOfEatenApples();
  }

  private void test(int output, int[] apples, int[] days) {
    Assertions.assertEquals(output, maximumNumberOfEatenApples.eatenApples(apples, days));
  }

  @Test
  void test0() {
    test(7, new int[]{1, 2, 3, 5, 2}, new int[]{3, 2, 1, 4, 2});
  }
}
