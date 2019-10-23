package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1207. Unique Number of Occurrences")
class UniqueNumberOfOccurrencesTest {

  private UniqueNumberOfOccurrences uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();

  @Test
  void testCase0() {
    int[] arr = {1, 2, 2, 1, 1, 3};
    Assertions.assertTrue(uniqueNumberOfOccurrences.uniqueOccurrences(arr));
  }
}
