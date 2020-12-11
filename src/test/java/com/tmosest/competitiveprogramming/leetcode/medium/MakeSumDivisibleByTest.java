package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("bwc35")
@DisplayName("LeetCode: 1590. Make Sum Divisible by P")
class MakeSumDivisibleByTest {

  private MakeSumDivisibleBy makeSumDivisibleBy;

  @BeforeEach
  void setup() {
    makeSumDivisibleBy = new MakeSumDivisibleBy();
  }

  private void test(int output, int[] nums, int sum) {
    Assertions.assertEquals(output, makeSumDivisibleBy.minSubarray(nums, sum));
  }

  @Test
  void test0() {
    test(1, new int[]{3, 1, 4, 2}, 6);
  }
}
