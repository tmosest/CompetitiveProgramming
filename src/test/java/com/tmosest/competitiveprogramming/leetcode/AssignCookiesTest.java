package com.tmosest.competitiveprogramming.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@DisplayName("LeetCode: 455. Assign Cookies")
public class AssignCookiesTest {

  AssignCookies assignCookies = new AssignCookies();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3
    };
    int[] moreInput = {
        1,1
    };
    Assertions.assertEquals(1, assignCookies.findContentChildren(input, moreInput));
  }
}
