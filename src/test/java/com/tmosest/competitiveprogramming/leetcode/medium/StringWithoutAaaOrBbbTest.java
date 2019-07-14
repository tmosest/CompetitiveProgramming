package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 984. String Without AAA or BBB")
class StringWithoutAaaOrBbbTest {

  private StringWithoutAaaOrBbb stringWithoutAaaOrBbb = new StringWithoutAaaOrBbb();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Assertions.assertNotEquals("", stringWithoutAaaOrBbb.strWithout3a3b(1,2));
  }
}
