package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc301")
@DisplayName("LeetCode: 2335. Minimum Amount of Time to Fill Cups")
class MinimumAmountOfTimeToFillCupsTest {

  private MinimumAmountOfTimeToFillCups minimumAmountOfTimeToFillCups;

  @BeforeEach
  void setup() {
    minimumAmountOfTimeToFillCups = new MinimumAmountOfTimeToFillCups();
  }

  private void test(int output, int[] amount) {
    Assertions.assertEquals(output, minimumAmountOfTimeToFillCups.fillCups(amount));
  }

  @Test
  void test0() {
    test(4, new int[] {1,4,2});
  }
}
