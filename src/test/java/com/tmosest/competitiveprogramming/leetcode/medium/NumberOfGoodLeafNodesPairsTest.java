package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("wc199")
@DisplayName("LeetCode: 1530. Number of Good Leaf Nodes Pairs")
class NumberOfGoodLeafNodesPairsTest {

  private Codec codec = new Codec();
  private NumberOfGoodLeafNodesPairs numberOfGoodLeafNodesPairs = new NumberOfGoodLeafNodesPairs();

  @Test
  void test() {
    Assertions.assertEquals(1,
        numberOfGoodLeafNodesPairs.countPairs(codec.deserialize("[1,2,3,null,4]"), 3));
  }
}
