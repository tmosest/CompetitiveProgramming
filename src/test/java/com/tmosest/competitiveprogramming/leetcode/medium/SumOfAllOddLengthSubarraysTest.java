package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("bwc35")
@DisplayName("LeetCode: 1588. Sum of All Odd Length Subarrays")
class SumOfAllOddLengthSubarraysTest {

  private SumOfAllOddLengthSubarrays sumOfAllOddLengthSubarrays;

  @BeforeEach
  void setup() {
    sumOfAllOddLengthSubarrays = new SumOfAllOddLengthSubarrays();
  }

  private void test(int output, int[] arr) {
    Assertions.assertEquals(output, sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(arr));
  }

  @Test
  void test0() {
    test(58, new int[] {1, 4, 2, 5, 3});
  }
}
