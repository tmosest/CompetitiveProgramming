package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 1315. Sum of Nodes with Even Valued Grandparent")
class SumOfNodesWithEvenValuedGrandparentTest {

  private SumOfNodesWithEvenValuedGrandparent sumOfNodesWithEvenValuedGrandparent =
      new SumOfNodesWithEvenValuedGrandparent();

  @Test
  void testCase0() {
    Assertions.assertEquals(0, sumOfNodesWithEvenValuedGrandparent.sumEvenGrandparent(null));
  }
}
