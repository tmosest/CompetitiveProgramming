package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc186")
@DisplayName("LeetCode: 1423. Maximum Points You Can Obtain from Cards")
class MaximumPointsYouCanObtainFromCardsTest {

  private MaximumPointsYouCanObtainFromCards maximumPointsYouCanObtainFromCards =
      new MaximumPointsYouCanObtainFromCards();

  @Test
  void testCase0() {
    Assertions.assertEquals(12, maximumPointsYouCanObtainFromCards.maxScore(
        new int[]{
            1, 2, 3, 4, 5, 6, 1
        },
        3
    ));
  }
}
