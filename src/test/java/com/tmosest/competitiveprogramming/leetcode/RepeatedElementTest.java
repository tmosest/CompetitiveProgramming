package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 961. N-Repeated Element in Size 2N Array")
public class RepeatedElementTest {

  RepeatedElement repeatedElement = new RepeatedElement();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3,3
    };
    Assertions.assertEquals(3, repeatedElement.repeatedNTimes(input));
  }
}
