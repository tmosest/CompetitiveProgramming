package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1281. Subtract the Product and Sum of Digits of an Integer")
class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {

  private SubtractTheProductAndSumOfDigitsOfAnInteger subtractTheProductAndSumOfDigitsOfAnInteger = new SubtractTheProductAndSumOfDigitsOfAnInteger();

  @Test
  void testCase0() {
    Assertions.assertEquals(15, subtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(234));
  }
}
