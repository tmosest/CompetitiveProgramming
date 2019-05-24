package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 39. Combination Sum")
class CombinationSumTest {

  private CombinationSum combinationSum = new CombinationSum();

  private void test(int[] candidates, int target, Integer[][] expected) {
    List<List<Integer>> actualList = combinationSum.combinationSum(candidates, target);
    List<List<Integer>> expectedList = new ArrayList<>();
    for (Integer[] row : expected) {
      expectedList.add(Arrays.asList(row));
    }
    Assertions.assertEquals(expectedList, actualList);
  }

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] set = {
        2,3,6,7
    };
    Integer[][] expected = {
        { 7 },
        { 2, 2, 3 }
    };
    test(set, 7, expected);
  }

  @Test
  @DisplayName("Test Case 1")
  void testCase1() {
    int[] set = {
        2,3,5
    };
    Integer[][] expected = {
        {3,5},
        {2,3,3},
        {2,2,2,2}
    };
    test(set, 8, expected);
  }
}
