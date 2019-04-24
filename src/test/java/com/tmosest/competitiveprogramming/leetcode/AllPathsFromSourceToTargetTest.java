package com.tmosest.competitiveprogramming.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

@Tag("leetcode")
@Tag("medium")
@Tag("graph")
@Tag("matrix")
@DisplayName("LeetCode: 797. All Paths From Source to Target")
class AllPathsFromSourceToTargetTest {

  private AllPathsFromSourceToTarget allPathsFromSourceToTarget = new AllPathsFromSourceToTarget();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[][] input = {
        {1,2}, {3}, {3}, {}
    };
    Integer[][] output = {
        {0,1,3},{0,2,3}
    };
    List<List<Integer>> expected = new LinkedList<>();
    for (Integer[] arr : output) {
      expected.add(Arrays.asList(arr));
    }
    List<List<Integer>> actual = allPathsFromSourceToTarget.allPathsSourceTarget(input);
    Assertions.assertEquals(expected.size(), actual.size());
    for (int i = 0; i < expected.size(); i++) {
      Assertions.assertEquals(expected.get(i), actual.get(i));
    }
  }
}
