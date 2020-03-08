package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("wc179")
@DisplayName("LeetCode: 1374. Generate a String With Characters That Have Odd Counts")
class GenerateStringWithCharactersThatHaveOddCountsTest {

  private GenerateStringWithCharactersThatHaveOddCounts generateStringWithCharactersThatHaveOddCounts =
      new GenerateStringWithCharactersThatHaveOddCounts();

  @Test
  void testCase0() {
    Assertions.assertEquals("ba", generateStringWithCharactersThatHaveOddCounts.generateTheString(2));
  }
}
