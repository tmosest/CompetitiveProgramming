package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc182")
@DisplayName("LeetCode: 1394. Find Lucky Integer in an Array")
class FindLuckyIntegerInAnArrayTest {

  private FindLuckyIntegerInAnArray findLuckyIntegerInAnArray =
      new FindLuckyIntegerInAnArray();

  @Test
  void testCase0() {
    Assertions.assertEquals(
        2,
        findLuckyIntegerInAnArray.findLucky(
            new int[]{2, 2, 3, 4}
        )
    );
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(
        -1,
        findLuckyIntegerInAnArray.findLucky(
            new int[]{2, 3, 4}
        )
    );
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(
        3,
        findLuckyIntegerInAnArray.findLucky(
            new int[]{1, 2, 2, 3, 3, 3}
        )
    );
  }
}
