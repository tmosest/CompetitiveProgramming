package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("number")
@DisplayName("LeetCode: 970. Powerful Integers")
class PowerfulIntegersTest {
	/* Write code here. */

  PowerfulIntegers powerfulIntegers = new PowerfulIntegers();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    Integer[] result = { 2,3,4,5,7,9,10 };
    List<Integer> expected = Arrays.asList(result);
    List<Integer> actual = powerfulIntegers.powerfulIntegers(2, 3, 10);
    Collections.sort(actual);

    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }


}
