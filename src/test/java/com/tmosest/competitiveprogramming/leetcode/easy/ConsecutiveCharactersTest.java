package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("string")
@DisplayName("LeetCode: 1446. Consecutive Characters")
class ConsecutiveCharactersTest {

  private ConsecutiveCharacters consecutiveCharacters = new ConsecutiveCharacters();

  @Test
  void testCase0() {
    Assertions.assertEquals(2, consecutiveCharacters.maxPower("leetcode"));
  }
}
