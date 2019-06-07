package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 89. Gray Code")
class GrayCodeTest {

  private GrayCode grayCode = new GrayCode();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[] output = {
        0,1,3,2
    };
    List<Integer> expected = Arrays.asList(output);
    Assertions.assertEquals(expected, grayCode.grayCode(2));
  }
}
