package com.tmosest.competitiveprogramming.leetcode.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("hard")
@Tag("array")
@Tag("bwc39")
@DisplayName("LeetCode: 1655. Distribute Repeating Integers")
class DistributeRepeatingIntegersTest {

  private DistributeRepeatingIntegers distributeRepeatingIntegers = new DistributeRepeatingIntegers();

  @Test
  void test1() {
    Assertions.assertFalse(distributeRepeatingIntegers.canDistribute(
        new int[] {1,2,3,4},
        new int[] {2}
    ));
  }
}
