package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1299. Replace Elements with Greatest Element on Right Side")
class ReplaceElementsWithGreatestElementOnRightSideTest {

  @Test
  void replaceElements_testCase0_isValid() {
    int[] arr = {17, 18, 5, 4, 6, 1};
    int[] expected = {18, 6, 6, 6, 1, -1};
    Assertions.assertArrayEquals(expected,
        new ReplaceElementsWithGreatestElementOnRightSide().replaceElements(arr));
  }
}
