package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@DisplayName("LeetCode: 78. Subsets")
class SubsetsTest {

  private Subsets subsets = new Subsets();

  @Test
  void testCase0() {
    int[] input = {
        1,2,3
    };
    for (List<Integer> list : subsets.subsets(input)) {
      System.out.println(list.toString());
    }
  }
}
