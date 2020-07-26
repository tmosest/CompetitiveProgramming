package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc188")
@DisplayName("LeetCode: 1442. Count Triplets That Can Form Two Arrays of Equal XOR")
class CountTripletsThatCanFormTwoArraysOfEqualXorTest {

  private CountTripletsThatCanFormTwoArraysOfEqualXor countTripletsThatCanFormTwoArraysOfEqualXor =
      new CountTripletsThatCanFormTwoArraysOfEqualXor();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, countTripletsThatCanFormTwoArraysOfEqualXor.countTriplets(
        new int[]{2, 3, 1, 6, 7}
    ));
  }
}
