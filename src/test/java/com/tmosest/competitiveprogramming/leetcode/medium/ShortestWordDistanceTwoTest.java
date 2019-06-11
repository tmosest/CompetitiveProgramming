package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 244. Shortest Word Distance II")
class ShortestWordDistanceTwoTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String[] words = {
        "practice", "makes", "perfect", "coding", "makes"
    };
    ShortestWordDistanceTwo shortestWordDistanceTwo = new ShortestWordDistanceTwo(words);
    Assertions.assertEquals(3, shortestWordDistanceTwo.shortest("coding", "practice"));
    Assertions.assertEquals(1, shortestWordDistanceTwo.shortest("coding", "makes"));
  }
}
