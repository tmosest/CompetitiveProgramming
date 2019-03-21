package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("array")
@Tag("medium")
@DisplayName("LeetCode: 46. Permutations")
public class PermutationsTest {

  Permutations permutations = new Permutations();

  @Test
  @DisplayName("Test Case 0")
  void testCase0() {
    int[] input = {
        1,2,3
    };
    Integer[][] actualMatrix = {
        {1,2,3},
        {1,3,2},
        {2,1,3},
        {2,3,1},
        {3,1,2},
        {3,2,1}
    };
    List<List<Integer>> expected = new ArrayList<>();
    for (Integer[] array : actualMatrix) {
      expected.add(Arrays.asList(array));
    }
    List<List<Integer>> actual = permutations.permute(input);
    Assertions.assertEquals(expected.size(), actual.size());
    // TODO use something to get this working...
    for (List<Integer> list : actual) {
      Assertions.assertEquals(input.length, list.size());
    }
  }
}
