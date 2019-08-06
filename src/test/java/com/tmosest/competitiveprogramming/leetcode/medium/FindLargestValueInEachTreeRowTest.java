package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 515. Find Largest Value in Each Tree Row")
class FindLargestValueInEachTreeRowTest {

  private Codec codec = new Codec();
  private FindLargestValueInEachTreeRow findLargestValueInEachTreeRow = new FindLargestValueInEachTreeRow();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    String tree = "[1,3,2,5,3,null,9]";
    Integer[] expected = {1,3 ,9};
    Assertions.assertEquals(Arrays.asList(expected), findLargestValueInEachTreeRow.largestValues(codec.deserialize(tree)));
  }
}
