package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@Tag("bwc23")
@DisplayName("LeetCode: 1399. Count Largest Group")
class CountLargestGroupTest {

  private CountLargestGroup countLargestGroup =
      new CountLargestGroup();

  @Test
  void testCase0() {
    Assertions.assertEquals(4, countLargestGroup.countLargestGroup(13));
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(2, countLargestGroup.countLargestGroup(2));
  }
}
