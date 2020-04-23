package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("array")
@DisplayName("LeetCode: 1408. String Matching in an Array")
class StringMatchingInAnArrayTest {

  private StringMatchingInAnArray stringMatchingInAnArray = new StringMatchingInAnArray();

  @Test
  void testCase0() {
    Assertions.assertEquals(2, stringMatchingInAnArray.stringMatching(new String[] {
        "mass","as","hero","superhero"
    }).size());
  }

  @Test
  void testCase1() {
    Assertions.assertEquals(3, stringMatchingInAnArray.stringMatching(new String[] {
        "leetcoder","leetcode","od","hamlet","am"
    }).size());
  }
}
