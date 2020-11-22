package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("string")
@Tag("wc216")
@DisplayName("LeetCode: 1663. Smallest String With A Given Numeric Value")
class SmallestStringWithGivenNumericValueTest {

  private SmallestStringWithGivenNumericValue smallestStringWithGivenNumericValue = new SmallestStringWithGivenNumericValue();

  private void test(String expected, int length, int sum) {
    Assertions.assertEquals(expected,
        smallestStringWithGivenNumericValue.getSmallestString(length, sum));
  }

  @Test
  void test1() {
    test("aay", 3, 27);
  }

  @Test
  void test2() {
    test("aaszz", 5, 73);
  }
}
