package com.tmosest.competitiveprogramming.leetcode;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("LeetCode: 15. 3Sum")
public class ThreeSumTest {
  @Test
  @DisplayName("Test Case 0")
  void test0() throws UnsupportedEncodingException {
    List<List<Integer>> expected = new ArrayList<>();
    List<Integer> row = Arrays.asList(-1, 0, 1);
    expected.add(row);
    row = Arrays.asList(-1, -1, 2);
    expected.add(row);

    int[] nums = {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> actual = ThreeSum.threeSum(nums);


    Assertions.assertEquals(actual.size(), expected.size());
    for (List<Integer> list : actual) {
      int sum = 0;
      for (Integer i : list) {
        sum += i;
      }
      Assertions.assertEquals(sum, 0);
    }
  }

  @Test
  @DisplayName("Test Case 1")
  void test1() throws UnsupportedEncodingException {

    int[] nums = {3,0,-2,-1,1,2};
    List<List<Integer>> actual = ThreeSum.threeSum(nums);

    Assertions.assertEquals(actual.size(), 3);
    for (List<Integer> list : actual) {
      int sum = 0;
      for (Integer i : list) {
        sum += i;
      }
      Assertions.assertEquals(sum, 0);
    }
  }
}
