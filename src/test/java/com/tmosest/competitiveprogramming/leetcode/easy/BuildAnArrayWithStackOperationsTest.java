package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc188")
@DisplayName("LeetCode: 1441. Build an Array With Stack Operations")
class BuildAnArrayWithStackOperationsTest {

  private BuildAnArrayWithStackOperations buildAnArrayWithStackOperations = new BuildAnArrayWithStackOperations();

  @Test
  void testCase0() {
    String[] expected = {"Push","Push","Pop","Push"};
    Assertions.assertEquals(Arrays.asList(expected),
        buildAnArrayWithStackOperations.buildArray(new int[] {1,3}, 3));
  }
}
