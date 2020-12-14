package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@Tag("bwc41")
@Tag("array")
@DisplayName("LeetCode: 1684. Count the Number of Consistent Strings")
class CountTheNumberOfConsistentStringsTest {

  private CountTheNumberOfConsistentStrings countTheNumberOfConsistentStrings;

  @BeforeEach
  void setup() {
    countTheNumberOfConsistentStrings = new CountTheNumberOfConsistentStrings();
  }

  private void test(int output, String allowed, String[] words) {
    Assertions.assertEquals(output,
        countTheNumberOfConsistentStrings.countConsistentStrings(allowed, words));
  }

  @Test
  void test0() {
    test(2, "ab", new String[] { "ad","bd","aaab","baa","badab" });
  }
}
