package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1103. Distribute Candies to People")
class DistributeCandiesToPeopleTest {

  private DistributeCandiesToPeople distributeCandiesToPeople = new DistributeCandiesToPeople();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] expected = {
        1,2,3,1
    };
    Assertions.assertArrayEquals(expected, distributeCandiesToPeople.distributeCandies(7, 4));
  }
}
