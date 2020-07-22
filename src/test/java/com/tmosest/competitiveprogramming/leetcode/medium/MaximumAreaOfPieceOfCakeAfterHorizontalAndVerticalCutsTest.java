package com.tmosest.competitiveprogramming.leetcode.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("leetcode")
@Tag("medium")
@Tag("array")
@Tag("wc191")
@DisplayName("LeetCode: 1465. Maximum Area of a Piece of Cake After Horizontal and Vertical Cuts")
class MaximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCutsTest {

  private MaximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCuts maximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCuts =
      new MaximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCuts();

  private void test(int height, int width, int[] horizontalCuts, int[] verticalCuts, int out) {
    Assertions.assertEquals(out, maximumAreaOfPieceOfCakeAfterHorizontalAndVerticalCuts.maxArea(
        height, width, horizontalCuts, verticalCuts
    ));
  }

  @Test
  void testCase0() {
    test(5, 4, new int[] {1,2,4}, new int[] {1,3}, 4);
  }

  @Test
  void testCase1() {
    test(5, 4, new int[] {3,1}, new int[] {1}, 6);
  }

  @Test
  void testCase2() {
    test(5, 4, new int[] {3}, new int[] {3}, 9);
  }
}
