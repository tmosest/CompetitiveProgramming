package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@DisplayName("LeetCode: 1262. Greatest Sum Divisible by Three")
class GreatestSumDivisibleByThreeTest {

  private GreatestSumDivisibleByThree greatestSumDivisibleByThree =
      new GreatestSumDivisibleByThree();


  @Test
  void testCase0() {
    Assertions.assertEquals(18, greatestSumDivisibleByThree.maxSumDivThree(new int[] {
        3,6,5,1,8
    }));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(0, greatestSumDivisibleByThree.maxSumDivThree(new int[] {
        4
    }));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(12, greatestSumDivisibleByThree.maxSumDivThree(new int[] {
        1,2,3,4,4
    }));
  }
}
