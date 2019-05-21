package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.NumArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 303. Range Sum Query - Immutable")
public class RangeSumQueryTest {

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] array = {0,1,2,3,4,5,6,7};
    NumArray numArray = new NumArray(array);
    Assertions.assertEquals(1, numArray.sumRange(0, 1));
  }
}
