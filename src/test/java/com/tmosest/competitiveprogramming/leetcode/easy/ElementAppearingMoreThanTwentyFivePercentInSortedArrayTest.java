package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1287. Element Appearing More Than 25% In Sorted Array")
class ElementAppearingMoreThanTwentyFivePercentInSortedArrayTest {

  @Test
  void findSpecialInteger_testCase0_returns6() {
    int[] arr = {1,2,2,6,6,6,6,7,10};
    Assertions.assertEquals(6, new ElementAppearingMoreThanTwentyFivePercentInSortedArray().findSpecialInteger(arr));
  }
}
