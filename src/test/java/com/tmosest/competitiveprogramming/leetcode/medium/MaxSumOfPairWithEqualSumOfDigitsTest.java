package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc302")
@DisplayName("LeetCode: 2342. Max Sum of a Pair With Equal Sum of Digits")
class MaxSumOfPairWithEqualSumOfDigitsTest {

  private MaxSumOfPairWithEqualSumOfDigits maxSumOfPairWithEqualSumOfDigits;

  @BeforeEach
  void setup() {
    maxSumOfPairWithEqualSumOfDigits = new MaxSumOfPairWithEqualSumOfDigits();
  }

  private void test(int output, int[] nums) {
    Assertions.assertEquals(output, maxSumOfPairWithEqualSumOfDigits.maximumSum(nums));
  }

  @Test
  void test0() {
    test(54, new int[]{18, 43, 36, 13, 7});
  }

  @Test
  void test1() {
    test(-1, new int[]{10, 12, 19, 14});
  }

  @Test
  void test2() {
    test(973,
        new int[]{229, 398, 269, 317, 420, 464, 491, 218, 439, 153, 482, 169, 411, 93, 147, 50, 347,
            210, 251, 366, 401});
  }
}
