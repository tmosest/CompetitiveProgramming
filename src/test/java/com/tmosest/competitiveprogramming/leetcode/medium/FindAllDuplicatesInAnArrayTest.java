package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 442. Find All Duplicates in an Array")
class FindAllDuplicatesInAnArrayTest {

  private FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        4,3,2,7,8,2,3,1
    };
    Integer[] expected = {
        2,3
    };
    Assertions.assertEquals(Arrays.asList(expected), findAllDuplicatesInAnArray.findDuplicates(input));
  }
}
