package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@DisplayName("LeetCode: 1365. How Many Numbers Are Smaller Than the Current Number")
class HowManyNumbersAreSmallerThanTheCurrentNumberTest {

  private HowManyNumbersAreSmallerThanTheCurrentNumber howManyNumbersAreSmallerThanTheCurrentNumber =
      new HowManyNumbersAreSmallerThanTheCurrentNumber();

  @Test
  void testCase0() {
    int[] input = {8,1,2,2,3};
    int[] output = {4,0,1,1,3};
    Assertions.assertArrayEquals(output, howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input));
  }
}
