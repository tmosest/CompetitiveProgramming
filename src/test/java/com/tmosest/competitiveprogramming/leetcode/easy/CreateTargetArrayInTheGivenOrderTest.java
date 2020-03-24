package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1389. Create Target Array in the Given Order")
class CreateTargetArrayInTheGivenOrderTest {

  private CreateTargetArrayInTheGivenOrder createTargetArrayInTheGivenOrder =
      new CreateTargetArrayInTheGivenOrder();

  @Test
  void testCase0() {
    Assertions.assertArrayEquals(
        new int[]{0, 4, 1, 3, 2},
        createTargetArrayInTheGivenOrder.createTargetArray(
            new int[]{0, 1, 2, 3, 4},
            new int[]{0, 1, 2, 2, 1}
        )
    );
  }
}
