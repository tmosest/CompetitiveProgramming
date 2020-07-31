package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("wc175")
@DisplayName("LeetCode: 1346. Check If N and Its Double Exist")
class CheckIfAndItsDoubleExistTest {

  private CheckIfAndItsDoubleExist checkIfAndItsDoubleExist = new CheckIfAndItsDoubleExist();

  @Test
  void testCase0() {
    int[] input = {10,2,5,3};
    Assertions.assertTrue(checkIfAndItsDoubleExist.checkIfExist(input));
  }
}
