package com.tmosest.competitiveprogramming.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("easy")
@Tag("array")
@Tag("wc192")
@DisplayName("LeetCode: 1470. Shuffle the Array")
class ShuffleTheArrayTest {

  private ShuffleTheArray shuffleTheArray = new ShuffleTheArray();

  private void test(int[] nums, int size, int[] expected) {
    Assertions.assertArrayEquals(expected, shuffleTheArray.shuffle(nums, size));
  }

  @Test
  void testCase0() {
    test(new int[] {2,5,1,3,4,7}, 3, new int[] {2,3,5,4,1,7});
  }

  @Test
  void testCase1() {
    test(new int[] {1,2,3,4,4,3,2,1}, 4, new int[] {1,4,2,3,3,2,4,1});
  }

  @Test
  void testCase2() {
    test(new int[] {1,1,2,2}, 2, new int[] {1,2,1,2});
  }
}
