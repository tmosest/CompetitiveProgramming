package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc196")
@DisplayName("LeetCode: 1498. Number of Subsequences That Satisfy the Given Sum Condition")
class NumberOfSubsequencesThatSatisfyTheGivenSumConditionTest {

  private NumberOfSubsequencesThatSatisfyTheGivenSumCondition numberOfSubsequencesThatSatisfyTheGivenSumCondition =
      new NumberOfSubsequencesThatSatisfyTheGivenSumCondition();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, numberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(
        new int[]{3,5,6,7}, 9
    ));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(6, numberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(
        new int[]{3,3,6,8}, 10
    ));
  }

  @Test
  void testCase2() {
    Assertions.assertEquals(61, numberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(
        new int[]{2,3,3,4,6,7}, 12
    ));
  }

  @Test
  void testCase3() {
    Assertions.assertEquals(127, numberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(
        new int[]{5,2,4,1,7,6,8}, 16
    ));
  }
}
