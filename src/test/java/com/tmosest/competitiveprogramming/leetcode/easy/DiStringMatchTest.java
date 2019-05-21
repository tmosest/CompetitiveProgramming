package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("string")
@DisplayName("LeetCode: 942. DI String Match")
class DiStringMatchTest {
	/* Write code here. */

  DiStringMatch diStringMatch = new DiStringMatch();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] expected = {
        0,4,1,3,2
    };
    Assertions.assertArrayEquals(expected, diStringMatch.diStringMatch("IDID"));
  }


}
